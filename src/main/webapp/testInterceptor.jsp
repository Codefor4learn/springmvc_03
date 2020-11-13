<%--
  Created by IntelliJ IDEA.
  User: hz
  Date: 2020/10/6
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>拦截器测试</title>
</head>
<body>
<div align="center">
    <p>拦截器测试</p>
    <form action="testInterceptor" method="post">
        姓名：<input type="text" name="name"><br/>
        邮箱：<input type="text" name="email"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
