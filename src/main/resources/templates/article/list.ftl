<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>文章管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-layout-body">
     <h1 align="center">文章管理</h1>
    <hr class="layui-bg-green">
    <table class="layui-table" lay-filter="demo">
                <thead>
                <tr><th colspan="12"><h3>文章管理</h3></th></tr>
                <tr>
                    <th lay-data="{checkbox:true}"></th>
                    <th lay-data="{field:'1', width:100}">文章id</th>
                    <th lay-data="{field:'2', width:80, sort:true}">类别ID</th>
                    <th lay-data="{field:'3', width:100}">文章标题</th>
                    <th lay-data="{field:'5', width:100}">文章作者</th>
                    <th lay-data="{field:'6', width:150}">作者邮箱</th>
                    <th lay-data="{field:'7', width:150}">关键字</th>
                    <th lay-data="{field:'8', width:180}">添加日期</th>
                    <th lay-data="{field:'9', width:180}">发行日期</th>
                    <th lay-data="{field:'10', width:130}">文章类型</th>
                    <th lay-data="{field:'11', width:130}">点击次数</th>
                    <th lay-data="{field:'12', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/article/toedit"><i class="layui-icon">&#xe608;</i>添加文章</a>
                         <a class="layui-btn layui-btn-danger layui-btn-radius" lay-event="del">选中删除</a>
            
                <tbody>
                  
                <#list articles as article>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${article.articleId}</td>
                      <td>${article.catId}</td>
                      <td>${article.title}</td>
                      <td>${article.author}</td>
                      <td>${article.authorEmail}</td>
                      <td>${article.keywords}</td>
                      <td>${article.addTime?string('yyyy.MM.dd HH:mm:ss')}</td>
                      <td>${article.publishTime?string('yyyy.MM.dd HH:mm:ss')}</td>
                      <td>${article.articleType}</td>                    
                      <td>${article.click}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/article/toedit?articleId=${article.articleId}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/article/delete?articleId=${article.articleId}" onclick="return confirm('是否删除权限？')">删除</a>
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