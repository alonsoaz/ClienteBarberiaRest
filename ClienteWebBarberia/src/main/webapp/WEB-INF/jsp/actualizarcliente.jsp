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
    Object oreqclnt = session.getAttribute("reqclnt");%>

	<%if(oreqclnt!=null){  %>

	<% List<RecuperarClienteInterno> sreqclnt = (List<RecuperarClienteInterno>) oreqclnt; %>
	
	<% for(int i =0; i < sreqclnt.size(); i++ ) { %>

	<form action="updatecli" method="POST">
		<div class="container">

			<p align="center">
				<b>ACTUALIZAR CLIENTE</b>
			</p>

			<hr>
			
			<input type="hidden" placeholder="INGRESAR NOMBRES" name="idc"
			value="<%=aidi %>">

			<label for="nombre"><b>NOMBRES</b></label> 
			<input type="text" placeholder="INGRESAR NOMBRE" name="nombre"  
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un nombre válido"
			value="<%= sreqclnt.get(i).getBnombre()%>"			
			>
			 
			<label for="apellidos"><b>APELLIDOS</b></label> 
			<input type="text" placeholder="INGRESAR APELLIDO" name="apellido" 
			maxlength="45" required pattern="[A-Za-z]+"
			title="Se necesita un apellido válido"
			value="<%= sreqclnt.get(i).getCapellido()%>"				
			> 

			<label for="email"><b>TELEFONO</b></label> 
			<input type="number" placeholder="INGRESAR TELEFONO" name="telefono" 
			required pattern="[0-9]{9,9}"
			title="Ingrese un número de celular válido"
			value="<%= sreqclnt.get(i).getDtelefono()%>"			
			> 
			 
			<label for="dni"><b>DNI</b> </label> 
			<input type="number" placeholder="INGRESAR DNI" name="dni" 
			required pattern="[0-9]{8,8}"
			title="Tamaño: 8"
			value="<%= sreqclnt.get(i).getEDni()%>"				
			>
			 
			<label for="email"><b>E-MAIL</b></label> 
			<input type="email" placeholder="INGRESAR EMAIL" name="email" 
			required pattern="^[a-zA-Z0-9.+@+[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"
			title="Ingresar un e-mail válido"
			value="<%= sreqclnt.get(i).getFcorreo()%>"				
			> 
			
			<label for="email"><b>DIRECCION</b></label> 
			<input type="text" placeholder="INGRESAR DIRECCION" name="direccion" 
			value="<%= sreqclnt.get(i).getGdireccion()%>"				
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
