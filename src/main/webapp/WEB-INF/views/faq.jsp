<%-- 
    Document   : faq
    Created on : Feb 22, 2016, 5:19:08 PM
    Author     : pawel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FAQ Page</title>
    </head>
    <body>
        <h1>FAQ</h1>
        <a href="<c:url value="/home"/>">home</a>
	<a href="<c:url value="/about" />">about</a>
        <a href="<c:url value="/faq" />">faq</a>
        This is the faq page. The FAQ page is for posting the most repeated questions
    </body>
</html>
