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
<form action="${base}/articleCat/edit" class="layui-form" method="post">
     
       <input type="hidden" name="catId" value="${articleCats.catId!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">类别名称</label>
    <div class="layui-input-inline">
      <input type="text" name="catName" value="${articleCats.catName!}" required  lay-verify="required" placeholder="请输入类别名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">类别类型</label>
    <div class="layui-input-inline">
      <input type="text" name="catType" value="${articleCats.catType!}"  required lay-verify="required" placeholder="请输入类型" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">父级ID</label>
    <div class="layui-input-inline">
      <input type="text" name="parentId" value="${articleCats.parentId!}" placeholder="请输入父级ID"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">关键字</label>
    <div class="layui-input-inline">
      <input type="text" name="keywords" value="${articleCats.keywords!}" placeholder="请输入关键字"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">排序</label>
    <div class="layui-input-inline">
      <input type="text" name="sortOrder" value="${articleCats.sortOrder!}" placeholder="请输入排序"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">分类描述</label>
    <div class="layui-input-inline">
      <input type="text" name="catDesc" value="${articleCats.catDesc!}" placeholder="请输入分类描述"  autocomplete="off" class="layui-input">
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