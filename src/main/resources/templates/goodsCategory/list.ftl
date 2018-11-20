<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>商品分类管理</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-layout-body">
      <h1 align="center">商品分类管理</h1>
    <hr class="layui-bg-green">
    <table class="layui-table" lay-filter="demo">
                <thead>
                <tr>
                    <th lay-data="{checkbox:true}"></th>
                    <th lay-data="{field:'1', width:100}">商品分类ID</th>
                    <th lay-data="{field:'2', width:150}">商品分类名称</th>
                    <th lay-data="{field:'3', width:100}">手机端显示的商品分类名</th>
                    <th lay-data="{field:'5', width:100}">家族图谱</th>
                    <th lay-data="{field:'6', width:150}">等级</th>
                    <th lay-data="{field:'7', width:150,sort:true}">顺序排序</th>
                    <th lay-data="{field:'8', width:180}">是否显示</th>
                    <th lay-data="{field:'9', width:180}">分类图片</th>
                    <th lay-data="{field:'10', width:180}">是否推荐为热门分类</th>
                    <th lay-data="{field:'11', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/goodsCategory/toedit"><i class="layui-icon">&#xe608;</i>添加商品分类</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs layui-btn-radius" lay-event="del">选中删除</a>
                  <form action="${base}/goodsCategory/index" method="post">
                
				      <input type="text" name="name" lay-verify="required" placeholder="请根据活动名称查询" autocomplete="off" style="width:160px;height:26px;">
				 
                  <button class="layui-btn layui-btn-sm"><i class="layui-icon">&#xe615;</i> 搜索</button>
                  </form>
                <tbody>                 
                <#list goodsCategorys as goodsCategory>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${goodsCategory.id!}</td>
                      <td>${goodsCategory.name!}</td>
                      <td>${goodsCategory.mobileName!}</td>
                      <td>${goodsCategory.parentIdPath!}</td>
                      <td>${goodsCategory.level!}</td>
                      <td>${goodsCategory.sortOrder!}</td>
                      <td>${goodsCategory.isShow!}</td>
                      <td>${goodsCategory.image!}</td>
                      <td>${goodsCategory.isHot!}</td>
                       <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/goodsCategory/toedit?id=${goodsCategory.id}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/goodsCategory/delete?id=${goodsCategory.id}" onclick="return confirm('是否删除权限？')">删除</a>
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