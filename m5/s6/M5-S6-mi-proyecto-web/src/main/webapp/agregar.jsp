<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Producto</title>
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
		<br><h1>Formulario de Agregar Producto</h1><br>
			<form action="productos" method="post">

				<div class="mb-3">
					<label for="nombre" class="form-label">Nombre</label> <input
						type="text" class="form-control" id="nombre" name="nombre">
				</div>

				<div class="mb-3">
					<label for="precio" class="form-label">Precio</label> <input
						type="text" class="form-control" id="precio" name="precio">
				</div>
				<div class="mb-3">
					<button type="submit" class="btn btn-primary">Agregar</button>
				</div>
		</div>
		</form>

	</div>


</body>
</html>