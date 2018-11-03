<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>文章Cat管理</title>
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
                    <th lay-data="{field:'2', width:150, sort:true}">类别名称</th>
                    <th lay-data="{field:'3', width:100}">类别类型</th>
                    <th lay-data="{field:'5', width:100}">父级ID</th>
                    <th lay-data="{field:'6', width:150}">是否导航显示</th>
                    <th lay-data="{field:'7', width:150,sort:true}">排序</th>
                    <th lay-data="{field:'8', width:180}">分类描述</th>
                    <th lay-data="{field:'9', width:180}">关键字</th>
                
                    <th lay-data="{field:'10', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/articleCat/toedit">添加文章</a>
                         <a class="layui-btn layui-btn-danger layui-btn-radius" lay-event="del">选中删除</a>
            
                <tbody>
                  
                <#list articleCats as article>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${article.catId}</td>
                      <td>${article.catName}</td>
                      <td>${article.catType}</td>
                      <td>${article.parentId}</td>
                      <td>${article.showInNav?string("true","false")}</td>
                      <td>${article.sortOrder}</td>
                      <td>${article.catDesc}</td>
                      <td>${article.keywords}</td>                 
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/articleCat/toedit?catId=${article.catId}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/articleCat/delete?catId=${article.catId}" onclick="return confirm('是否删除权限？')">删除</a>
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