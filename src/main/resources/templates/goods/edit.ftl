<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>商品编辑</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body >
<form action="${base}/goods/edit" class="layui-form" method="post">
     
     <input type="hidden" name="goodsId" value="${goods.goodsId!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">商品名称</label>
    <div class="layui-input-inline">
      <input type="text" name="goodsName" value="${goods.goodsName!}" required  lay-verify="required" placeholder="商品名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">商品分类名称</label>
    <div class="layui-input-inline">
      <input type="text" name="catName" value="${goods.catName!}"  required lay-verify="required" placeholder="商品分类名称" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">商品编号</label>
    <div class="layui-input-inline">
      <input type="text" name="goodsSn" value="${goods.goodsSn!}" required lay-verify="required" placeholder="商品编号"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">点击数</label>
    <div class="layui-input-inline">
      <input type="text" name="clickCount" value="${goods.clickCount!}" placeholder="0.00"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">品牌ID</label>
    <div class="layui-input-inline">
      <input type="text" name="brandId" value="${goods.brandId!}" placeholder="品牌ID"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">库存数量</label>
    <div class="layui-input-inline">
      <input type="text" name="storeCount" value="${goods.storeCount!}" placeholder="库存数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">商品评论数</label>
    <div class="layui-input-inline">
      <input type="text" name="commentCount" value="${goods.commentCount!}"  placeholder="商品评论数"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">商品重量</label>
    <div class="layui-input-inline">
      <input type="text" name="weight" value="${goods.weight!}"  placeholder="商品重量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">市场价</label>
    <div class="layui-input-inline">
      <input type="text" name="marketPrice" value="${goods.marketPrice!}"  placeholder="市场价"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">本店价</label>
    <div class="layui-input-inline">
      <input type="text" name="shopPrice" value="${goods.shopPrice!}"  placeholder="本店价"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">商品成本价</label>
    <div class="layui-input-inline">
      <input type="text" name="costPrice" value="${goods.costPrice!}"  placeholder="商品成本价"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">价格阶梯</label>
    <div class="layui-input-inline">
        <input type="text" name="priceLadder" value="${goods.priceLadder!}"  placeholder="价格阶梯"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">商品关键词</label>
    <div class="layui-input-inline">
        <input type="text" name="keyWords" value="${goods.keyWords!}"  placeholder="商品关键词"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">商品简单描述</label>
    <div class="layui-input-inline">
        <input type="text" name="goodsRemark" value="${goods.goodsRemark!}"  placeholder="商品简单描述"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">商品上传图像</label>
    <div class="layui-input-inline">
        <input type="text" name="originalImg" value="${goods.originalImg!}"  placeholder="商品上传图像"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <!--  <div class="layui-form-item">
    <label class="layui-form-label">是否上架</label>
    <div class="layui-input-inline">
        <input type="text" name="isOnSale" value="${goods.isOnSale?string("true","false")!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div> -->
   <div class="layui-form-item">
    <label class="layui-form-label">是否包邮</label>
    <div class="layui-input-inline">
        <input type="text" name="isFreeShipping" value="${goods.isFreeShipping?string("true","false")!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
   <div class="layui-form-item">
    <label class="layui-form-label">上架时间</label>
    <div class="layui-input-inline">
        <input type="text" name="onTime" value="${goods.onTime?string('yyyy-MM-dd HH:mm:ss')!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">是否新品</label>
    <div class="layui-input-inline">
        <input type="text" name="isNew" value="${goods.isNew?string("true","false")!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">是否热卖</label>
    <div class="layui-input-inline">
        <input type="text" name="isHot" value="${goods.isHot?string("true","false")!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">最后更新时间</label>
    <div class="layui-input-inline">
        <input type="text" name="updateTime" value="${goods.updateTime?string('yyyy-MM-dd HH:mm:ss')!}"  placeholder="yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
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