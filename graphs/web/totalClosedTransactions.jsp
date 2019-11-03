<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page import="java.sql.*" %>

<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 02.11.2019
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>total C.T.</title>
</head>
<body>

<h2>Welcome to total C.T.</h2>

<p>number: <%=request.getAttribute("test")%>
</p>
<h1>${test}</h1>
<h3>Data from data base</h3>
<%=request.getAttribute("db")%>


<h1>Boo</h1>


</body>
</html>
