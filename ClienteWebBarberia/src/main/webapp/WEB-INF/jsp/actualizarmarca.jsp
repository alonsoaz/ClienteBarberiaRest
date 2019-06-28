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
    Object oreqmark = session.getAttribute("reqmark");%>

	<%if(oreqmark!=null){  %>

	<% List<RecuperarMarca> sreqmark = (List<RecuperarMarca>) oreqmark; %>
	
	<% for(int i =0; i < sreqmark.size(); i++ ) { %>

	<form action="updatemark" method="POST">
		<div class="container">

			<p align="center">
				<b>ACTUALIZAR MARCA</b>
			</p>

			<hr>
			
			<input type="hidden" placeholder="INGRESAR NOMBRES" name="idm"
			value="<%=aidi %>">				

			<label for="nombre"><b>MARCA</b></label> 
			<input type="text" placeholder="INGRESAR MARCA" name="marca"  
			maxlength="45" required 
			title="Se necesita un nombre válido"
			value="<%= sreqmark.get(i).getCmarca()%>"			
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
