<%--
  Created by IntelliJ IDEA.
  User: hz
  Date: 2020/10/6
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试转发重定向</title>
</head>
<body>
    <div align="center">
        <p>当方法返回ModelAndVieW实现forward</p>
        <form action="doForward" method="post">
            姓名：<input type="text" name="name"><br/>
            邮箱：<input type="text" name="email"><br/>
            年龄：<input type="text" name="age"><br/>
            <input type="submit" value="提交">
        </form>
    </div>
    <br/>
    <div align="center">
        <p>当方法返回ModelAndVieW实现redirect 到页面</p>
        <form action="doRedirect" method="post">
            姓名：<input type="text" name="name"><br/>
            邮箱：<input type="text" name="email"><br/>
            年龄：<input type="text" name="age"><br/>
            <input type="submit" value="提交">
        </form>
    </div>
    <div align="center">
        <p>当方法返回ModelAndVieW实现redirect 到控制器</p>
        <form action="doRedirect2" method="post">
            姓名：<input type="text" name="name"><br/>
            邮箱：<input type="text" name="email"><br/>
            年龄：<input type="text" name="age"><br/>
            <input type="submit" value="提交">
        </form>
    </div>
</body>
</html>
