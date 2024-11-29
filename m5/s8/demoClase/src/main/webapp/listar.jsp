<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Pedidos</title>
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
			<h1>Listado de Pedidos</h1>
			<br>

			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">ID Pedido</th>
						<th scope="col">Fecha</th>
						<th scope="col">Monto</th>
						<th scope="col">ID Cliente</th>
						<th scope="col">Nombre</th>
						<th scope="col">Correo</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${pedidos}" var="pedido">
						<tr>
							<td>${pedido.id}</td>
							<td>${pedido.fecha}</td>
							<td>${pedido.monto}</td>
							<td>${pedido.cliente.id}</td>
							<td>${pedido.cliente.nombre}</td>
							<td>${pedido.cliente.correo}</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
			<br>
		</div>
</body>
</html>