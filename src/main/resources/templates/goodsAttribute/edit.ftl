<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>商品属性编辑</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body >
<form action="${base}/goodsAttribute/edit" class="layui-form" method="post">
     
     <input type="hidden" name="attrId" value="${goodAttributes.id!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">属性名称</label>
    <div class="layui-input-inline">
      <input type="text" name="attrName" value="${goodAttributes.attrName!}" required  lay-verify="required" placeholder="优惠券名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">属性分类ID</label>
    <div class="layui-input-inline">
      <input type="text" name="typeId" value="${goodAttributes.typeId!}"  required lay-verify="required" placeholder="发放类型 0下单赠送1 指定发放 2 免费领取 3线下发放" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">属性检索</label>
    <div class="layui-input-inline">
      <input type="text" name="attrIndex" value="${goodAttributes.attrIndex!}" required lay-verify="required" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">属性类型</label>
    <div class="layui-input-inline">
      <input type="text" name="attrType" value="${goodAttributes.attrType!}" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">属性输入类型</label>
    <div class="layui-input-inline">
      <input type="text" name="attrInputType" value="${goodAttributes.attrInputType!}" placeholder="发放数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">属性排序</label>
    <div class="layui-input-inline">
      <input type="text" name="order" value="${goodAttributes.order!}" placeholder="已领取数量"  autocomplete="off" class="layui-input">
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