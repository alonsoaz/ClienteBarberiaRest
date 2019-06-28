<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../../w3c/css/redistrop.css"/>
</head>
<body>

	<form action="registerbarb" method="POST">
		<div class="container">

			<p align="center">
				<b>REGISTRAR BARBERO</b>
			</p>

			<hr>

			<label for="nombre"><b>NOMBRE</b></label> 
			<input type="text" placeholder="INGRESAR NOMBRE" name="nombre"  
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un nombre válido">
			 
			<label for="apellidos"><b>APELLIDO</b></label> 
			<input type="text" placeholder="INGRESAR APELLIDO" name="apellido" 
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un apellido válido"> 

			<label for="email"><b>TELEFONO</b></label> 
			<input type="number" placeholder="INGRESAR TELEFONO" name="telefono" 
			required pattern="[0-9]{9,9}"
			title="Ingrese un número de celular válido"> 
			 
			<label for="dni"><b>DNI</b> </label> 
			<input type="number" placeholder="INGRESAR DNI" name="dni" 
			required pattern="[0-9]{8,8}"
			title="Tamaño: 8">
			 
			<label for="email"><b>E-MAIL</b></label> 
			<input type="email" placeholder="INGRESAR EMAIL" name="email" 
			required pattern="^[a-zA-Z0-9.+@+[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"
			title="Ingresar un e-mail válido"> 
			
			<label for="email"><b>DIRECCION</b></label> 
			<input type="text" placeholder="INGRESAR DIRECCION" name="direccion" 
			>
          
			<div class="clearfix">
			<input type="submit" name="action" class="registerbtn" 
			value="REGISTRAR">
			</div>
		</div>
	</form>


</body>
</html>
