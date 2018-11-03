<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>商品活动编辑</title>
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
</head>
<body >
<form action="${base}/goodsActivity/edit" class="layui-form" method="post">
     
     <input type="hidden" name="id" value="${goodsActivitys.actId!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">活动名称</label>
    <div class="layui-input-inline">
      <input type="text" name="actName" value="${goodsActivitys.actName!}" required  lay-verify="required" placeholder="活动名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">活动描述</label>
    <div class="layui-input-inline">
      <input type="text" name="actDesc" value="${goodsActivitys.actDesc!}"  required lay-verify="required" placeholder="活动描述" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">活动类型</label>
    <div class="layui-input-inline">
      <input type="text" name="actType" value="${goodsActivitys.actType!}" required lay-verify="required" placeholder="活动类型:1预售0拼团"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">活动规格ID</label>
    <div class="layui-input-inline">
      <input type="text" name="specId" value="${goodsActivitys.specId!}" placeholder="商品规格ID"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">参与商品名称</label>
    <div class="layui-input-inline">
      <input type="text" name="goodsName" value="${goodsActivitys.goodsName!}" placeholder="发放数量"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">活动开始时间</label>
    <div class="layui-input-inline">
      <input id="startTime" type="text" name="startTime" value="${goodsActivitys.startTime?string('yyyy-MM-dd HH:mm:ss')!}" placeholder="时间yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input time">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">活动结束时间</label>
    <div class="layui-input-inline">
      <input id="endTime" type="text" name="endTime" value="${goodsActivitys.endTime?string('yyyy-MM-dd HH:mm:ss')}"  placeholder="时间yyyy-MM-dd HH:mm:ss" class="layui-input time">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">活动是否结束</label>
    <div class="layui-input-inline">
      <input type="text" name="isFinished" value="${goodsActivitys.isFinished!}"  placeholder="是否已结束:1,成功结束；0 失败结束。"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">商品购买数</label>
    <div class="layui-input-inline">
      <input type="text" name="actCount" value="${goodsActivitys.actCount!}"  placeholder="商品购买数"  autocomplete="off" class="layui-input">
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
layui.use(['element','form','laydate','jquery'], function(){
  var element = layui.element;
  var form=layui.form;
  var laydate=layui.laydate;
  var $=layui.$;
  $(".time").each(function(){
      laydate.render({
        elem: this, //指定元素  表示当前的元素
        type: 'datetime', //date日期  time时间  year年  month月份  
        theme: '#009688'  //主题  颜色改变
      });
  })
 /*  laydate.render({
	  elem:'#startTime',
      type:'datetime'
	  })
   laydate.render({
	  elem:'#endTime',
      type:'datetime'
	  }) */
	  
}); 
</script>
</body>
</html>