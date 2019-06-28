<%@page import="com.barberia.response.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../../w3c/css/listadrop.css"/>
</head>
<body>
<p></p>
<h4 align="center"><b>LISTADO DE PRODUCTOS</b></h4>
  
  <p></p>
<div style="overflow-x:auto;">
  <table>

    
    <%Object olistapr = session.getAttribute("listapr");%>

	<%if(olistapr!=null){  %>
	
    <tr>
      <th>COD</th>
      <th>TIPO</th>
      <th>PRODUCTO</th>      
      <th>MARCA</th>
      <th>ESTADO</th>
      <th>CANTIDAD</th>
      <th>PRECIO</th>
      <th>DESCRIPCION</th>
      <th>MODIF. POR</th>
      <th>FECHA MOD.</th>
      <th colspan="2">ACCIONES</th>      
    </tr>
      
	<% List<ListarProductoInterno> slistapr = (List<ListarProductoInterno>) olistapr; %>
	
	<% for(ListarProductoInterno listapr: slistapr) { %>

    <tr>
      <td><%=listapr.getBcodigo()%></td>
      <td><%=listapr.getDTipo()%></td>
      <td><%=listapr.getEProd()%></td>
      <td><%=listapr.getGMarca()%></td>
      <td><%=listapr.getIEstado()%></td>
      <td><%=listapr.getJCantidad()%></td>
      <td><%=listapr.getKPrecio()%></td>
      <td><%=listapr.getLDescripcion()%></td>
      <td><%=listapr.getNUser()%></td>
      <td><%=listapr.getOdate()%></td>
      <td colspan="2" align="center">
      
<a 
href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=P&idT=A&aidi=<%=listapr.getAidProducto()%>" 
style="width:auto;">
<i class="fa fa-wrench" style="font-size: 30px; color: #4d197e">
</i>
</a>
		
		<a href="deletepro?id=<%=listapr.getAidProducto()%>">
		<i class="fa fa-trash" style="font-size: 30px; color: red"></i> 
		</a>
	 </td>      
    </tr>

	<%}
		
	}else{%> 
	
	<tr>
      <td></td> 
      <td>NO</td> 
      <td>EXISTEN</td> 
      <td>DATOS</td> 
      <td>POR</td> 
      <td>MOSTRAR</td>
      <td></td>
    </tr>
	
	<%
	}
	%> 

  </table>
</div>

</body>
</html>
