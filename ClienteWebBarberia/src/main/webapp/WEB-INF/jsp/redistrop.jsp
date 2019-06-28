<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../../w3c/css/redistrop.css"/>
</head>
<body>

	<form action="register" method="POST">
		<div class="container">

			<p align="center">
				<b>REGISTRO DE USUARIOS</b>
			</p>

			<hr>

			<label for="nombre"><b>NOMBRE</b></label> 
			<input type="text" placeholder="INGRESAR NOMBRE" name="nombre"  
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un nombre válido">
			 
			<label for="apellidos"><b>APELLIDO</b></label> 
			<input type="text" placeholder="INGRESAR APELLIDO" name="apellidos" 
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un apellido válido"> 

			<div class="dropdown">
				<select class="dropbtn" name="ltu">

						<option class="dropdown-content" value="0">SELECCIONAR CARGO</option>

						<c:forEach items="${lista}" var="ltu">

							<option value="${ltu.id}">${ltu.message}</option>

						</c:forEach>

				</select>
			</div>
			<p></p>
			<label for="aka"><b>ALIAS</b></label> 
			<input type="text" placeholder="INGRESAR ALIAS" name="aka" 
			maxlength="9" required pattern="[A-Za-z]+"
			title="Se necesita un alias. Sólo letras. Tamaño máximo: 9"> 
			 
			<label for="psw"><b>PASSWORD</b> </label> 
			<input type="password" placeholder="INGRESAR PASSWORD" name="psw" 
			required pattern="[A-Za-z0-9]{8,8}"
			title="Puede usar letras y números. Tamaño: 8">
			 
			<label for="email"><b>E-MAIL</b></label> 
			<input type="email" placeholder="INGRESAR EMAIL" name="email" 
			required pattern="^[a-zA-Z0-9.+@+[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"
			title="Ingresar un e-mail válido"> 
			
			<label for="email"><b>TELEFONO</b></label> 
			<input type="number" placeholder="INGRESAR TELEFONO" name="telefono" 
			required pattern="[0-9]{9,9}"
			title="Ingrese un número de celular válido"> 
			
			<label for="email"><b>DESCRIPCION</b></label> 
			<input type="text" placeholder="INGRESAR DESCRIPCION" name="descripcion" 
			>

			<div class="clearfix">
			<input type="submit" name="action" class="registerbtn" 
			value="REGISTRAR">
			</div>
		</div>
	</form>


</body>
</html>
