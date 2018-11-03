<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>订单编辑</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body >
<form action="${base}/order/edit" class="layui-form" method="post">
     
     <input type="hidden" name="orderId" value="${order.orderId!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">订单编号</label>
    <div class="layui-input-inline">
      <input type="text" name="orderSn" value="${order.orderSn!}" required  lay-verify="required" placeholder="订单编号" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">订单状态</label>
    <div class="layui-input-inline">
      <input type="text" name="orderStatus" value="${order.orderStatus!}"  required lay-verify="required" placeholder="订单状态true发货false未发货" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">发货状态</label>
    <div class="layui-input-inline">
      <input type="text" name="shippingStatus" value="${order.shippingStatus?string("true","false")!}" required lay-verify="required" placeholder="发货状态"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">支付状态</label>
    <div class="layui-input-inline">
      <input type="text" name="payStatus" value="${order.payStatus?string("true","false")!}" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">收货人</label>
    <div class="layui-input-inline">
      <input type="text" name="consignee" value="${order.consignee!}" placeholder="发放数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">地址</label>
    <div class="layui-input-inline">
      <input type="text" name="address" value="${order.address!}" placeholder="已领取数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">邮政编码</label>
    <div class="layui-input-inline">
      <input type="text" name="zipcode" value="${order.zipcode!}"  placeholder="邮政编码"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">手机</label>
    <div class="layui-input-inline">
      <input type="text" name="mobile" value="${order.mobile!}"  placeholder="手机号"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">邮箱</label>
    <div class="layui-input-inline">
      <input type="text" name="email" value="${order.email!}"  placeholder="邮箱"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">物流code</label>
    <div class="layui-input-inline">
      <input type="text" name="shippingCode" value="${order.shippingCode!}"  placeholder="物流代码"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">物流名称</label>
    <div class="layui-input-inline">
      <input type="text" name="shippingName" value="${order.shippingName!}"  placeholder="物流名称"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">发票抬头</label>
    <div class="layui-input-inline">
        <input type="text" name="invoiceTitle" value="${order.invoiceTitle!}"  placeholder="发票抬头"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">商品总价</label>
    <div class="layui-input-inline">
        <input type="text" name="goodsPrice" value="${order.goodsPrice!}"  placeholder="商品总价"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">邮费</label>
    <div class="layui-input-inline">
        <input type="text" name="shippingPrice" value="${order.shippingPrice!}"  placeholder="邮费0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">优惠券抵扣</label>
    <div class="layui-input-inline">
        <input type="text" name="couponPrice" value="${order.couponPrice!}"  placeholder="优惠券抵扣"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">使用积分</label>
    <div class="layui-input-inline">
        <input type="text" name="integral" value="${order.integral!}"  placeholder="使用积分"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">积分抵用现金</label>
    <div class="layui-input-inline">
        <input type="text" name="integralMoney" value="${order.integralMoney!}"  placeholder=""  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">应付款金额</label>
    <div class="layui-input-inline">
        <input type="text" name="orderAmount" value="${order.orderAmount!}"  placeholder=""  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">订单总价</label>
    <div class="layui-input-inline">
        <input type="text" name="totalAmount" value="${order.totalAmount!}"  placeholder=""  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">下单时间</label>
    <div class="layui-input-inline">
        <input type="text" name="addTime" value="${order.addTime?string('yyyy-MM-dd HH:mm:ss')!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">最后新发货时间</label>
    <div class="layui-input-inline">
        <input type="text" name="shippingTime" value="${order.shippingTime?string('yyyy-MM-dd HH:mm:ss')!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">用户收获时间</label>
    <div class="layui-input-inline">
        <input type="text" name="confirmTime" value="${order.confirmTime?string('yyyy-MM-dd HH:mm:ss')!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">支付时间</label>
    <div class="layui-input-inline">
        <input type="text" name="payTime" value="${order.payTime?string('yyyy-MM-dd HH:mm:ss')!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
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