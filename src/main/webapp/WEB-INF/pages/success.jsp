<%--
  Created by IntelliJ IDEA.
  User: 66
  Date: 2022/11/27
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    System.out.println("来到目标页面success.jsp");
%>
<br>
success request</br>
pageContext:${pageScope.msg}</br>
requestScope:${requestScope.msg}</br>
sessionScope:${sessionScope.msg}</br>
applicationContextScope:${applicationScope.msg}</br>

pageContext:${pageScope.message}</br>
requestScope:${requestScope.message}</br>
sessionScope:${sessionScope.message}</br>
applicationContextScope:${applicationScope.message}</br>


pageContext:${pageScope.subject}</br>
requestScope:${requestScope.subject}</br>
sessionScope:${sessionScope.subject}</br>
applicationContextScope:${applicationScope.subject}</br>

</body>
</html>
