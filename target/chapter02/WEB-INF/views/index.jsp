<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
    </head>
    <body>
    <h2>学生管理系统</h2>

    <ul>
        <li><a href="${ctx}/login/110312">插入功能</a></li>
        <li><a href="${ctx}/login/110312">输出功能</a></li>
        <li><a href="${ctx}/login/110312">退出功能</a></li>
        <li><a href="${ctx}/login/110312">查找功能</a></li>
        <li><a href="${ctx}/login/110312">删除功能</a></li>
    </ul>
    </body>
</html>
