<%--
  Created by IntelliJ IDEA.
  User: 66
  Date: 2022/12/11
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
    <%
        pageContext.setAttribute("cpt",request.getContextPath());
    %>
<head>
    <title>测试RequestBody注解</title>
</head>
<body>
<form method="post" action="testRequestBody" enctype="multipart/form-data">
    <input type="text" value="Hello world" name="lastName">
    <input type="text" value="2060953137@163.com" name="email"/>
    <input type="text" value="0" name="gender">
    <input type="file" name="file">
    <input type="submit" value="提交">
</form>
<a href="testRequestBody01" >测试提交一个JSON格式的字符串给后台</a>


</body>
    <script type="text/javascript">
        $("a:first").click(function () {
            //定义一个js对象
            var emp={lastName:"韩梅梅",email:"2060953737@qq.com",gender:0};
            alert(typeof emp);
            var empStr = JSON.stringify(emp)
            alert(typeof empStr);
            $.ajax({
                url:"testRequestBody01",
                type:"POST",
                data:empStr,
                contentType:"application/json",
                success:function (data) {
                    //data是一个成功页面 通过alert弹出
                    alert(data)
                }
            });
            return false;
        });
    </script>
</html>
