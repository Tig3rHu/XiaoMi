<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>品牌管理</title>
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
                    <th lay-data="{field:'2', width:150}">品牌名称</th>
                    <th lay-data="{field:'3', width:100}">品牌logo</th>
                    <th lay-data="{field:'5', width:100}">品牌描述</th>
                    <th lay-data="{field:'6', width:150}">品牌地址</th>
                    <th lay-data="{field:'7', width:150,sort:true}">排序</th>
                    <th lay-data="{field:'8', width:180}">品牌分类</th>
                    <th lay-data="{field:'10', width:180}">是否推荐</th>
                
                    <th lay-data="{field:'11', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-xs" href="${base}/brand/toedit">添加文章</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">选中删除</a>
            
                <tbody>                 
                <#list brands as brand>
                   <tr>
                      <td lay-data="{checkbox:true}" ></td>
                      <td>${brand.id}</td>
                      <td>${brand.name}</td>
                      <td>${brand.logo}</td>
                      <td>${brand.name}</td>
                      <td>${brand.url}</td>
                      <td>${brand.sort}</td>
                      <td>${brand.catName}</td>
                      <td>${brand.isHot?string("true","false")}</td>                 
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/brand/toedit?id=${brand.id}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/brand/delete?id=${brand.id}" onclick="return confirm('是否删除权限？')">删除</a>
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