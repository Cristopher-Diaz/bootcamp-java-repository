<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Persona</title>
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
		<br><h1>Formulario de Agregar Personas</h1><br>
			<form action="PersonaServlet" method="post">
				<div class="mb-3">
					<label for="idPersona" class="form-label">ID</label> <input
						type="text" class="form-control" id="idPersona" name="id">
				</div>

				<div class="mb-3">
					<label for="nombre" class="form-label">Nombre</label> <input
						type="text" class="form-control" id="nombre" name="nombre">
				</div>

				<div class="mb-3">
					<label for="edad" class="form-label">Edad</label> <input
						type="text" class="form-control" id="edad" name="edad">
				</div>
				<div class="mb-3">
					<button type="submit" name="accion" value="agregar" class="btn btn-primary">Agregar</button>
				</div>
		</div>
		</form>

	</div>


</body>
</html>