<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // JSTL Java Standard Tag Library
    %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome !</h1>
<h2>List of series</h2>
<ul>
<c:forEach items="${series}" var="serie">
	<li>${serie.nom} (${serie.prixEnEuros} &euro;)</li>
		<c:forEach items="${serie.saisons}" var="saison">
			${saison.nom}<br>
		</c:forEach>
</c:forEach>
</ul>
</body>
</html>