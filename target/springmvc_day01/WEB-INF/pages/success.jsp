<%--
  Created by IntelliJ IDEA.
  User: admin123
  Date: 2019/11/29
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="doVerification" method="post">
        <input type="text" name="verificationCode" placeholder="验证码">
        <input type="hidden" name="uid" value="9527"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
