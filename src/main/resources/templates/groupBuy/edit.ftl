<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>团购编辑</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body >
<form action="${base}/groupBuy/edit" class="layui-form" method="post">
     
     <input type="hidden" name="id" value="${groupBuy.id!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">活动名称</label>
    <div class="layui-input-inline">
      <input type="text" name="title" value="${groupBuy.title!}" required  lay-verify="required" placeholder="活动名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">商品名称</label>
    <div class="layui-input-inline">
      <input type="text" name="goodsName" value="${groupBuy.goodsName!}"  required lay-verify="required" placeholder="商品名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">团购开始时间</label>
    <div class="layui-input-inline">
      <input type="text" name="startTime" value="${groupBuy.startTime?string('yyyy-MM-dd HH:mm:ss')!}" required lay-verify="required" placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">团购结束时间</label>
    <div class="layui-input-inline">
      <input type="text" name="endTime" value="${groupBuy.endTime?string('yyyy-MM-dd HH:mm:ss')!}" placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">团购价格</label>
    <div class="layui-input-inline">
      <input type="text" name="price" value="${groupBuy.price!}" placeholder="团购价格"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">商品参团数</label>
    <div class="layui-input-inline">
      <input type="text" name="goodsNum" value="${groupBuy.goodsNum!}" placeholder="商品参团数"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">商品已购买数</label>
    <div class="layui-input-inline">
      <input type="text" name="buyNum" value="${groupBuy.buyNum!}"  placeholder="商品已购买"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">已下单人数</label>
    <div class="layui-input-inline">
      <input type="text" name="orderNum" value="${groupBuy.orderNum!}"  placeholder="已下单人数"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">虚拟购买数</label>
    <div class="layui-input-inline">
      <input type="text" name="virtualNum" value="${groupBuy.virtualNum!}"  placeholder="虚拟购买数"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">折扣</label>
    <div class="layui-input-inline">
      <input type="text" name="rebate" value="${groupBuy.rebate!}"  placeholder="折扣"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">商品原价</label>
    <div class="layui-input-inline">
        <input type="text" name="goodsPrice" value="${groupBuy.goodsPrice!}"  placeholder="商品原价0.00"  autocomplete="off" class="layui-input">
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