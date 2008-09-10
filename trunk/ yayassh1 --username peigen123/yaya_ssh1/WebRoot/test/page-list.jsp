<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>分页用户列表</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/screen.css">

	</head>

	<body>
		<div>
			<display:table name="userList" class="simple" id="user" partialList="true" size="resultSize" pagesize="20"
				sort="external" requestURI="page-list.do?method=getUserPartialList">
				<display:column property="userId" title="用户ID" sortable="true"
					headerClass="sortable" />
				<display:column property="userName" title="用户名" sortable="true"
					headerClass="sortable" />
				<display:column property="userPwd" title="用户密码" style="" maxLength="5"
					sortable="true" headerClass="sortable" />
				<display:column property="userSex" title="用户性别" sortable="true"
					headerClass="sortable" />
				<display:column property="userAge" title="用户年龄" sortable="true"
					headerClass="sortable" />
				<display:column title="操作">
					<c:url var="url" scope="page" value="toUpdateUser.do">
						<c:param name="userId" value="${user.userId}" />
						<c:param name="method" value="toUpdateUser" />
					</c:url>
					<html:link action="${url}">更新</html:link>
					<c:url var="url" scope="page" value="deleteUser.do">
						<c:param name="userId" value="${user.userId}" />
						<c:param name="method" value="deleteUser" />
					</c:url>
					<html:link action="${url}">删除</html:link>
				</display:column>
			</display:table>
		</div>
	</body>
</html>
