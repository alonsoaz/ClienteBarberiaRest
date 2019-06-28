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
<h4 align="center"><b>RESULTADO DE LA BÚSQUEUDA</b></h4>
  
  <p></p>
<div style="overflow-x:auto;">
  <table>

    
    <%Object obuzserv = session.getAttribute("buzserv");%>

	<%if(obuzserv!=null){  %>
	
    <tr>
      <th>COD</th>
      <th>SERVICIO</th>
      <th>ESTADO</th>
      <th>DURACION
      <th>PRECIO</th>
      <th>DESCRIPCION</th>
      <th>MODIF. POR</th>
      <th>FECHA MOD.</th>
      <th colspan="2">ACCIONES</th>
    </tr>
      
	<% List<BuscarServicioInterno> sbuzserv = (List<BuscarServicioInterno>) obuzserv; %>
	
	<% for(BuscarServicioInterno lsv: sbuzserv) { %>

    <tr>
      <td><%=lsv.getBCod()%></td>
      <td><%=lsv.getCNombre()%></td>
      <td><%=lsv.getEEstado()%></td>
      <td><%=lsv.getFDuracion()%></td>
      <td><%=lsv.getGPrecio()%></td>
      <td><%=lsv.getHDescripcion()%></td>
      <td><%=lsv.getJUser()%></td>
      <td><%=lsv.getKDate()%></td>
      <td colspan="2" align="center">
<a 
href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=S&idT=A&aidi=<%=lsv.getAidServicio()%>" 
style="width:auto;">
<i class="fa fa-wrench" style="font-size: 30px; color: #4d197e">
</i>
</a>
		<a href="deleteserv?id=<%=lsv.getAidServicio()%>">
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
