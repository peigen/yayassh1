<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://peigen.org/dictTag" prefix="dict" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>认证码输入页面</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
		<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
		<META HTTP-EQUIV="Expires" CONTENT="0">
		<link href="./css/style.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		This is my JSP page. <br>
		<table>
		<tr>
		<td  align="left" class="zi12">
		
		<dict:dictTag typeName="性别" outPutType="select" orderName="yy" selectSize="5" /><br />
		<dict:dictTag typeName="性别" outPutType="select" orderName="yy" existValue="2" /><br />
		<dict:dictTag typeName="性别" outPutType="checkbox" orderName="yy" existValue="3" /><br />
		<dict:dictTag typeName="性别" outPutType="radio" orderName="yy" existValue="2" /><br />
		</td>
		</tr>
		</table>
		
		<select size="6"><option>aaaaaaaaaaaa</option><option>aaaaaaaaaaaa</option><option>aaaaaaaaaaaa</option></select>
		<input checked="checked">
	</body>
</html>