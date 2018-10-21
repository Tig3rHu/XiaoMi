<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>优惠券编辑</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body >
<form action="${base}/goodsCategory/edit" class="layui-form" method="post">
     
     <input type="hidden" name="id" value="${goodsCategorys.id!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">商品分类名称</label>
    <div class="layui-input-inline">
      <input type="text" name="name" value="${goodsCategorys.name!}" required  lay-verify="required" placeholder="商品分类名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">手机端商品分类名称</label>
    <div class="layui-input-inline">
      <input type="text" name="mobileName" value="${goodsCategorys.mobileName!}"  required lay-verify="required" placeholder="手机端商品分类名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">家族图谱</label>
    <div class="layui-input-inline">
      <input type="text" name="parentIdPath" value="${goodsCategorys.parentIdPath!}" required lay-verify="required" placeholder="家族图谱"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">等级</label>
    <div class="layui-input-inline">
      <input type="text" name="level" value="${goodsCategorys.level!}" placeholder="等级"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">顺序排序</label>
    <div class="layui-input-inline">
      <input type="text" name="sortOrder" value="${goodsCategorys.sortOrder!}" placeholder="顺序排序"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">是否显示</label>
    <div class="layui-input-inline">
      <input type="text" name="isShow" value="${goodsCategorys.isShow!}" placeholder="是否显示"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">分类图片</label>
    <div class="layui-input-inline">
      <input type="text" name="image" value="${goodsCategorys.image!}" placeholder="分类图片"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">是否推荐为热门分类</label>
    <div class="layui-input-inline">
      <input type="text" name="isHot" value="${goodsCategorys.isHot!}"  placeholder="是否推荐为热门分类"  autocomplete="off" class="layui-input">
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