<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>第三个springmvc项目</title>
    <script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
    <!-- 加入一个base标签，是htm语言中的标签。
         表示当前页面中访问地址的基地址你的页面中所有没有"开头的地址，
         都是以base标签中的地址为参考地址 -->

    <base href="<%=basePath%>">
</head>
<body>
    <div align="center" >
        <p1>SSM整合</p1><br/>
        <div><img src="static/imgs/p1.jpg"/></div><br/>
        <table>
            <tr>
                <td><a href="addStudent.jsp">注册学生</a></td>
            </tr>
            <tr>
                <td><a href="listStudent.jsp">浏览学生</a></td>
            </tr>
            <tr>
                <td><a href="forwardRedict.jsp">测试转发重定向</a></td>
            </tr>
            <tr>
                <td><a href="testException.jsp">测试统一异常处理类</a></td>
            </tr>
            <tr>
                <td><a href="testInterceptor.jsp">拦截器测试</a></td>
            </tr>
        </table>
    </div>
    <br/>
    <div align="center" >
        <p>测试拦截器验证登录功能</p>
        <form action="testInterceptor" method="post">
            姓名：<input type="text" name="name"><br/>
            邮箱：<input type="text" name="email"><br/>
            年龄：<input type="text" name="age"><br/>
            <input type="submit" value="提交">
        </form>
        <tr>
            <td><a href="login.jsp">登录</a></td>
        </tr>
        <tr>
            <td><a href="logout.jsp">退出</a></td>
        </tr>
    </div>
</body>
</html>
