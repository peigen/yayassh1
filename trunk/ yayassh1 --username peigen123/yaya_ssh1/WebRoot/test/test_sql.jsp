<%@ page language="java" pageEncoding="UTF-8" import="java.util.*,java.sql.*"%>
<%@ page import="com.sync.sninfo.test_user.entity.TUser;"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'list.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/screen.css">

	</head>

	<body>
		<div>
			<%
				Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
				String url = "jdbc:jtds:sqlserver://192.168.1.64:1433/scl";
				String user = "sa";
				String password = "sa";
				Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn
						.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
								ResultSet.CONCUR_UPDATABLE);
				String sql = "select * from log4j_log";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
			%>
			您的第一个字段内容为：<%=rs.getString(1)%><br>
			您的第二个字段内容为：<%=rs.getString(2)%><br>
			<%
				}
				out.print("数据库操作成功，恭喜你");
				rs.close();
				stmt.close();
				conn.close();
			%>

		</div>
	</body>
</html>
