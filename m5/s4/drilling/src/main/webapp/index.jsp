<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="jakarta.tags.core"%>	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<br>
	<br>
	<div class="row">
		<div class="col-3"></div>
		<div class="col-6">
			<div class="card-group">
				<div class="card">
					<img src="images/login.jpg" class="card-img-top" alt="..."
						width="225px" height="225px">
					<div class="card-body">
						<form action="ProcesaLogin" method="post">
							<div class="mb-3">
								<input type="text" class="form-control" placeholder="login"
									name="user">
							</div>
							<div class="mb-3">
								<input type="password" class="form-control"
									placeholder="password" name="pass">
							</div>
							<div class="mb-3">
								<button type="submit" class="btn btn-primary">LOGIN</button>
							</div>
						</form>
					</div>
				</div>

			</div>
			<!-- Mostrar mensaje de error si el login falla -->
			<c:if test="${not empty msjError}">
				<p style="color:red;">${msjError}</p>
			</c:if>
			
			
		</div>
	</div>

</body>
</html>