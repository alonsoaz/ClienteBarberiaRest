<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../../w3c/css/redistrop.css"/>
</head>
<body>

	<form action="registertipo" method="POST">
		<div class="container">

			<p align="center">
				<b>REGISTRAR TIPO DE PRODUCTO</b>
			</p>

			<hr>

			<label for="nombre"><b>TIPO</b></label> 
			<input type="text" placeholder="INGRESAR TIPO" name="tipo"  
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un nombre válido">
          
			<div class="clearfix">
			<input type="submit" name="action" class="registerbtn" 
			value="REGISTRAR">
			</div>
		</div>
	</form>


</body>
</html>
