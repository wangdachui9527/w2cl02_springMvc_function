<%--
  Created by IntelliJ IDEA.
  User: admin123
  Date: 2019/11/29
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>程序入门</h3>
    <a href="hello">程序入门</a><br/>
    <form action="getMessage" method="post">
        <input type="hidden" name="uid" value="9527">
        <input id="phoneNum" name="phoneNum" placeholder="输入手机号"/>
        <input type="submit" value="获取验证码"/>
    </form>
</body>
</html>
