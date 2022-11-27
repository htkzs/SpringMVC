<%--
  Created by IntelliJ IDEA.
  User: 66
  Date: 2022/11/27
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/Hello/index">Hello SpringMVC</a>
<a href="/book/{bookId}">查询一本图书</a>
<form method="post" action="/book/1">
    <input type="submit" name="添加图书">
</form>

<form method="post" action="/book/1">
    <input name="_method" value="put">
    <input type="submit" name="添加图书">
</form>

<form method="post" action="/book/1">
    <input name="_method" value="delete">
    <input type="submit" name="添加图书">
</form>

</body>
</html>
