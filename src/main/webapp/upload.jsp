<%--
  Created by IntelliJ IDEA.
  User: 20609
  Date: 2022/12/11
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    pageContext.setAttribute("cpt",request.getContextPath());
%>
<%=pageContext.getAttribute("cpt")%>

<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
<html>

<head>
    <title>file upload</title>
</head>
<body>
<form method="post" action="<%=pageContext.getAttribute("cpt")%>/upload" enctype="multipart/form-data">
    用户名:<input type="text" name="username"/><br/>
    用户头像:<input type="file" name="headerImg"><br/>
    <input type="submit" value="上传提交"/>
</form>
${pageContext.getAttribute("cpt")}
</body>
</html>
