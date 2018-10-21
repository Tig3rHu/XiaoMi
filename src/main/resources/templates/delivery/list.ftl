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
                    <th lay-data="{field:'1', width:100}">发货单ID</th>
                    <th lay-data="{field:'2', width:150}">订单编号</th>
                    <th lay-data="{field:'3', width:100}">收货人</th>
                    <th lay-data="{field:'5', width:100}">邮编</th>
                    <th lay-data="{field:'6', width:150}">联系手机</th>
                    <th lay-data="{field:'7', width:150,sort:true}">国ID</th>
                    <th lay-data="{field:'8', width:180}">省ID</th>
                    <th lay-data="{field:'10', width:180}">市ID</th>
                    <th lay-data="{field:'11', width:180}">区地址</th>
                    <th lay-data="{field:'12', width:180}">地址</th>
                    <th lay-data="{field:'13', width:180}">物流</th>
                    <th lay-data="{field:'14', width:180}">快递名称</th>
                    <th lay-data="{field:'15', width:180}">快递运费</th>
                    <th lay-data="{field:'16', width:180}">物流单号</th>
                    <th lay-data="{field:'15', width:180}">座机电话</th>
                    <th lay-data="{field:'16', width:180}">友好收获时间</th>
                    <th lay-data="{field:'17', width:180}">订单创建时间</th>
                    <th lay-data="{field:'18', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-xs" href="${base}/delivery/toedit">添加文章</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">选中删除</a>
            
                <tbody>                 
                <#list deliverys as deliverys>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${deliverys.id!}</td>
                      <td>${deliverys.orderSn!}</td>
                      <td>${deliverys.consignee!}</td>
                      <td>${deliverys.zipcode!}</td>
                      <td>${deliverys.mobile!}</td>
                      <td>${deliverys.country!}</td>
                      <td>${deliverys.province!}</td>
                      <td>${deliverys.city!}</td>
                      <td>${deliverys.district!}</td>
                      <td>${deliverys.address!}</td>
                      <td>${deliverys.shippingCode!}</td>
                      <td>${deliverys.shippingName!}</td>
                      <td>${deliverys.shippingPrice!}</td>
                      <td>${deliverys.invoiceNo!}</td>
                      <td>${deliverys.tel!}</td>
                      <td>${deliverys.address!}</td>
                      <td>${deliverys.bestTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${deliverys.createTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                       <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/delivery/toedit?id=${deliverys.id}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/delivery/delete?id=${deliverys.id}" onclick="return confirm('是否删除权限？')">删除</a>
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