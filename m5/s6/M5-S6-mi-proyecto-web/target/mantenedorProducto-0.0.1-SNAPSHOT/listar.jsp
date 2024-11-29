<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="jakarta.tags.core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Productos</title>
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
		<br><h1>Listado de Productos</h1><br>
		
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nombre</th>
      <th scope="col">Precio</th>
    </tr>
  </thead>
  <tbody>
    	<c:forEach items="${productos}" var="producto">
				<tr>
					<td>${producto.id}</td>
					<td>${producto.nombre}</td>
					<td>${producto.precio}</td>
				</tr>
			</c:forEach>
   
  </tbody>
</table>
<br>
<a href="productos?opcion=agregar">Agregar Productos</a>
</div>
</body>
</html>