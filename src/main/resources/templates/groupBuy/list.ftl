<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>团购管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
  <style type="text/css">
     body{
       padding-topping:2px;
     }
  </style>
</head>
<body class="layui-layout-body">
    <table class="layui-table" lay-filter="demo">
                <thead>
                <tr>
                    <th lay-data="{checkbox:true}"></th>
                    <th lay-data="{field:'1', width:100}">团购ID</th>
                    <th lay-data="{field:'2', width:150}">活动名称</th>
                    <th lay-data="{field:'3', width:100}">商品名称</th>
                    <th lay-data="{field:'5', width:100}">团购开始时间</th>
                    <th lay-data="{field:'6', width:150}">团购结束时间</th>
                    <th lay-data="{field:'7', width:150,sort:true}">团购价格</th>
                    <th lay-data="{field:'8', width:180}">商品参团数</th>
                    <th lay-data="{field:'10', width:180}">商品已购买数</th>
                    <th lay-data="{field:'11', width:180}">已下单人数</th>
                    <th lay-data="{field:'12', width:180}">虚拟购买数</th>
                    <th lay-data="{field:'13', width:180}">折扣</th>                  
                    <th lay-data="{field:'15', width:180}">商品原价</th>
                    <th lay-data="{field:'15', width:180}">是否推荐</th>
                    <th lay-data="{field:'15', width:180}">是否结束</th>
                    <th lay-data="{field:'16', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/groupBuy/toedit"><i class="layui-icon">&#xe608;</i>
                                           新增团购</a>
                         <a class="layui-btn layui-btn-danger layui-btn-radius" lay-event="del">选中删除</a>
            
                <tbody>                 
                <#list groupBuys as groupBuy>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${groupBuy.id!}</td>
                      <td>${groupBuy.title!}</td>
                      <td>${groupBuy.goodsName!}</td>
                      <td>${groupBuy.startTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${groupBuy.endTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${groupBuy.price!}</td>
                      <td>${groupBuy.goodsNum!}</td>
                      <td>${groupBuy.buyNum!}</td>
                      <td>${groupBuy.orderNum!}</td>
                      <td>${groupBuy.virtualNum!}</td>
                      <td>${groupBuy.rebate!}</td>
                      <td>${groupBuy.goodsPrice!}</td>
                      <td>${groupBuy.recommended?string("true","false")}</td>
                      <td>${groupBuy.isEnd?string("true","false")}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/groupBuy/toedit?id=${groupBuy.id}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/groupBuy/delete?id=${groupBuy.id}" onclick="return confirm('是否删除权限？')">删除</a>
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