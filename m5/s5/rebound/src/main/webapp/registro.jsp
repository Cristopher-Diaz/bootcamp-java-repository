<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="row">
	<div class="col-2"></div>
	<div class="col-8">
	<h1>Formulario de Registro</h1>
	
	<form action="Servlet" method="post">
	
		<div class="mb-3">
	  		<label for="nombre" class="form-label">Nombre</label>
	  		<input type="text" class="form-control" id="nombre" name="nombre">
		</div>
		<div class="mb-3">
	  		<label for="username" class="form-label">Username</label>
	  		<input type="text" class="form-control" id="username" name="username">
		</div>
		<div class="mb-3">
	  		<label for="email" class="form-label">Email</label>
	  		<input type="email" class="form-control" id="email" name="email">
		</div>
		<div class="mb-3">
	  		<label for="password" class="form-label">Password</label>
	  		<input type="password" class="form-control" id="password" name="password">
		<div class="mb-3">
			<label for="rol" class="form-label">Role</label>
			<select class="form-select" id="rol" name="rol">
				<c:forEach var="rol" items="${roles}">
				<option value="${rol}">${rol}</option>
				</c:forEach>
			</select>
		</div>
		<div class="mb-3">
			<button type="submit" class="btn btn-primary">Enviar</button>
		</div>
	 
	</form>
 
 
 
 
	</div>
 
 
</div>

</body>
</html>