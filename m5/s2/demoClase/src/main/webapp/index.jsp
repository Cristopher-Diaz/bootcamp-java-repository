<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1><%= "Hola Mundo desde JSP" %></h1>
    
    <%
       //Recuperar el nombre enviado
       String nombre = request.getParameter("nombre");
    %>
 
	<!-- Formulario JSP -->
	<form action="server" method="post">
		<label for="nombre">Ingresa tu nombre</label>
		<input type="text" id="nombre" name="nombre" required>
		<input type="submit" value="Enviar">
	</form>
 
    <%
    //Mostrar un saludo si es que el nombre fue ingresado
         if(nombre !=null && !nombre.trim().isEmpty()){
    %>
			<h2>Bienvenido <%= nombre %></h2>
	<%	}else{
	   	
	%>
	<h2>Por favor ingresa un nombre para recibir un saludo</h2>
    <%
	}
    %>
	
	
</body>
</html>