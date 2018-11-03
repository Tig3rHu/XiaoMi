<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>订单管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-layout-body">
    <table class="layui-table" lay-filter="demo">
                <thead>
                 <tr><th colspan="26"><h3>订单管理</h3></th></tr>
              
                <tr>
                    <th lay-data="{checkbox:true}"></th>
                    <th lay-data="{field:'1', width:100}">订单ID</th>
                    <th lay-data="{field:'2', width:150}">订单编号</th>
                    <th lay-data="{field:'3', width:100}">订单状态</th>
                    <th lay-data="{field:'5', width:100}">发货状态</th>
                    <th lay-data="{field:'6', width:150}">支付状态</th>
                    <th lay-data="{field:'7', width:150,sort:true}">收货人</th>
                    <th lay-data="{field:'14', width:180}">地址</th>
                    <th lay-data="{field:'15', width:180}">邮政编码</th>
                    <th lay-data="{field:'15', width:180}">手机</th>
                    <th lay-data="{field:'15', width:180}">邮箱</th>
                    <th lay-data="{field:'15', width:180}">物流code</th>
                    <th lay-data="{field:'15', width:180}">物流名称</th>
                    <th lay-data="{field:'15', width:180}">发票抬头</th>
                    <th lay-data="{field:'15', width:180}">商品总价</th>
                    <th lay-data="{field:'15', width:180}">邮费</th>
                    <th lay-data="{field:'15', width:180}">优惠券抵扣</th>
                    <th lay-data="{field:'15', width:180}">使用积分</th>
                    <th lay-data="{field:'15', width:180}">积分抵用现金</th>
                    <th lay-data="{field:'15', width:180}">应付款金额</th>
                    <th lay-data="{field:'15', width:180}">订单总价</th>
                    <th lay-data="{field:'15', width:180}">下单时间</th>
                    <th lay-data="{field:'15', width:180}">最后新发货时间</th>
                    <th lay-data="{field:'15', width:180}">用户收获时间</th>
                    <th lay-data="{field:'15', width:180}">支付时间</th>
                    <th lay-data="{field:'16', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/order/toedit"><i class="layui-icon">&#xe608;</i>
                                                             添加文章</a>
                         <a class="layui-btn layui-btn-danger layui-btn-radius layui-btn-xs" lay-event="del">选中删除</a>
            
                <tbody>                 
                <#list orders as order>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${order.orderId!}</td>
                      <td>${order.orderSn!}</td>
                      <td>${order.orderStatus!}</td>
                      <td>${order.shippingStatus?string("true","false")}</td>
                      <td>${order.payStatus?string("true","false")}</td>
                      <td>${order.consignee!}</td>
                      <td>${order.address!}</td>
                      <td>${order.zipcode!}</td>
                      <td>${order.mobile!}</td>
                      <td>${order.email!}</td>
                      <td>${order.shippingCode!}</td>
                      <td>${order.shippingName}</td>
                      <td>${order.invoiceTitle!}</td>
                      <td>${order.goodsPrice!}</td>
                      <td>${order.shippingPrice!}</td>
                      <td>${order.couponPrice!}</td>
                      <td>${order.integral!}</td>
                      <td>${order.integralMoney!}</td>
                      <td>${order.orderAmount!}</td>
                      <td>${order.totalAmount!}</td>
                      <td>${order.addTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${order.shippingTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${order.confirmTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${order.payTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/order/toedit?orderId=${order.orderId}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/order/delete?orderId=${order.orderId}" onclick="return confirm('是否删除权限？')">删除</a>
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