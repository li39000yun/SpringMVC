<%--
  Created by IntelliJ IDEA.
  User: lyq
  Date: 2016/11/20
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello world</title>
</head>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script type="text/javascript" src="<%=basePath %>js/jquery-2.0.3.js"></script>
<script type="text/javascript">
$(function() {
    $("#btn").click(function () {
        $.post("/mvc/getPerson",{name:$("#name").val()},function(data) {
            alert(data);
        });
    });
});
</script>
<body>
hello world!
<input type="button" id="btn" value="测试Ajax">
<div>
    <label>姓名：</label>
    <input id="name" >
</div>
<div>
    <form action="/mvc/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="file"><br>
        <input type="submit" value="submit">
    </form>
</div>
</body>
</html>
