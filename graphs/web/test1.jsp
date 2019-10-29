<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 24.10.2019
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Hi</h3>

<%--<c:forEach var="stringFromList" items="${nameAttribute}">--%>
<%--        ${stringFromList}<br>--%>
<%--</c:forEach>--%>

<%--<%--%>
<%--    List<String> testList = new ArrayList<>();--%>

<%--    for (String tmp : testList) {--%>
<%--        out.print(tmp);--%>
<%--    }--%>
<%--%>--%>

<%=
request.getAttribute("nameAttribute")%>

<br>
Your list is:<br>
<%=request.getAttribute("myList")%>

<br>


<h2>Your number is <%=request.getAttribute("number")%>
</h2>

</body>
</html>
