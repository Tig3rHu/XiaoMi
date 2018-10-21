<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>商品咨询编辑</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body >
<form action="${base}/goodsConsult/edit" class="layui-form" method="post">
     
     <input type="hidden" name="id" value="${goodsConsults.id!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">商品名称</label>
    <div class="layui-input-inline">
      <input type="text" name="goodsName" value="${goodsConsults.name!}" required  lay-verify="required" placeholder="优惠券名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">网名</label>
    <div class="layui-input-inline">
      <input type="text" name="username" value="${goodsConsults.username!}"  required lay-verify="required" placeholder="发放类型 0下单赠送1 指定发放 2 免费领取 3线下发放" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">咨询时间</label>
    <div class="layui-input-inline">
      <input type="text" name="addTime" value="${goodsConsults.addTime?string('yyyy-MM-dd HH:mm:ss')!}" required lay-verify="required" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">咨询类型</label>
    <div class="layui-input-inline">
      <input type="text" name="consultType" value="${goodsConsults.consultType!}" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">咨询内容</label>
    <div class="layui-input-inline">
      <input type="text" name="content" value="${goodsConsults.content!}" placeholder="发放数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">是否显示</label>
    <div class="layui-input-inline">
      <input type="text" name="isShow" value="${goodsConsults.isShow?string("true","false")}" placeholder="已领取数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">状态</label>
    <div class="layui-input-inline">
      <input type="text" name="status" value="${goodsConsults.status?string("true","false")}"  placeholder="已使用数量"  autocomplete="off" class="layui-input">
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