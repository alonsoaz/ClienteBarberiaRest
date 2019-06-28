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
    Object oreqtp = session.getAttribute("reqtp");%>

	<%if(oreqtp!=null){  %>

	<% List<RecuperarTipo> sreqtp = (List<RecuperarTipo>) oreqtp; %>
	
	<% for(int i =0; i < sreqtp.size(); i++ ) { %>

	<form action="updatetipo" method="POST">
		<div class="container">

			<p align="center">
				<b>ACTUALIZAR TIPO DE PRODUCTO</b>
			</p>

			<hr>

			<input type="hidden" placeholder="INGRESAR NOMBRES" name="idt"
			value="<%=aidi %>">		

			<label for="nombre"><b>TIPO DE PRODUCTO</b></label> 
			<input type="text" placeholder="TIPO DE PRODUCTO" name="tipo"  
			maxlength="45" required 
			title="Se necesita un nombre válido"
			value="<%= sreqtp.get(i).getBTipo()%>"			
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
