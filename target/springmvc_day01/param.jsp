<%--
  Created by IntelliJ IDEA.
  User: admin123
  Date: 2019/11/29
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<a href="param/test?username=admin&password=123">参数</a>--%>
    <%--<form action="param/saveAccount" method="post">--%>
        <%--姓名：<input type="text" name="userName"/><br>--%>
        <%--密码：<input type="text" name="password"/><br>--%>
        <%--金额：<input type="text" name="money"/><br>--%>

        <%--用户名：<input type="text" name="user[0].uname"/><br>--%>
        <%--年龄：<input type="text" name="user[0].age"/><br>--%>

        <%--用户名：<input type="text" name="map['one'].uname"/><br>--%>
        <%--年龄：<input type="text" name="map['one'].age"/><br>--%>
        <%--<input type="submit" value="提交"><br>--%>
    <%--</form>--%>
    <form action="param/saveUser" method="post">
        姓名：<input type="text" name="uname"/><br>
        年龄：<input type="text" name="age"/><br>
        生日：<input type="text" name="birthday"/><br>
        <input type="submit" value="保存"><br>
    </form>

</body>
</html>
