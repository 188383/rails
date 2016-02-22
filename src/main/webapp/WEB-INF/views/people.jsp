<%-- 
    Document   : people
    Created on : Feb 22, 2016, 7:53:00 PM
    Author     : pawel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>People Page</title>
        <style>
            #box{
                border: black solid;
                margin: 50px;
            }
            .slide{
                background-color:grey;
                margin:20px;
                list-style:none;
            }
        </style>
    </head>
    <body>
        <h1>People</h1>
        <div id="box">
            <ul>
            <c:forEach items="${personList}" var="person" >
                <li class="slide">
                <c:out value="${person.firstName}" />
                <br/>
                <c:out value="${person.lastName}" />
                <br/>
                <c:out value="${person.password}" />
                </li>
            </c:forEach>
            </ul>     
        </div>
    </body>
</html>
