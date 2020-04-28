<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="${ctx}/login" method="post">
        <p>学号：<input type="text" name="username"></p>
        <p>姓名：<input type="text" name="password"></p>
        <p>出生日期：<input type="text" name="username"></p>
        <p>性别：<input type="text" name="username"></p>
        <p><button type="submit">操作</button></p>

    </form>
</body>
</html>
