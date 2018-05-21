<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;  charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>
    <form action = "login.form" method= "post">
User name:    <input type = "text" name = "name"/>
Password:     <input type="password" name="password"/>
              <input type="submit" value="login"/>
    </form>
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
    </body>
   
</html>
          