<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>广告编辑</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<form action="${base}/ad/edit" class="layui-form" method="post">
     
       <input type="hidden" name="adId" value="${adById.adId!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">广告位置</label>
    <div class="layui-input-inline">
      <input type="text" name="pid" value="${adById.pid!}" required  lay-verify="required" placeholder="请输入菜单名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">广告类型</label>
    <div class="layui-input-inline">
      <input type="text" name="mediaType" value="${adById.mediaType!}"  required lay-verify="required" placeholder="请输入父编号" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">广告名称</label>
    <div class="layui-input-inline">
      <input type="text" name="adName" value="${adById.adName!}" placeholder="请输入广告名称"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">链接地址</label>
    <div class="layui-input-inline">
      <input type="text" name="adLink" value="${adById.adLink!}" required lay-verify="required" placeholder="请输入访问路径"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">投放时间</label>
    <div class="layui-input-inline">
      <input type="text" name="startTime" value="${adById.startTime!}" placeholder="请输入投放时间"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">结束时间</label>
    <div class="layui-input-inline">
      <input type="text" name="endTime" value="${adById.endTime!}" placeholder="请输入结束时间"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>


<script src="${base}/static/js/layui/layui.js"></script>
<script>
//JavaScript代码区域
layui.use(['element','form'], function(){
  var element = layui.element;
  var form=layui.form;
  
}); 
</script>
</body>
</html>