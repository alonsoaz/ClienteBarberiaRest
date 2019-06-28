<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.barberia.response.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../../w3c/css/redistrop.css"/>
</head>
<body>

    <% 
    Object orquzr = session.getAttribute("rquzr");%>

	<%if(orquzr!=null){  %>

	<% List<RecuperarUsuario> arquzr = (List<RecuperarUsuario>) orquzr; %>
	
	<% for(int i =0; i < arquzr.size(); i++ ) { %>

	<form action="update" method="POST">
		<div class="container">

			<p align="center">
				<b>ACTUALIZAR DATOS DE USUARIO</b>
			</p>

			<hr>

			<input type="hidden" placeholder="INGRESAR NOMBRES" name="idu"
			value="<%=aidi %>"
			>

			<label for="nombre"><b>NOMBRES</b></label> 
			<input type="text" placeholder="INGRESAR NOMBRES" name="nombre"  
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un nombre válido"
			value="<%= arquzr.get(i).getAnombre()%>"
			>
			 
			<label for="apellidos"><b>APELLIDOS</b></label> 
			<input type="text" placeholder="INGRESAR APELLIDOS" name="apellidos" 
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un apellido válido"
			value="<%= arquzr.get(i).getCapellido()%>"
			> 

			<label for="aka"><b>ALIAS</b></label> 
			<input type="text" placeholder="INGRESAR ALIAS" name="aka" 
			maxlength="9" required pattern="[A-Za-z]+"
			title="Se necesita un alias. Sólo letras. Tamaño máximo: 9"
			value="<%= arquzr.get(i).getEaka()%>"
			>
			 
			<label for="email"><b>E-MAIL</b></label> 
			<input type="email" placeholder="INGRESAR EMAIL" name="email" 
			required pattern="^[a-zA-Z0-9.+@+[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"
			title="Ingresar un e-mail válido"
			value="<%= arquzr.get(i).getFcorreo()%>"
			> 
			
			<label for="email"><b>TELEFONO</b></label> 
			<input type="number" placeholder="INGRESAR TELEFONO" name="telefono" 
			required pattern="[0-9]{9,9}"
			title="Ingrese un número de celular válido"
			value="<%= arquzr.get(i).getGtelefono()%>"
			> 
			
			<label for="email"><b>DESCRIPCION</b></label> 
			<input type="text" placeholder="INGRESAR DESCRIPCION" name="descripcion" 
			value="<%= arquzr.get(i).getHdescripcion()%>"
			>

			<div class="clearfix">
			<input type="submit" name="action" class="registerbtn" 
			value="ACTUALIZAR">
			</div>
		</div>
	</form>

	<% }
	
	}%>

</body>
</html>
