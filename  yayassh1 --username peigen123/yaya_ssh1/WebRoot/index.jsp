<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/style.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  	<div>
    	<a href="toAddUser.do?method=toAddUser">添加用户</a><br>
  	</div>
  	<div>
  		<a href="listUser.do?method=listUser">用户列表</a>
  	</div>
  	<div>
  		<a href="page-list.do?method=getUserPartialList">分页列表</a>
  	</div>
  	<div>
  		<a href="test/test.jsp">test</a>
  	</div>
  	<div>
  		<form method=post action="check.jsp">
			<table>
				<tr>
					<td align=left>
						系统产生的认证码：
					</td>
					<td>
						<img border=0 src="valid_img">
					</td>
				</tr>
				<tr>
					<td align=left>
						输入上面的认证码：
					</td>
					<td>
						<input type=text name=rand maxlength=4 value="">
					</td>
				</tr>
				<tr>
					<td colspan=2 align=center>
						<input type=submit value="提交检测">
					</td>
				</tr>
			</table>
		</form>
  	</div>
  	<div>
  		<a href="./admin/index.jsp">管理界面</a>
  	</div>
  </body>
</html>
