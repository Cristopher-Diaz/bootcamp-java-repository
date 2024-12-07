<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Departamentos</title>
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
			<br>
			<h1>Listado de Departamento</h1>
			<br>
			<table>
				<tr>
					<td><form action="Servlet" method="post">
							<div class="mb-3">
								<label for="nombre" class="form-label">Nombre
									Departamento</label> <input type="text" class="form-control"
									id="nombre" name="nombre">
							</div>
							<div class="mb-3">
								<button type="submit" class="btn btn-primary" name="accion"
									value="filtroNombre">Filtrar</button>
							</div>

						</form></td>
					<td><form action="Servlet" method="post">
							<div class="mb-3">
								<label for="numero" class="form-label">Número
									Departamento</label> <input type="text" class="form-control"
									id="numero" name="numero">
							</div>
							<div class="mb-3">
								<button type="submit" class="btn btn-primary" name="accion"
									value="filtroNumero">Filtrar</button>
							</div>

						</form></td>
					<td><form action="Servlet" method="post">
							<div class="mb-3">
								<label for="nombre" class="form-label">Ubicación </label> <select
									class="form-select" name="ubicacionDepto">
									<c:forEach items="${ubicaciones}" var="ubicacion">
										<option value="${ubicacion}">${ubicacion}</option>
									</c:forEach>
								</select>

							</div>
							<div class="mb-3">
								<button type="submit" class="btn btn-primary" name="accion"
									value="filtroUbicacion">Filtrar</button>
							</div>

						</form></td>
				</tr>

			</table>
			<br> <br> <a href="Servlet?opcion=listar">Quitar
				Filtros</a>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Nombre Departamento</th>
						<th scope="col">Número Departamento</th>
						<th scope="col">Ubicación</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${departamentos}" var="departamento">
						<tr>
							<td>${departamento.nombre}</td>
							<td>${departamento.numero}</td>
							<td>${departamento.ubicacion.nombre}</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
			<br>
		</div>
</body>
</html>