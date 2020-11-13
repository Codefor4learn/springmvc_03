<%--
  Created by IntelliJ IDEA.
  User: hz
  Date: 2020/10/6
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    模拟登出,从session删除数据
    <%
        session.setAttribute("name" , "");
    %>
</body>
</html>
