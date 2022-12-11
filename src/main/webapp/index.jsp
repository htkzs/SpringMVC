<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: 66
  Date: 2022/11/27
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%
    pageContext.setAttribute("cpt",request.getContextPath());
%>
<head>
    <title>Title</title>
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
</head>

<body>
<%= new Date()%>
<%= request.getContextPath()%>
<a href="/Hello/index">Hello SpringMVC</a>
<a href="/book/{bookId}">查询一本图书</a>
<form method="post" action="/book/1">
    <input type="submit" name="添加图书"/>
</form>

<form method="post" action="/book/1">
    <input name="_method" value="put"/>
    <input type="submit" name="添加图书"/>
</form>

<form method="post" action="/book/1">
    <input name="_method" value="delete"/>
    <input type="submit" name="添加图书"/>
</form>
<!--向服务端提交多个字段测试SpringMVC可以帮助我们封装为一个对象-->
<form action="/book" method="post">
    图书名称：<input type="text" name="bookName"/><br/>
    图书作者：<input type="text" name="author"/><br/>
    图书价格：<input type="text" name="price"/><br/>
    图书库存：<input type="text" name="stock"/><br/>
    图书销售量：<input type="text" name="sales"/><br/>
    作者省份：<input type="text" name="address.province"/><br/>
    作者所在市：<input type="text" name="address.city"/><br/>
    作者所在镇：<input type="text" name="address.town"/><br/>
    图书名称：<input type="submit" value="添加"/>
</form>
<!--用于演示数据库全字段更行带来的问题 使用@ModelAttribute解决-->
<form action="/updateBook" method="post">
    图书名称：
    图书作者：<input type="text" name="author"/><br/>
    图书价格：<input type="text" name="price"/><br/>
    图书库存：<input type="text" name="stock"/><br/>
    图书销售量：<input type="text" name="sales"/><br/>
    图书名称：<input type="submit" value="修改记录"/>
</form>


<a href="/handle">测试请求转发forward</a>
<a href="getAll/employees" id="ajaxButton">通过AJAX查询员工的信息</a>
<div>

</div>
</body>
<script type="text/javascript">
    $("#ajaxButton").click(function () {
        $.ajax({
            url:"getAll/employees",
            type:"GET",
            success:function (data) {
               console.log(data)
                $.each(data,function (){
                    var empInfo=this.lastName+"--->"+this.birth+"--->"+this.gender;
                    $("div").append(empInfo+"<br/>");
                });
            }
        });
        //禁用超链接的默认提交行为
        return false;
    });
</script>
</html>
