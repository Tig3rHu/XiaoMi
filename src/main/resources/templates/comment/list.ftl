<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>评论管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-layout-body">
     <h1 align="center">商品评论管理</h1>
    <hr class="layui-bg-green">
    <table class="layui-table" lay-filter="demo">
                <thead>
                <tr>
                    <th lay-data="{checkbox:true}"></th>
                    <th lay-data="{field:'1', width:100}">评论ID</th>                   
                    <th lay-data="{field:'2', width:300}">商品名称</th>
                    <th lay-data="{field:'3', width:120}">邮箱</th>
                    <th lay-data="{field:'5', width:100, sort:true}">用户名</th>
                    <th lay-data="{field:'6', width:150}">评论内容</th>
                    <th lay-data="{field:'7', width:150}">添加时间</th>
                    <th lay-data="{field:'8', width:100}">IP地址</th>
                    <th lay-data="{field:'9', width:90}">订单编号</th>
                    <th lay-data="{field:'10', width:80}">被赞数</th>
                    <th lay-data="{field:'11', width:100}">点赞用户</th>
                    <th lay-data="{field:'12', width:130}">
                        </th>
                </tr>              
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/comment/toedit"><i class="layui-icon">&#xe608;</i>添加评论</a>
                         <a class="layui-btn layui-btn-danger layui-btn-radius" lay-event="del">选中删除</a>            
                <tbody>                 
                <#list comments as comment>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${comment.commentId}</td>
                      <td>${comment.goodsName!}</td>
                      <td>${comment.email!}</td>
                      <td>${comment.username!}</td>
                      <td>${comment.content!}</td>
                      <td>${comment.addTime?string('yyyy.MM.dd HH:mm:ss')}</td>
                      <td>${comment.ipAddress!}</td>
                      <td>${comment.orderId!}</td>
                      <td>${comment.zanNum!}</td>
                      <td>${comment.zanUserid!}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/comment/toedit?commentId=${comment.commentId}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/comment/delete?commentId=${comment.commentId}" onclick="return confirm('是否删除权限？')">删除</a>
                           </td>
                   </tr>
                   
                </#list>
                </tbody>
                </table>

              
          
<script src="${base}/static/js/layui/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
  <script>
            //静态表格
            layui.use('table',function(){
                var table = layui.table;//加载表格模块
                table.init('demo', {
                    height: 500 //设置高度
                    ,page: true //开启分页
                    ,limit:20
                });
        
            });
            </script>
<script>
  
</script>

</body>
</html>