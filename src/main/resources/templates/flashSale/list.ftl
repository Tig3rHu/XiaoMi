<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>闪购信息管理</title>
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
                    <th lay-data="{field:'2', width:150}">活动标题</th>
                    <th lay-data="{field:'3', width:100}">参团商品名称</th>
                    <th lay-data="{field:'5', width:100}">活动价格</th>
                    <th lay-data="{field:'6', width:150}">商品参加活动数</th>
                    <th lay-data="{field:'7', width:150,sort:true}">每个限购数</th>
                    <th lay-data="{field:'8', width:180}">已购买人数</th>
                    <th lay-data="{field:'10', width:180}">已下单数</th>
                    <th lay-data="{field:'11', width:180}">活动描述</th>
                    <th lay-data="{field:'12', width:180}">闪购开始时间</th>
                    <th lay-data="{field:'13', width:180}">活动结束时间</th>
                    <th lay-data="{field:'14', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-xs" href="${base}/flashSale/toedit">添加闪购信息</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">选中删除</a>
            
                <tbody>                 
                <#list flashSales as flashSale>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${flashSale.id}</td>
                      <td>${flashSale.title}</td>
                      <td>${flashSale.goodsName}</td>
                      <td>${flashSale.price}</td>
                      <td>${flashSale.goodsNum}</td>
                      <td>${flashSale.buyLimit}</td>
                      <td>${flashSale.buyNum}</td>
                      <td>${flashSale.orderNum!}</td>
                      <td>${flashSale.description!}</td>
                      <td>${flashSale.startTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${flashSale.endTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/flashSale/toedit?id=${flashSale.id}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/flashSale/delete?id=${flashSale.id}" onclick="return confirm('是否删除权限？')">删除</a>
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