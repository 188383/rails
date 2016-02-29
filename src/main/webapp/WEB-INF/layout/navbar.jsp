<%-- 
    Document   : navbar.jsp
    Created on : Feb 25, 2016, 12:08:36 PM
    Author     : pawel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sf" %>
<div id="navbar">
    <ul>
                <!-- here we should make the changing of Urls dynamic -->
        <li><a href="<sf:url value="/home"/>">home</a></li>|
        <li><a href="<sf:url value="/terminal_anywhere" />">Terminal Anywhere Solution</a></li>|
        <li><a href="<sf:url value="/relationships" />">Relationships</a></li>|
        <li><a href="<sf:url value="/international" />">International</a></li>|
        <li><a href="<sf:url value="/news" />">News & Events</a></li>|
        <li><a href="<sf:url value="/lane_analysis" />">Lane Analysis</a></li>|
        <li><a href="<sf:url value="/about" />">about</a></li>|
        <li><a href="<sf:url value="/contact" />">contact</a></li>
    </ul>
</div>

