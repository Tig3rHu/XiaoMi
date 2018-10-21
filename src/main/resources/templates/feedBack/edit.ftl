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
<form action="${base}/feedBack/edit" class="layui-form" method="post">
     
     <input type="hidden" name="msgId" value="${feedBacks.msgId!}">  
    
    <div class="layui-form-item">
    <label class="layui-form-label">用户名称</label>
    <div class="layui-input-inline">
      <input type="text" name="userName" value="${feedBacks.userName!}" required  lay-verify="required" placeholder="用户留言名称" autocomplete="off" class="layui-input">
    </div>    
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">留言标题</label>
    <div class="layui-input-inline">
      <input type="text" name="msgTitle" value="${feedBacks.msgTitle!}"  required lay-verify="required" placeholder="留言标题" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
<div class="layui-form-item">
    <label class="layui-form-label">留言类型</label>
    <div class="layui-input-inline">
      <input type="text" name="msgType" value="${feedBacks.msgType!}" required lay-verify="required" placeholder="留言类型"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">处理状态</label>
    <div class="layui-input-inline">
      <input type="text" name="msgStatus" value="${feedBacks.msgStatus!}" placeholder="处理状态1或0"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">留言内容</label>
    <div class="layui-input-inline">
      <input type="text" name="msgContent" value="${feedBacks.msgContent!}" placeholder="留言内容"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">留言时间</label>
    <div class="layui-input-inline">
      <input type="text" name="msgTime" value="${feedBacks.msgTime?string('yyyy-MM-dd HH:mm:ss')}" placeholder="留言时间yyyy-MM-dd HH:mm:ss"  autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux"></div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">留言图片</label>
    <div class="layui-input-inline">
      <input type="text" name="messageImg" value="${feedBacks.messageImg!}"  placeholder="留言图片"  autocomplete="off" class="layui-input">
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