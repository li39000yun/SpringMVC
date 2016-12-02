<%@ page import="com.lyq.model.Person" %><%--
  Created by IntelliJ IDEA.
  User: lyq
  Date: 2016/11/20
  Time: 0:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show something</title>
</head>
<body>
show something<br>

<% Person p = (Person) request.getAttribute("p"); %>
<%=p.getName()%>
</body>
</html>
