<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<ul>
    <li>    <a href="${pageContext.request.contextPath}/agences">agence</a>
    </li>
    <li>    <a href="${pageContext.request.contextPath}/agences/new">nouveau agence</a>
    </li>
</ul>
