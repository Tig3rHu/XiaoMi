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
<form action="${base}/article/edit" class="layui-form" method="post">
     
       <input type="hidden" name="articleId" value="${article.articleId!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">类别ID</label>
    <div class="layui-input-inline">
      <input type="text" name="catId" value="${article.catId!}" required  lay-verify="required" placeholder="请输入菜单名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">文章标题</label>
    <div class="layui-input-inline">
      <input type="text" name="title" value="${article.title!}"  required lay-verify="required" placeholder="请输入父编号" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">作者</label>
    <div class="layui-input-inline">
      <input type="text" name="author" value="${article.author!}" placeholder="请输入广告名称"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">作者Eamil</label>
    <div class="layui-input-inline">
      <input type="text" name="authorEmail" value="${article.authorEmail!}" required lay-verify="required" placeholder="请输入访问路径"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">关键字</label>
    <div class="layui-input-inline">
      <input type="text" name="keywords" value="${article.keywords!}" placeholder="请输入投放时间"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">添加时间</label>
    <div class="layui-input-inline">
      <input type="text" name="addTime" value="${article.addTime?string('yyyy.MM.dd HH:mm:ss')}" placeholder="请输入结束时间"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">发行时间</label>
    <div class="layui-input-inline">
      <input type="text" name="publishTime" value="${article.publishTime?string('yyyy.MM.dd HH:mm:ss')}" placeholder="请输入结束时间"  autocomplete="off" class="layui-input">
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