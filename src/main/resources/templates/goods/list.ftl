<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>商品管理</title>
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
                    <th lay-data="{field:'1', width:100}">商品ID</th>
                    <th lay-data="{field:'2', width:150}">商品分类名称</th>
                    <th lay-data="{field:'2', width:150}">商品类型</th>
                    <th lay-data="{field:'3', width:100}">商品编号</th>
                    <th lay-data="{field:'5', width:100}">商品名称</th>
                    <th lay-data="{field:'6', width:150}">点击数</th>
                    <th lay-data="{field:'7', width:150,sort:true}">品牌</th>
                    <th lay-data="{field:'8', width:180}">库存数量</th>
                    <th lay-data="{field:'10', width:180}">商品评论数</th>
                    <th lay-data="{field:'11', width:180}">商品重量</th>
                    <th lay-data="{field:'12', width:180}">市场价</th>
                    <th lay-data="{field:'13', width:180}">本店价</th>
                    <th lay-data="{field:'14', width:180}">商品成本价</th>
                    <th lay-data="{field:'15', width:180}">价格阶梯</th>
                    <th lay-data="{field:'15', width:180}">商品关键词</th>
                    <th lay-data="{field:'15', width:180}">商品简单描述</th>
                    <th lay-data="{field:'15', width:180}">商品详细描述</th>
                    <th lay-data="{field:'15', width:180}">商品上传原始图</th>
                   <th lay-data="{field:'15', width:180}">是否上架</th>
                   <th lay-data="{field:'15', width:180}">是否包邮</th>
                   <th lay-data="{field:'15', width:180}">上架时间</th>
                   <th lay-data="{field:'15', width:180}">是否新品</th>
                   <th lay-data="{field:'15', width:180}">是否热卖</th>
                   <th lay-data="{field:'15', width:180}">最后更新时间</th>
                    <th lay-data="{field:'16', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-xs" href="${base}/goods/toedit">添加商品</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">选中删除</a>
            
                <tbody>                 
                <#list goods as good>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${good.goodsId!}</td>
                      <td>${good.catName!}</td>
                      <td>${good.name!}</td>
                      <td>${good.goodsSn!}</td>
                      <td>${good.goodsName!}</td>
                      <td>${good.clickCount!}</td>
                      <td>${good.brandId!}</td>
                      <td>${good.storeCount!}</td>
                      <td>${good.commentCount!}</td>
                      <td>${good.weight!}</td>
                      <td>${good.marketPrice!}</td>
                      <td>${good.shopPrice!}</td>
                      <td>${good.costPrice!}</td>
                      <td>${good.priceLadder!}</td>
                      <td>${good.keyWords!}</td>
                      <td>${good.goodsRemark!}</td>
                      <td>${good.goodsContent!}</td>
                      <td>${good.originalImg!}</td>
                      <td>${good.isOnSale?string("true","false")!}</td>
                      <td>${good.isFreeShipping?string("true","false")!}</td>
                      <td>${good.onTime?string('yyyy-MM-dd HH:mm:ss')!}</td>
                      <td>${good.isNew?string("true","false")!}</td>
                      <td>${good.isHot?string("true","false")!}</td>
                      <td>${good.updateTime?string('yyyy-MM-dd HH:mm:ss')!}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/goods/toedit?goodsId=${good.goodsId}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/goods/delete?goodsId=${good.goodsId}" onclick="return confirm('是否删除权限？')">删除</a>
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