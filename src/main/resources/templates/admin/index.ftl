<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>XiaoMi系统管理后台</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <style type="text/css">
     .layui-body div{
        
     }
  </style>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">XiaoMi系统管理后台</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <#list sysMenus as sysMenus>
          <li class="layui-nav-item"><a href="javasscript:;" onclick="getChildren('${sysMenus.modId}')">${sysMenus.title}</a></li>
      </#list>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">       
          ${admin.userName !}        
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料<span class="layui-badge-dot"></span> </a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="${base}/admin/loginout">退出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="leftMenus" id="leftMenus">
       <#list menuList as menu>
         
          <li class="layui-nav-item">
            <a href="javascript:;">${menu.title}</a>
              <dl class="layui-nav-child">
             <#list menu.children as sub>
              <dd><a href="${base}/${sub.controller}/${sub.action}" target="mainContent">${sub.title}</a></dd>
             
             </#list>
             </dl>
          </li>
        </#list>
      </ul>
    </div>
  </div>
  
  <div class="layui-body" style="top:34px;left:200px">
    <!-- 内容主体区域 -->
    <div style="padding: 26px 0px 0 0;">  
    <iframe id="mainContent" name="mainContent" width="100%" style="min-height: 700px;padding-top:0px;" frameborder="no" border="0" marginwidth="0" marginheight="0"
					scrolling="yes" allowtransparency="yes" src="${base}/admin/towelcome">
           

   
     </iframe> 
   
    
    </div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © tigerOrtiger.com - 底部固定区域
  </div>
</div>
<script src="${base}/static/js/layui/layui.js"></script>
<script>
   var $=null;
   var layer=null;
   var element=null;
   layui.use(['jquery','element','layer'], function(){
       element = layui.element;
       $=layui.$ ;
  layer=layui.layer; 
 





   });  
   function getChildren(modId){
		//console.log(modId);
		$("#leftMenus").empty();
		
	    $.get("${base}/api/getchildren/"+modId,function(res){
	    	var html="";
	    	$.each(res,function(i,v){
	    		//console.log(v.controller);    		    		
	    	    html+="<li class='layui-nav-item'>";
	    		html+="<a href='"+"${base}"+"/"+v.controller+"/"+v.action+"' target='mainContent'>"+v.title+"</a>";  			
	    		html+="</li>";    		
	    	});    	
	    	$("#leftMenus").append(html);
	    	console.log(html);
	    	//append动态添加菜单，效果没有，可以使用element.render()进行重新渲染，element可以是其他对象
	    	element.render(null,'leftMenus');
	    	
	    },'json');
		
	} 

</script>
</body>
</html>