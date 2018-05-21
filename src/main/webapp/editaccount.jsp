<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
<script src="angular.js"></script>
</head>
<body >
<h1>edit your account</h1>

 <form:form action="register.form" method ="POST" commandName="reg">
        <table border=1px>
          <tr>
          <th>USER NAME</th>
           <td><input type = "text" name="name"/></td>
          </tr>
          <tr>
          <th>PASSWORD</th>
           <td><input type="password" name="password"/></td>
          </tr>
          <tr>
          <th>AGE</th>
           <td><input name="age"/></td>
          </tr>
          <tr>
          <th>MOBILE</th>
           <td><input name="mobile"/></td>
          </tr>
          <tr>
          <th>PINCODE</th>
           <td><input name="pin"/></td>
          </tr>
        </table>
        <input type="submit" value="submit"/>
      </form:form>
      <table border =3px align="right">
      <tr>
          <th>NAME</th>
          <th>PASSWORD</th>
          <th>AGE</th>
          <th>MOBILE</th>
          <th>PINCODE</th>
          </tr>
         <c:forEach items="${list}" var="donors">
         <tr>
         	<td> <c:out value="${donors.name }"/></td>
         	<td> <c:out value="${donors.password}"/></td>
         	<td> <c:out value="${donors.age }"/></td>
         	<td> <c:out value="${donors.mobile }"/></td>
         	<td> <c:out value="${donors.pincode }"/></td>
         </tr>
         </c:forEach>
      </table>
     
      <a href="logout.jsp">logout</a>
</body>

</html>
