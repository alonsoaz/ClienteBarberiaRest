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
  	<form action="updatepro" method="POST">
		<div class="container">

			<p align="center">
				<b>ACTUALIZAR PRODUCTO</b>
			</p>

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
			
			<input type="hidden" name="idp"
			value="<%=aidi %>"
			>			
                    
    <% 
    Object oreqpro = session.getAttribute("reqpro");%>

	<%if(oreqpro!=null){  %>

	<% List<RecuperarProducto> sreqpro = (List<RecuperarProducto>) oreqpro; %>
	
	<% for(int i =0; i < sreqpro.size(); i++ ) { %>                    
                    
			<label for="nombre"><b>PROUCTO</b></label> 
			<input type="text" placeholder="INGRESAR RPRODUCTO" name="producto"  
			maxlength="45" required 
			title="Se necesita un nombre válido"
			value="<%= sreqpro.get(i).getCNombre()%>"
			>
			 
			<label for="dni"><b>STOCK</b> </label> 
			<input type="number" placeholder="0" name="stock" 
			required pattern="[0-9]{0,8}"
			title="Tamaño: 8"
			value="<%= sreqpro.get(i).getFStock()%>"
			>
			 
			<label for="dni"><b>PRECIO</b> </label> 
			<input type="number" step="0.01" min="0" lang="en" placeholder="0.00" name="precio" 
			required pattern="[0-9]{0,8}"
			title="Tamaño: 8"
			value="<%= sreqpro.get(i).getGPrecio()%>"
			>
			
			<label for="email"><b>DESCRIPCION</b></label> 
			<input type="text" placeholder="INGRESAR DESCRIPCION" name="descripcion" 
			value="<%= sreqpro.get(i).getHdescripcion()%>"
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
