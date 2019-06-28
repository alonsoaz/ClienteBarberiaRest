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
    Object oreqbrb = session.getAttribute("reqbrb");%>

	<%if(oreqbrb!=null){  %>

	<% List<RecuperarBarbero> sreqbrb = (List<RecuperarBarbero>) oreqbrb; %>
	
	<% for(int i =0; i < sreqbrb.size(); i++ ) { %>

	<form action="updatebarb" method="POST">
		<div class="container">

			<p align="center">
				<b>ACTUALIZAR BARBERO</b>
			</p>

			<hr>
			
			<input type="hidden" placeholder="INGRESAR NOMBRES" name="idb"
			value="<%=aidi %>">			

			<label for="nombre"><b>NOMBRE</b></label> 
			<input type="text" placeholder="INGRESAR NOMBRE" name="nombre"  
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un nombre válido"
			value="<%= sreqbrb.get(i).getBNombre()%>"			
			>			
						 
			<label for="apellidos"><b>APELLIDO</b></label> 
			<input type="text" placeholder="INGRESAR APELLIDO" name="apellido" 
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un apellido válido"
			value="<%= sreqbrb.get(i).getCApellido()%>"			
			>

			<label for="email"><b>TELEFONO</b></label> 
			<input type="number" placeholder="INGRESAR TELEFONO" name="telefono" 
			required pattern="[0-9]{9,9}"
			title="Ingrese un número de celular válido"
			value="<%= sreqbrb.get(i).getDTelefono()%>"			
			> 
			 
			<label for="dni"><b>DNI</b> </label> 
			<input type="number" placeholder="INGRESAR DNI" name="dni" 
			required pattern="[0-9]{8,8}"
			title="Tamaño: 8"
			value="<%= sreqbrb.get(i).getEDni()%>"			
			>
			 
			<label for="email"><b>E-MAIL</b></label> 
			<input type="email" placeholder="INGRESAR EMAIL" name="email" 
			required pattern="^[a-zA-Z0-9.+@+[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"
			title="Ingresar un e-mail válido"
			value="<%= sreqbrb.get(i).getFEmail()%>"			
			> 
			
			<label for="email"><b>DIRECCION</b></label> 
			<input type="text" placeholder="INGRESAR DIRECCION" name="direccion" 
			value="<%= sreqbrb.get(i).getGDireccion()%>"			
			>

          			<div class="dropdown">
				<select class="dropbtn" name="estado">

						<option class="dropdown-content" value="0">SELECCIONAR ESTADO</option>

							<option value="1">HABILITADO</option>
                            <option value="2">INHABILITADO</option>

				</select>
			</div>
    
          <p></p>
          
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
