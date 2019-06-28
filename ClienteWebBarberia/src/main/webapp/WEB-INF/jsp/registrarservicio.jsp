<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../../w3c/css/redistrop.css"/>
</head>
<body>

	<form action="registerserv" method="POST">
		<div class="container">

			<p align="center">
				<b>REGISTRAR SERVICIOS</b>
			</p>

			<hr>

			<label for="nombre"><b>SERVICIO</b></label> 
			<input type="text" placeholder="INGRESAR SERVICIO" name="servicio"  
			maxlength="45" 
			title="Se necesita un nombre válido">
			 
			<label for="dni"><b>DURACION</b> </label> 
			<input type="number" placeholder="0" name="duracion" 
			required pattern="[0-9]{0,8}"
			title="Tamaño: 8">
			 
			<label for="dni"><b>PRECIO</b> </label> 
			<input type="number" step="0.01" min="0" lang="en" placeholder="0.00" name="precio" 
			required pattern="[0-9]{0,8}"
			title="Tamaño: 8">
			
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
