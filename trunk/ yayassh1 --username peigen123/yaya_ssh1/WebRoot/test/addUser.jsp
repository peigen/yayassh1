<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'user.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
		<link rel="stylesheet" type="text/css" href="styles.css">
		-->
		<script type="text/javascript" language="javascript"
			src="${pageContext.request.contextPath}/js/validate/validation-framework.js"></script>
	</head>

	<body>
		新增页面
		<div id="errorDiv" style="color: red; font-weight: bold;"></div>
		<html:form styleId="addUserFormId" action="addUser.do?method=addUser" onsubmit="return doValidate(this);">
		用户名:<html:text property="userName" />
			<br />
		用户密码:<html:text property="userPwd" />
			<br />
		用户年龄:<html:text property="userAge" maxlength="3" onkeyup="value=value.replace(/\D/,'');" />
			<br />
		用户性别:<html:select property="userSex">
					<html:option value="male">帅哥</html:option>
					<html:option value="female">靓女</html:option>
				</html:select>
			<br />
			<html:submit value="提交" />
			<html:reset value="重置" />
		</html:form>
	</body>
</html>
