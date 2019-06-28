<%@page import="com.barberia.response.ListarMarca"%>
<%@page import="com.barberia.response.ListarTipo"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../../w3c/css/redistrop.css" />
</head>
<body>

	<form action="registerpro" method="POST">
		<div class="container">

			<p align="center">
				<b>INGRESAR PRODUCTO</b>
			</p>

			<hr>

			<%
		Object olistamk = session.getAttribute("listamk");
		Object olistatp = session.getAttribute("listatp");
	%>
			<div class="dropdown">
				<select class="dropbtn" name="lmk">

					<option class="dropdown-content" value="0">SELECCIONAR
						MARCA</option>

					<%
	if(olistamk!=null){
	
		List<ListarMarca> listamk = (List<ListarMarca>) olistamk;
	
		for(ListarMarca mk: listamk) { %>

					<option value="<%= mk.getAIdMarca()%>"><%= mk.getCMarca()%></option>
					<%
		}
		
	}else{%>

					<option value="1">NO</option>

					<%
	}
	%>

				</select>
			</div>
			<p></p>
			<div class="dropdown">
				<select class="dropbtn" name="ltp">

					<option class="dropdown-content" value="0">SELECCIONAR
						TIPO</option>

					<%
	if(olistatp!=null){
	
		List<ListarTipo> listatp = (List<ListarTipo>) olistatp;
	
		for(ListarTipo tp: listatp) { %>

					<option value="<%= tp.getAidTipoProducto()%>"><%= tp.getCtipo()%></option>
					<%
		}
		
	}else{%>

					<option value="1">NO</option>

					<%
	}
	%>
				</select>
			</div>
			<p></p>

			<label for="nombre"><b>PROUCTO</b></label> 
			<input type="text" placeholder="INGRESAR RPRODUCTO" 
			name="producto" maxlength="45"
				required title="Se necesita un nombre válido"> 
			
			<label for="dni"><b>STOCK</b></label> 
			<input type="number" placeholder="0" name=stock 
			required pattern="[0-9]{0,8}" title="Tamaño: 8">

			<label for="dni"><b>PRECIO</b></label> 
			<input type="number" step="0.01" min="0" lang="en" placeholder="0.00" 
			name="precio" required pattern="[0-9]{0,8}" title="Tamaño: 8">
			 
			<label for="email"><b>DESCRIPCION</b></label> 
			<input type="text" placeholder="INGRESAR DESCRIPCION" name="descripcion">

			<div class="clearfix">
				<input type="submit" name="action" class="registerbtn" value="REGISTRAR">
			</div>
		</div>
	</form>
</body>
</html>
