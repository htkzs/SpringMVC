<%--
  Created by IntelliJ IDEA.
  User: 66
  Date: 2022/12/10
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>add employees</title>
</head>
<!--通过JSTL获取项目的根路径-->
<c:set var="basePath" value="pageContext.request.contextPath"/>
<%
    pageContext.setAttribute("ctp",request.getContextPath());
%>
<%= pageContext.getAttribute("ctp")%>

   <!--SpringMVC的标签莫认通过command 作为model的默认key 可以通过 modelAttribute指定这个隐含域的key值-->
   <form:form action="${ctp}/emp" modelAttribute="employee" method="post">
       <!--表单标签
       通过SpringMVC的表单标签可以实现将横型数据中的属性和HTML表单元素相绑定，以实现表单数据更便捷编辑和表单值的回显
       1) springMVC认为，表单数据中的每一项最终都是要回显的,
          path指定的是一个属性,这个属性是从隐含模型（请求域中取出的某个对象中的属性)；
          path指定的每一个属性,请求域中必须有一个对象，拥有这个属性;
          这个对象就是请求域中的command;
       -->
       lastName:<form:input path="lastName"/><br/>
       email:<form:input path="email"/><br/>

       gender:<br/>
            男： <from:radiobutton path="gender" value="1"/><br/>
            女： <from:radiobutton path="gender" value="0"/><br/>
       <!--
       items="" : 指定要遍历的集合，自动遍历，遍历出的每一个元素是一个department
       itemLabel="departmentName"：指定遍历出来这个对象的那个属性作为option标签的值
       itemValue="id"：指定遍历出来的那个属性作为要提交的value值
       -->
       department: <form:select path="department.id" items="${deptItems}" itemLabel="departmentName" itemValue="id"/><br/>
       <input type="submit" value="添加员工"><br/>
   </form:form>










<%--    <form action="">--%>
<%--        lastName:<input type="text" name="lastName"/><br/>--%>
<%--        email:<input type="text" name="email"/><br/>--%>
<%--        gender:<br/>--%>
<%--              男：<input type="radio" name="gender" value="1"/><br/>--%>
<%--              女：<input type="radio" name="gender" value="0"/><br/>--%>
<%--        department:--%>
<%--        <select name="department.id">--%>
<%--            <c:forEach items="${requestScope.deptItems}" var="deptItem">--%>
<%--                 <option value="${deptItem.id}">${deptItem.departmentName}</option>--%>
<%--            </c:forEach>--%>
<%--        </select><br/>--%>
<%--        <input type="submit" value="提交添加">--%>
<%--    </form>--%>
<body>

</body>
</html>
