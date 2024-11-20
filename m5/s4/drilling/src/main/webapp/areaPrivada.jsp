<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="Deslogueo">Cerrar Sesión</a>
    <label>Bienvenido/a ${usuario}</label>
  </div>
</nav>
<br><br>
<h1>Area Privada</h1>
<p>Si estas viendo esta página es porque te has logueado correctamente</p>

<div class="row">
		<div class="col-2"></div>
		<div class="col-8">
		<br><h1>Listado de Departamentos</h1><br>
		
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">N° Departamento</th>
      <th scope="col">Nombre</th>
      <th scope="col">Ubicación</th>
    </tr>
  </thead>
  <tbody>
    	<c:forEach items="${departamentos}" var="departamento">
				<tr>
					<td>${departamento.numero}</td>
					<td>${departamento.nombre}</td>
					<td>${departamento.ubicacion}</td>
				</tr>
		</c:forEach>
   
  </tbody>
</table>
${departamentos}


</body>
</html>