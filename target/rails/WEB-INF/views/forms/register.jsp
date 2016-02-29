<%-- 
    Document   : register
    Created on : Feb 23, 2016, 11:30:39 AM
    Author     : pawel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        <h1>Registration</h1>
        <sf:form method="POST" commandName="person">
            first name:<sf:input type="text" path="firstName" />
            last name:<sf:input type="text" path="lastName" />
            email <sf:input type="email" path="username" />
            password <sf:input type="password" path="password" />
            <sf:button type="submit" value="Register">Register</sf:button>
        </sf:form>
    </body>
</html>
