<%--主页面--%>
<%--改动前问题
13 代码段落是否被合适地以空行分隔？
14 是否合理地使用了空格使程序更清晰？
15 代码行长度是否在要求之内？
16 折行是否恰当？

--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html><%--
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
    <li><a href="${ctx}/addid">插入功能</a></li>
    <li><a href="${ctx}/outid">输出功能</a></li>
    <li><a href="${ctx}/getout">退出功能</a></li>
  <li><a href="${ctx}/searchid">查找功能</a></li><li><a href="${ctx}/deletid">删除功能</a></li>
</ul>
</body>
</html>
--%>

<%--改动后--%>
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
    <li><a href="${ctx}/addid">插入功能</a></li>
    <li><a href="${ctx}/outid">输出功能</a></li>
    <li><a href="${ctx}/getout">退出功能</a></li>
    <li><a href="${ctx}/searchid">查找功能</a></li>
    <li><a href="${ctx}/deletid">删除功能</a></li>
</ul>
</body>
</html>
