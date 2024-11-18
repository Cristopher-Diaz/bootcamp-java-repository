<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

	<h1>Generador de facturas</h1>
	
	<div class="container">
		
		<form action="InputHandlerServlet" method="post">

			  <div class="col-md-4">
			    <label for="full_name" class="form-label">Nombre completo</label>
			    <input type="text" class="form-control" id="full_name" name="full_name">
			  </div>
	
			  <div class="col-md-4">
			    <label for="address" class="form-label">Dirección</label>
			    <input type="text" class="form-control" id="address" name="address">
			  </div>
			  
				<table class="mt-3 table table-dark table-bordered">
				  <thead>
				    <tr>
				      <th scope="col">Producto</th>
				      <th scope="col">Descripcción</th>
				      <th scope="col">Valor unidad</th>
				      <th scope="col">Cantidad</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th>Mother Board</th>
				      <td>ASUS LGA1200</td>
				      <td>$249000</td>
				      <td> <input type="text" id="p1" name="cantp1"> </td>
				    </tr>
				    <tr>
				      <th>RAM</th>
				      <td>DDR4 8Gb 2400Mhz</td>
				      <td>$45990</td>
				      <td><input type="text" id="p2" name="cantp2"></td>
				    </tr>
				    <tr>
				      <th>CPU</th>
				      <td>i7 10700 8 Cores </td>
				      <td>$379000</td>
				      <td><input type="text" id="p3" name="cantp3"></td>
				    </tr>
				 	    <tr>
				      <th>Tarjeta de video</th>
				      <td>MSI GeForce GTX 1650 </td>
				      <td>$219990</td>
				      <td><input type="text" id="p4" name="cantp4"></td>
				    </tr>
				  </tbody>
				</table>
			  
			  <button type="submit" class="mt-3 btn btn-primary">Generar factura</button>

		</form>
		
	</div>

	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>