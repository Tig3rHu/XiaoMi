<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>用户管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-layout-body">
   <h1 align="center">用户管理</h1>
    <hr class="layui-bg-green">
     <h1 align="center">用户管理</h1>
    <hr class="layui-bg-green">
    <table class="layui-table" lay-filter="demo">
                <thead>
                <tr>
                    <th lay-data="{checkbox:true}"></th>
                    <th lay-data="{field:'1', width:100}">用户ID</th>
                    <th lay-data="{field:'2', width:150}">用户名称</th>
                    <th lay-data="{field:'3', width:100}">用户密码</th>
                    <th lay-data="{field:'5', width:100}">email</th>
                    <th lay-data="{field:'6', width:150}">address</th>
                    <th lay-data="{field:'7', width:150,sort:true}">性别</th>
                    <th lay-data="{field:'8', width:180}">年龄</th>
                    <th lay-data="{field:'10', width:180}">支付密码</th>
                    <th lay-data="{field:'11', width:180}">生日</th>
                    <th lay-data="{field:'12', width:180}">电话号码</th>
                    <th lay-data="{field:'13', width:180}">最后一次登陆IP</th>
                      <th lay-data="{field:'14', width:180}">头像</th>
                      <th lay-data="{field:'15', width:180}">是否验证</th>
                    <th lay-data="{field:'16', width:130}">
                        </th>
                </tr>  
                
                </thead>
                <!--   <a id="add" class="layui-btn layui-btn-radius" href="${base}/users/edit"><i class="layui-icon">&#xe608;</i>新增活动</a>
                   <a class="layui-btn layui-btn-xs layui-btn-danger layui-btn-radius" lay-event="del">选中删除</a>
              -->   
                <tbody>                 
                <#list useresList as useresList>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${useresList.id!}</td>
                      <td>${useresList.username!}</td>
                      <td>${useresList.password!}</td>
                      <td>${useresList.email!}</td>
                      <td>${useresList.address!}</td>
                      <td>${useresList.sex!}</td>
                      <td>${useresList.age!}</td>
                      <td>${useresList.paypwd!}</td>                   
                      <td>${useresList.birthday?date}</td>
                      <td>${useresList.iphone!}</td>
                      <td>${useresList.lastIp!}</td>
                      <td>${useresList.headPic!}</td>
                      <td>${useresList.type!}</td>
                    
                      <td>
                    
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/users/delete?id=${useresList.id}" onclick="return confirm('是否删除权限？')">删除</a>
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