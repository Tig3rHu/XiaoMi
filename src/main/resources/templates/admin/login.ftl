<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>

<link rel="stylesheet" href="${base}/static/js/layui/css/layui.css">
<link rel="stylesheet" href="${base}/static/css/login.css">

<style>
@import url("https://fonts.googleapis.com/css?family=Montserrat:200,300,400,600"); 
.more-pens {
  position: fixed;
  left: 20px;
  bottom: 20px;
  z-index: 10;
  font-family: "Montserrat";
  font-size: 12px;
}

a.white-mode, a.white-mode:link, a.white-mode:visited, a.white-mode:active {
  font-family: "Montserrat";
  font-size: 12px;
  text-decoration: none;
  background: #212121;
  padding: 4px 8px;
  color: #f7f7f7;
}
a.white-mode:hover, a.white-mode:link:hover, a.white-mode:visited:hover, a.white-mode:active:hover {
  background: #edf3f8;
  color: #212121;
}

body {
  margin: 0;
  padding: 0;
  overflow: hidden;
  width: 100%;
  height: 100%;
 /*  background: #000000; */
}

.title {
  z-index: 10;
  position: absolute;
  left: 50%;
  top: 50%;
  transform: translateX(-50%) translateY(-50%);
  font-family: "Montserrat";
  text-align: center;
  width: 100%;
}
 h1 {
  position: relative;
  color: #EEEEEE;
  font-weight: 600;
  font-size: 40px;
  padding: 0;
  margin: 30px;
  line-height: 1;
  text-shadow: 0 0 30px #000155;
}
.title h1 span {
  font-weight: 600;
  padding: 0;
  margin: 0;
  color: #BBB;
}
.title h3 {
  font-weight: 200;
  font-size: 20px;
  padding: 0;
  margin: 0;
  line-height: 1;
  color: #EEEEEE;
  letter-spacing: 2px;
  text-shadow: 0 0 30px #000155;
}
</style>
</head>
<body>

	<div class="main">
	    
		<div class="layui-container layui-header">
		
        
		<h1>TigerOrTiger系统后台</h1>
		</div>
		<div class="layui-container layui-main">
		     
			<div class="layui-main-login">
				
				<form class="layui-form" action="${base}/admin/loginin"
					method="post">
					<div class="layui-form-item">

						<input type="text" name="userName" required lay-verify="required"
							placeholder="请输入登录名称" autocomplete="off" class="layui-input">

					</div>
					<div class="layui-form-item">

						<input type="password" name="password" required
							lay-verify="required" placeholder="请输入登录密码" autocomplete="off"
							class="layui-input">

					</div>

					<div class="layui-form-item">
						<input type="submit" class="layui-btn layui-btn-fluid layui-btn-warm"  value="管理员登录" class="layui-input">
					</div>
                    <#if s??>
				        <button data-method="offset" data-type="auto" class="layui-btn layui-btn-normal">${s.message }</button>
			        </#if>
				</form>
				
			</div>

		</div>
	</div>
<script type="text/javascript" src="${base}/static/js/jquery-2.1.1.min.js"></script>
<script src="${base}/static/js/layui/layui.js"></script>
	
	<script type="text/javascript" src="${base}/static/js/h5-bg-login.js"></script>
	<script type="text/javascript">
		layui.use('form', function() {
			var form = layui.form;
            
			//各种基于事件的操作，下面会有进一步介绍
		});
		
	
	</script>
</body>
</html>