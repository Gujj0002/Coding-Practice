<%--
  Created by IntelliJ IDEA.
  User: Alpesh
  Date: 2020-07-15
  Time: 3:46 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    if (session.getAttribute("Username") != null){
        response.sendRedirect("index.jsp");
    }
%>

Welcome ${Username}

Welcome to servlet!!
</body>
</html>
