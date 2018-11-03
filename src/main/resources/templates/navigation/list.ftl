<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>优惠券管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-layout-body">
    <table class="layui-table" lay-filter="demo">
                <thead>
                <tr>
                    <th lay-data="{checkbox:true}"></th>
                    <th lay-data="{field:'1', width:100}">ID</th>
                    <th lay-data="{field:'2', width:150}">优惠券名字</th>
                    <th lay-data="{field:'3', width:100}">优惠券类型</th>
                    <th lay-data="{field:'5', width:100}">优惠券金额</th>
                    <th lay-data="{field:'6', width:150}">使用条件</th>
                    <th lay-data="{field:'7', width:150,sort:true}">发送数量</th>
                    <th lay-data="{field:'8', width:180}">已领取数量</th>
                    <th lay-data="{field:'10', width:180}">已使用数量</th>
                    <th lay-data="{field:'11', width:180}">发放开始时间</th>
                    <th lay-data="{field:'12', width:180}">发放结束时间</th>
                    <th lay-data="{field:'13', width:180}">使用开始时间</th>
                    <th lay-data="{field:'14', width:180}">使用结束时间</th>
                    <th lay-data="{field:'15', width:180}">添加时间</th>
                    <th lay-data="{field:'16', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/coupon/toedit">添加文章</a>
                         <a class="layui-btn layui-btn-danger layui-btn-radius layui-btn-xs" lay-event="del">选中删除</a>
            
                <tbody>                 
                <#list coupons as coupon>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${coupon.id}</td>
                      <td>${coupon.name}</td>
                      <td>${coupon.type}</td>
                      <td>${coupon.money}</td>
                      <td>${coupon.condition}</td>
                      <td>${coupon.createnum}</td>
                      <td>${coupon.sendNum}</td>
                      <td>${coupon.useNum}</td>
                      <td>${coupon.sendStartTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${coupon.sendEndTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${coupon.useStartTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${coupon.useEndTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${coupon.addTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/coupon/toedit?id=${coupon.id}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/coupon/delete?id=${coupon.id}" onclick="return confirm('是否删除权限？')">删除</a>
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