<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
	<head>
		<title> RailRunner </title>
	</head>
	<body>
		<h1> Welcome to railrunner </h1>
                <a href="<c:url value="/home"/>">home</a>
		<a href="<c:url value="/about" />">about</a>
                <a href="<c:url value="/faq" />">faq</a>
	</body>
</html>
