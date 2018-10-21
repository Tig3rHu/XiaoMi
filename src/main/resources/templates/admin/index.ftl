<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>XiaoMi系统管理后台</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">XiaoMi系统管理后台</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <#list sysMenus as menu>
          <li class="layui-nav-item"><a href="javasscript:;" onclick="getChildren('${menu.id}')">${menu.name}</a></li>
      </#list>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          tigerOrtiger
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="leftMenus" id="leftMenus">
        <#list leftMenus as menu>
         
          <li class="layui-nav-item">
            <a href="javascript:;">${menu.name}</a>
              <dl class="layui-nav-child">
             <#list menu.children as sub>
              <dd><a href="${base}${sub.url}" target="main">${sub.name}</a></dd>
             
             </#list>
             </dl>
          </li>
        </#list>
    
      </ul>
    </div>
  </div>
  
  <div class="layui-body" style="top:70px;left:220px">
    <!-- 内容主体区域 -->
    <div style="padding: 10px 10px 0 0;">
     <iframe id="main" name="main" width="100%" style="min-height: 500px;" frameborder="no" border="0" marginwidth="0" marginheight="0"
					scrolling="yes" allowtransparency="yes" >
     
     
 
     </iframe>
    
    
    </div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © tigerOrtiger.com - 底部固定区域
  </div>
</div>
<script src="${base}/static/js/plugins/layui/layui.js"></script>
<script>
//JavaScript代码区域

var $=null;
var layer=null;
var element=null;
layui.use(['jquery','element','layer'], function(){
   element = layui.element;
  $=layui.$ ;
  layer=layui.layer;
  
  
  
}); 


function getChildren(id){
	$("#leftMenus").empty();
	
    $.get("${base}/api/menu/getchildren/"+id,function(res){
    	var html="";
    	$.each(res,function(i,v){
    		
    		html+="<li class='layui-nav-item'>";
    		html+="<a href='javascript:;'>"+v.name+"</a>";
    		html+="<dl class='layui-nav-child'>";
    			$.each(v.children,function(idx,vo){
    				
    				html+="<dd><a href='"+${base}vo.url+"' target='main'>"+vo.name+"</a></dd>";
    			});
    			
    		html+="</dl></li>";
    		
    	});
    	
    	$("#leftMenus").append(html);
    	//append动态添加菜单，效果没有，可以使用element.render()进行重新渲染，element可以是其他对象
    	element.render(null,'leftMenus');
    	
    },'json');
	
}
</script>
</body>
</html>