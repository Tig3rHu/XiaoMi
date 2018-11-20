<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>商品属性管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-layout-body">
     <h1 align="center">商品活动管理</h1>
    <hr class="layui-bg-green">
    <table class="layui-table" lay-filter="demo">
                <thead>
                <tr>
                    <th lay-data="{checkbox:true}"></th>
                    <th lay-data="{field:'1', width:100}">属性ID</th>
                    <th lay-data="{field:'2', width:150}">属性名称</th>
                    <th lay-data="{field:'3', width:100}">属性分类ID</th>
                    <th lay-data="{field:'5', width:100}">属性检索</th>
                    <th lay-data="{field:'6', width:150}">属性类型</th>
                    <th lay-data="{field:'7', width:150,sort:true}">属性输入类型</th>
                    <th lay-data="{field:'8', width:180}">属性排序</th>
                    <th lay-data="{field:'16', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/goodsAttribute/toedit"><i class="layui-icon">&#xe608;</i>添加商品属性</a>
                         <a class="layui-btn layui-btn-danger layui-btn-radius layui-btn-xslayui-btn-xs" lay-event="del">选中删除</a>
                <form action="${base}/goodsAttribute/index" method="post">
                
				      <input type="text" name="attrName" lay-verify="required" placeholder="请根据活动名称查询" autocomplete="off" style="width:160px;height:26px;">
				 
                  <button class="layui-btn layui-btn-sm"><i class="layui-icon">&#xe615;</i> 搜索</button>
                  </form>
                <tbody>                 
                <#list goodAttributes as goodAttribute>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${goodAttribute.attrId}</td>
                      <td>${goodAttribute.attrName}</td>
                      <td>${goodAttribute.typeId}</td>
                      <td>${goodAttribute.attrIndex}</td>
                      <td>${goodAttribute.attrType}</td>
                      <td>${goodAttribute.attrInputType}</td>
                      <td>${goodAttribute.order}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/goodsAttribute/toedit?attrId=${goodAttribute.attrId}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/goodsAttribute/delete?attrId=${goodAttribute.attrId}" onclick="return confirm('是否删除权限？')">删除</a>
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