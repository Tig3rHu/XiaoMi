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
<form action="${base}/coupon/edit" class="layui-form" method="post">
     
     <input type="hidden" name="id" value="${coupons.id!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">优惠券名称</label>
    <div class="layui-input-inline">
      <input type="text" name="name" value="${coupons.name!}" required  lay-verify="required" placeholder="优惠券名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">优惠券类型</label>
    <div class="layui-input-inline">
      <input type="text" name="type" value="${coupons.type!}"  required lay-verify="required" placeholder="发放类型 0下单赠送1 指定发放 2 免费领取 3线下发放" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">优惠券金额</label>
    <div class="layui-input-inline">
      <input type="text" name="money" value="${coupons.money!}" required lay-verify="required" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">使用条件</label>
    <div class="layui-input-inline">
      <input type="text" name="condition" value="${coupons.condition!}" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">发放数量</label>
    <div class="layui-input-inline">
      <input type="text" name="createnum" value="${coupons.createnum!}" placeholder="发放数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">已领取数量</label>
    <div class="layui-input-inline">
      <input type="text" name="sendNum" value="${coupons.sendNum!}" placeholder="已领取数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">已使用的数量</label>
    <div class="layui-input-inline">
      <input type="text" name="useNum" value="${coupons.useNum!}"  placeholder="已使用数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">发放开始时间</label>
    <div class="layui-input-inline">
      <input type="text" name="sendStartTime" value="${coupons.sendStartTime?string('yyyy-MM-dd HH:mm:ss')}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">发放结束时间</label>
    <div class="layui-input-inline">
      <input type="text" name="sendEndTime" value="${coupons.sendEndTime?string('yyyy-MM-dd HH:mm:ss')}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">使用开始时间</label>
    <div class="layui-input-inline">
      <input type="text" name="useStartTime" value="${coupons.useStartTime?string('yyyy-MM-dd HH:mm:ss')}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">使用结束时间</label>
    <div class="layui-input-inline">
      <input type="text" name="useEndTime" value="${coupons.useEndTime?string('yyyy-MM-dd HH:mm:ss')}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">添加时间</label>
    <div class="layui-input-inline">
      <input type="text" name="addTime" value="${coupons.addTime?string('yyyy-MM-dd HH:mm:ss')}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
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