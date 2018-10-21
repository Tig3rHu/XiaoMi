<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>广告管理</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <style>
     table tbody{
        height:3000px;
     }
  
  
  </style>
</head>
<body class="layui-layout-body">
<form action="" class="layui-form">
<table class="layui-table" lay-size="sm" >
  <colgroup>
    <col width="50">
    <col width="45">
    <col width="150">
    <col width="50">
    <col width="150">
    <col width="50">
    <col width="50">
    <col width="100">
    <col width="140">
    <col width="100">
    <col width="100">
   <col width="80">
  </colgroup>
  <thead>
  
    <tr>
      <th><a id="checkAll" class="layui-btn layui-btn-xs">选择</a></th>
      <th>广告id</th>
      <th>广告位置</th>
      <th>广告类型</th>
      <th>广告名称</th>
      <th>广告宽度</th>
      <th>广告高度</th>
      <th>广告链接地址</th>
      <th>广告描述</th>
      <th>投放时间</th>
      <th>结束时间</th>
      <th><a id="add" class="layui-btn layui-btn-xs" href="${base}/ad/toedit">添加</a>
          <a class="layui-btn layui-btn-xs" href="${base}/ad/toedit">选中删除</a>
      </th>
    </tr>   
  </thead>
  <tbody>   
  <#list admenu as admenus>   
    <tr>
      <td><input type="checkbox" name="ck" value="${admenus.adId}"></td>
      <td>${admenus.adId}</td>
      <td>${admenus.positionName}</td>
      <td>${admenus.mediaType}</td>
      <td>${admenus.adName}</td>
      <td>${admenus.adWidth}</td>
      <td>${admenus.adHeight}</td>
      <td>${admenus.adLink}</td>
      <td>${admenus.positionDesc}</td>
      <td>${admenus.startTime?string('yyyy.MM.dd HH:mm:ss')}</td>
      <td>${admenus.endTime?string('yyyy.MM.dd HH:mm:ss')}</td>
 
      <td>
      <a class="layui-btn layui-btn-xs" href="${base}/ad/toedit?adId=${admenus.adId}">编辑</a>
      <a class="layui-btn layui-btn-xs" href="${base}/ad/delete?adId=${admenus.adId}" onclick="return confirm('是否删除权限？')">删除</a>
      </td>
    </tr>
    
    </#list>
        <tr>
				<td colspan="5"><a class="layui-btn layui-btn-xs">一共${page.pages}页</a> 
				    <a class="layui-btn layui-btn-xs" href="${base}/ad/index?page=${page.firstPage}">第一页</a>
					<a class="layui-btn layui-btn-xs" href="${base}/ad/index?page=${page.nextPage}">下一页</a>
					<a class="layui-btn layui-btn-xs" href="${base}/ad/index?page=${page.prePage}">上一页</a>
					<a class="layui-btn layui-btn-xs" href="${base}/ad/index?page=${page.lastPage}">最后页</a>
				</td>
			</tr>
  </tbody>
</table>
</form>


<script src="${base}/static/js/layui/layui.js"></script>

<script>
//JavaScript代码区域
layui.use(['form','jquery'], function(){
	var form=layui.form,$=layui.$
  $(document).ready(function(){
       //获取时间戳
       /* var starttime=$(".start").attr("starttime");
       var endtime=$(".end").attr("endtime");
       console.log(toString.call(parseInt(starttime)));  
       var startdate=new Date(parseInt(starttime));
       var enddate=new Date(parseInt(endtime));
       $(".start").html(startdate);
      $(".end").html(enddate);
       
       console.log(enddate); */
	   var s=$("#checkAll").html();
	   console.log('s'+s);
	   $("#checkAll").click(function(){		  
		  alert("111");
		 	   
		}); 
	  });
    
    
  
}); 

</script>
</body>
</html>