<%--
  Created by IntelliJ IDEA.
  User: miso
  Date: 2020-09-11
  Time: 오후 5:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BOARD</title>
</head>
<body>
    <h3>REMOVE</h3>

    <form method="post" action="/board/post">
        <button type="submit" name="remove">Remove</button>
    </form>

    <a href="/board/get/list">LIST</a>
</body>
</html>
