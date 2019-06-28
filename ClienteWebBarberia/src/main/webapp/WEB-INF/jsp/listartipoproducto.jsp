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
<h4 align="center"><b>LISTADO DE TIPOS DE PRODUCTOS</b></h4>
  
  <p></p>
<div style="overflow-x:auto;">
  <table>

    
    <%Object olistatp = session.getAttribute("listatp");%>

	<%if(olistatp!=null){  %>
	
    <tr>
      <th>TIPO</th>   
      <th>ESTADO</th>
      <th colspan="2">ACCIONES</th>
    </tr>
      
	<% List<ListarTipo> slistatp = (List<ListarTipo>) olistatp; %>
	
	<% for(ListarTipo ltp: slistatp) { %>

    <tr>
	  <td><%=ltp.getCtipo()%></td>
      <td><%=ltp.getDEstado()%></td>
      <td colspan="2" align="center">
<a 
href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=T&idT=A&aidi=<%=ltp.getAidTipoProducto()%>" 
style="width:auto;">
<i class="fa fa-wrench" style="font-size: 30px; color: #4d197e">
</i>
</a>
		<a href="deletetyp?id=<%=ltp.getAidTipoProducto()%>">
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
