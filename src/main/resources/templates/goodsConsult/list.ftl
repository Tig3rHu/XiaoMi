<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>商品咨询管理</title>
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
                    <th lay-data="{field:'1', width:100}">商品咨询ID</th>
                    <th lay-data="{field:'2', width:150}">商品名称</th>
                    <th lay-data="{field:'3', width:100}">网名</th>
                    <th lay-data="{field:'5', width:150}">咨询时间</th>
                    <th lay-data="{field:'6', width:100}">咨询类型</th>
                    <th lay-data="{field:'7', width:150,sort:true}">咨询内容</th>
                    <th lay-data="{field:'8', width:100}">是否显示</th>
                    <th lay-data="{field:'9', width:100}">状态</th>
                    <th lay-data="{field:'10', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-xs" href="${base}/goodsConsult/toedit">添加商品咨询</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">选中删除</a>
            
                <tbody>                 
                <#list goodsConsults as goodsConsult>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${goodsConsult.id!}</td>
                      <td>${goodsConsult.goodsName!}</td>
                      <td>${goodsConsult.username!}</td>
                      <td>${goodsConsult.addTime?string('yyyy.MM.dd HH:mm:ss')}</td>
                      <td>${goodsConsult.consultType!}</td>
                      <td>${goodsConsult.content!}</td>
                      <td>${goodsConsult.isShow?string("true","false")}</td>
                      <td>${goodsConsult.status?string("true","false")}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/goodsConsult/toedit?id=${goodsConsult.id}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/goodsConsult/delete?id=${goodsConsult.id}" onclick="return confirm('是否删除权限？')">删除</a>
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