<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>文章编辑</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<form action="${base}/brand/edit" class="layui-form" method="post">
     
       <input type="hidden" name="id" value="${brand.id!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">品牌名称</label>
    <div class="layui-input-inline">
      <input type="text" name="name" value="${brands.name!}" required  lay-verify="required" placeholder="请输入菜单名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">品牌logo</label>
    <div class="layui-input-inline">
      <input type="text" name="logo" value="${brands.logo!}"  required lay-verify="required" placeholder="请输入父编号" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">品牌描述</label>
    <div class="layui-input-inline">
      <input type="text" name="name" value="${brands.name!}" required lay-verify="required" placeholder="请输入访问路径"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">品牌地址</label>
    <div class="layui-input-inline">
      <input type="text" name="url" value="${brands.url!}" placeholder="请输入投放时间"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">排序</label>
    <div class="layui-input-inline">
      <input type="text" name="sort" value="${brands.sort!}" placeholder="请输入结束时间"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">品牌分类</label>
    <div class="layui-input-inline">
      <input type="text" name="catName" value="${brands.catName!}" placeholder="请输入结束时间"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">是否推荐</label>
    <div class="layui-input-inline">
      <input type="text" name="isHot" value="${brands.isHot?string("yes","no")}"  placeholder="true为推荐"  autocomplete="off" class="layui-input">
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