<%--
  Created by IntelliJ IDEA.
  User: luulo
  Date: 1/8/2024
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="login" method="post">
        <label for="username">Username: </label>
        <input type="text" placeholder="Input username" name="username" id="username"> <br>
        <label for="password">Password: </label>
        <input type="password" placeholder="Input password" name="password" id="password"> <br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
