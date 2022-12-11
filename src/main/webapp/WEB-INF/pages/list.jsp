<%--
  Created by IntelliJ IDEA.
  User: 66
  Date: 2022/12/10
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    pageContext.setAttribute("cpt",request.getContextPath());
%>
<script type="text/javascript" src="${pageContext.getAttribute("cpt")}/scripts/jquery-1.9.1.min.js"></script>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+request.getContextPath()+"/";
    pageContext.setAttribute("cpt",request.getContextPath());
%>
<%= basePath%>

<html>
<head>
    <title>展示所有员工的列表信息</title>
</head>
<body>

     <table border="1" cellpadding="5px" cellspacing="0">
         <tr>
             <th>id</th>
             <th>lastName</th>
             <th>email</th>
             <th>gender</th>
             <th>departmentName</th>
             <th>birth</th>
             <th>EDIT</th>
             <th>DELETE</th>
         </tr>
         <c:forEach items="${requestScope.employees}" var="item">
             <tr>
                 <td>${item.id}</td>
                 <td>${item.lastName}</td>
                 <td>${item.email}</td>
                 <td>${item.id == 0?"女":"男"}</td>
                 <td>${item.department.departmentName}</td>
                 <td>${item.birth}</td>
                 <td><a href="${pageContext.getAttribute("cpt")}/emp/${item.id}">edit</a></td>
                 <td><a href="${pageContext.getAttribute("cpt")}/emp/${item.id}" class="delBtn">delete</a></td>
             </tr>
         </c:forEach>

     </table>
     <form action="${pageContext.getAttribute("cpt")}/emp/${item.id}" method="post" id="deleteForm">
         <input type="hidden" name="_method" value="delete">
     </form>
     <!--点击添加按钮跳转到添加员工信息的页面-->
     <a href="/SpringMVC_Restful_CRUD_war_exploded/toAddPage">添加员工</a>
     <script type="text/javascript">
         $(function(){
             $(".delBtn").click(function () {
                 $("#deleteForm").attr("action",this.href);
                 //提交表单
                 $("#deleteForm").submit();
                 //先禁用超链接的默认行为
                 return false;
             })
         })
     </script>
</body>
</html>
