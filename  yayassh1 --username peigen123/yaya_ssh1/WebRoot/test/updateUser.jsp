<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			src="./js/validate/validation-framework.js"></script>
	</head>

	<body>
		更新页面
		<div id="errorDiv" style="color: red; font-weight: bold;"></div>
		<html:form action="updateUser.do?method=updateUser"
			onsubmit="return doValidate(this);" styleId="addUserFormId">
		用户名:<html:text property="userName" value="${user.userName}" />
			<br />
		用户密码:<html:text property="userPwd" value="${user.userPwd}" />
			<br />
		用户年龄:<html:text property="userAge" value="${user.userAge}" />
			<br />
		用户性别: <html:select property="userSex">
					<c:choose>
						<c:when test="${user.userSex == 'male'}">asdf
							<html:option value="male">帅哥</html:option>
							<html:option value="female">靓女</html:option>
						</c:when>
						<c:when test="${user.userSex == 'female'}">
							<html:option value="female">靓女</html:option>
							<html:option value="male">帅哥</html:option>
						</c:when>
					</c:choose>
				</html:select>
			<br />
			<html:hidden property="userId" value="${user.userId}" />
			<html:submit value="提交" />
			<html:cancel value="重置" />
		</html:form>
	</body>
</html>
