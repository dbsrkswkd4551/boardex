<%--
  Created by IntelliJ IDEA.
  User: miso
  Date: 2020-09-11
  Time: 오후 2:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BOARD</title>
</head>
<body>
    <h3>READ</h3>
    <form method="get" action="/board/get">
        <button type="submit" name="modify">Modify</button>
        <button type="submit" name="remove">REMOVE</button>
    </form>

    <a href="/board/get/list">LIST</a>
</body>
</html>
