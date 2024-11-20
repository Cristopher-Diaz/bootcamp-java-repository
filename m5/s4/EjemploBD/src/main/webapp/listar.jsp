<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="c" uri="jakarta.tags.core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Personas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
<div class="row">
		<div class="col-3"></div>
		<div class="col-6">
		<br><h1>Listado de Personas</h1><br>
		
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Nombre</th>
      <th scope="col">edad</th>
    </tr>
  </thead>
  <tbody>
    	<c:forEach items="${personas}" var="persona">
				<tr>
					<td>${persona.nombre}</td>
					<td>${persona.apellido}</td>
				</tr>
			</c:forEach>
   
  </tbody>
</table>
<br>
<a href="PersonaServlet?opcion=agregar">Agregar Persona</a>
</div>
</body>
</html>