<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>购物车管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-layout-body">
     <h1 align="center">购物车管理</h1>
    <hr class="layui-bg-green">
    <table class="layui-table" lay-filter="demo">
                <thead>
                <tr><th colspan="10"><h3>购物车管理</h3></th></tr>
                <tr>
                    <th lay-data="{checkbox:true}"></th>
                    <th lay-data="{field:'1', width:100}">购物车ID</th>                   
                    <th lay-data="{field:'2', width:300}">商品名称</th>
                    <th lay-data="{field:'3', width:120}">商品货号</th>
                    <th lay-data="{field:'5', width:100, sort:true}">市场价</th>
                    <th lay-data="{field:'6', width:150}">本店价</th>
                    <th lay-data="{field:'7', width:150}">会员折扣价</th>
                    <th lay-data="{field:'8', width:100}">购买数量</th>
                    <th lay-data="{field:'9', width:200}">活动类型</th>
                    <th lay-data="{field:'10', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/cart/toedit"><i class="layui-icon">&#xe608;</i>加入购物车</a>
                         <a class="layui-btn layui-btn-danger layui-btn-radius" lay-event="del">选中删除</a>
            
                <tbody>
                  
                <#list carts as cart>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${cart.id}</td>
                      <td>${cart.goodsName!}</td>
                      <td>${cart.goodsSn!}</td>
                      <td>${cart.marketPrice!}</td>
                      <td>${cart.goodsPrice!}</td>
                      <td>${cart.memberGoodsPrice!}</td>
                      <td>${cart.goodsNum!}</td>
                      <td>${cart.name!}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/cart/toedit?id=${cart.id}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/cart/delete?id=${cart.id}" onclick="return confirm('是否删除权限？')">删除</a>
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