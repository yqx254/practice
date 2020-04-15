<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/9
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>关键词信息</title>
</head>
<body>

<h2>关键词</h2>
<form:form method="POST" action="/key/keyword-update">
    <table>
        <tr>
            <td><form:label path="id">ID</form:label></td>
            <td><form:input path="id"  disabled="true"/></td>
        </tr>
        <tr>
            <td><form:label path="content">关键词</form:label></td>
            <td><form:input path="content" /></td>
        </tr>
        <tr>
            <td><form:label path="type">类型</form:label></td>
            <td><form:input path="type" /></td>
        </tr>
        <tr>
            <td><form:label path="searchCnt">搜索次数</form:label></td>
            <td><form:input path="searchCnt" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="查询"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
