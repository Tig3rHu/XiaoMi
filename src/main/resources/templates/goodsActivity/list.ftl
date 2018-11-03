<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>商品活动管理</title>
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
                    <th lay-data="{field:'1', width:100}">活动ID</th>
                    <th lay-data="{field:'2', width:150}">活动名称</th>
                    <th lay-data="{field:'3', width:100}">活动描述</th>
                    <th lay-data="{field:'5', width:100}">活动类型</th>
                    <th lay-data="{field:'6', width:150}">商品规格ID</th>
                    <th lay-data="{field:'7', width:150,sort:true}">参与商品名称</th>
                    <th lay-data="{field:'8', width:180}">活动开始时间</th>
                    <th lay-data="{field:'10', width:180}">活动结束时间</th>
                    <th lay-data="{field:'11', width:180}">活动是否结束</th>
                    <th lay-data="{field:'12', width:180}">商品购买数</th>
                    <th lay-data="{field:'13', width:130}">
                        </th>
                </tr>
                
                </thead>
                 <a id="add" class="layui-btn layui-btn-radius" href="${base}/goodsActivity/toedit"><i class="layui-icon">&#xe608;</i>新增活动</a>
                         <a class="layui-btn layui-btn-xs layui-btn-danger layui-btn-radius" lay-event="del">选中删除</a>
            
                <tbody>                 
                <#list goodsActivitys as goodsActivitys>
                   <tr>
                      <td lay-data="{checkbox:true}"></td>
                      <td>${goodsActivitys.actId!}</td>
                      <td>${goodsActivitys.actName!}</td>
                      <td>${goodsActivitys.actDesc!}</td>
                      <td>${goodsActivitys.actType!}</td>
                      <td>${goodsActivitys.specId!}</td>
                      <td>${goodsActivitys.goodsName!}</td>
                      <td>${goodsActivitys.startTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${goodsActivitys.endTime?string('yyyy-MM-dd HH:mm:ss')}</td>
                      <td>${goodsActivitys.isFinished!}</td>
                      <td>${goodsActivitys.actCount!}</td>
                      <td>
                         <a class="layui-btn layui-btn-xs" lay-event="edit" href="${base}/goodsActivity/toedit?actId=${goodsActivitys.actId}">编辑</a>
                         <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del" href="${base}/goodsActivity/delete?actId=${goodsActivitys.actId}" onclick="return confirm('是否删除权限？')">删除</a>
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