<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>浏览学生</title>
    <base href="<%=basePath%>"/>
    <script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        $(function () {

            loadStudentData();

            $("#btnLoader").click(function () {
                loadStudentData();
            });
        })

        function loadStudentData() {

            $.ajax({
                url:"student/queryStudent",
                type:"get",
                dataType:"json",
                success:function (data) {
                    $("#info").html("");
                    console.log(data);
                    $("#info").append("<td><tr>"+111+"</tr><tr>"+2222+"</tr></td>")
                    $.each(data,function (i,n) {
                        $("#info").append("<tr>")
                            .append("<td>" + n.id + "</td>")
                            .append("<td>" + n.name + "</td>")
                            .append("<td>" + n.email + "</td>")
                            .append("<td>" + n.age + "</td>")
                            .append("</tr>")
                    })
                }
            })
        }
    </script>
</head>
<body>
    <div align="center">
        lsitStudent.jsp从request作用域获取不到数据，原因是重定向过来的<br/>
        （但是可以通过EL表达式取参数）<br/>
        姓名：${param.name}<br/>
        邮箱：${param.email}<br/>
        年龄：${param.age}
    </div><br/>
    <div align="center">
        <table>
            <thead>
            <tr>
                <td>学号</td>
                <td>姓名</td>
                <td>邮箱</td>
                <td>年龄</td>
            </tr>
            </thead>
            <tbody id="info">

            </tbody>
        </table>
        <input type="submit" id="btnLoader" value="查询数据">
    </div>
</body>
</html>
