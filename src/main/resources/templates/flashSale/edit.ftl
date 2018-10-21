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
<form action="${base}/flashSale/edit" class="layui-form" method="post">
     
     <input type="hidden" name="id" value="${flashs.id!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">活动标题</label>
    <div class="layui-input-inline">
      <input type="text" name="title" value="${flashs.title!}" required  lay-verify="required" placeholder="优惠券名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">参团商品名称</label>
    <div class="layui-input-inline">
      <input type="text" name="goodsName" value="${flashs.goodsName!}"  required lay-verify="required" placeholder="发放类型 0下单赠送1 指定发放 2 免费领取 3线下发放" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">活动价格</label>
    <div class="layui-input-inline">
      <input type="text" name="price" value="${flashs.price!}" required lay-verify="required" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">商品参加活动数</label>
    <div class="layui-input-inline">
      <input type="text" name="goodsNum" value="${flashs.goodsNum!}" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">每个商品限购数</label>
    <div class="layui-input-inline">
      <input type="text" name="buyLimit" value="${flashs.buyLimit!}" placeholder="发放数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">已购买人数</label>
    <div class="layui-input-inline">
      <input type="text" name="buyNum" value="${flashs.buyNum!}" placeholder="已领取数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">已下单数</label>
    <div class="layui-input-inline">
      <input type="text" name="orderNum" value="${flashs.orderNum!}"  placeholder="已使用数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">活动描述</label>
    <div class="layui-input-inline">
      <input type="text" name="description" value="${flashs.description!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">闪购开始时间</label>
    <div class="layui-input-inline">
      <input type="text" name="startTime" value="${flashs.startTime?string('yyyy-MM-dd HH:mm:ss')!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">闪购结束时间</label>
    <div class="layui-input-inline">
      <input type="text" name="endTime" value="${flashs.endTime?string('yyyy-MM-dd HH:mm:ss')!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
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