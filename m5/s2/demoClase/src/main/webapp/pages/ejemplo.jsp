<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://jakarta.servlet.jsp.jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo JSTL en Jakarta</title>
</head>
<body>
	<h1>Listado de Productos</h1>
	<ul>
	<c:foreach items="${ requestScope.productos }" var="producto">
		<li>${ producto.nombre } - ${ producto.precio }</li>
	</c:foreach>
	</ul>
</body>
</html>