<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src = "angular.js"></script>
</head>
<body ng-app="bloodApp" ng-controller="bloodController">
<h1>welcome to ${param.name}</h1>
<a href ="allDonors.form">edit</a>
<form action="timeline.form" method="post">
<textarea rows="5" cols="100" name="post" ng-model="text"></textarea>
<input type="button" value="post"/>
</form>
</body>

