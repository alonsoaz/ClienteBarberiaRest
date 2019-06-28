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
    Object oreqserv = session.getAttribute("reqserv");%>

	<%if(oreqserv!=null){  %>

	<% List<RecuperarServicio> sreqserv = (List<RecuperarServicio>) oreqserv; %>
	
	<% for(int i =0; i < sreqserv.size(); i++ ) { %>

	<form action="updateserv" method="POST">
		<div class="container">

			<p align="center">
				<b>ACTUALIZAR SERVICIO</b>
			</p>

			<hr>
			
			<input type="hidden" placeholder="INGRESAR NOMBRES" name="ids"
			value="<%=aidi %>">

			<label for="nombre"><b>SERVICIO</b></label> 
			<input type="text" placeholder="INGRESAR NOMBRES" name="servicio"  
			maxlength="45" required
			title="Se necesita un nombre válido"
			value="<%= sreqserv.get(i).getBnombser()%>"
			>
			 
			<label for="dni"><b>DURACION</b> </label> 
			<input type="number" placeholder="0" name="duracion" 
			required pattern="[0-9]{0,8}"
			title="Tamaño: 8"
			value="<%= sreqserv.get(i).getDminutos()%>"			
			>
			 
			<label for="dni"><b>PRECIO</b> </label> 
			<input type="number" step="0.01" min="0" lang="en" placeholder="0.00" name="precio" 
			required pattern="[0-9]{0,8}"
			title="Tamaño: 8"
			value="<%= sreqserv.get(i).getEprecio()%>"
			>
			
			<label for="email"><b>DESCRIPCION</b></label> 
			<input type="text" placeholder="INGRESAR DESCRIPCION" name="descripcion" 
			value="<%= sreqserv.get(i).getFdescripcion()%>"
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
