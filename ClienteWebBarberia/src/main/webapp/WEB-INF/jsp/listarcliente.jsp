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
<h4 align="center"><b>LISTADO DE CLIENTES</b></h4>
  
  <p></p>
<div style="overflow-x:auto;">
  <table>

    
    <%Object olistac = session.getAttribute("listac");%>

	<%if(olistac!=null){  %>
	
    <tr>
      <th>COD</th>
      <th>NOMBRE</th>
      <th>DNI</th>      
      <th>ESTADO</th>
      <th>CELULAR</th>
      <th>E-MAIL</th>
      <th>DIRECCION</th>
      <th>MODIF. POR</th>
      <th>FECHA MOD.</th>
      <th colspan="2">ACCIONES</th>
    </tr>
      
	<% List<ListarClienteInterno> slistac = (List<ListarClienteInterno>) olistac; %>
	
	<% for(ListarClienteInterno lcl: slistac) { %>

    <tr>
      <td><%=lcl.getBCodigo()%></td>
      <td><%=lcl.getCompleto()%></td>
      <td><%=lcl.getDni()%></td>
      <td><%=lcl.getEstado()%></td>
      <td><%=lcl.getGCelular()%></td>
      <td><%=lcl.getHEmail()%></td>
      <td><%=lcl.getJDireccion()%></td>
      <td><%=lcl.getKModifiedBy()%></td>
      <td><%=lcl.getLdate()%></td>
      <td colspan="2" align="center">
      
<a 
href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=C&idT=A&aidi=<%=lcl.getAidCliente()%>" 
style="width:auto;">
<i class="fa fa-wrench" style="font-size: 30px; color: #4d197e">
</i>
</a>
		
		<a href="deletecli?id=<%=lcl.getAidCliente()%>">
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
