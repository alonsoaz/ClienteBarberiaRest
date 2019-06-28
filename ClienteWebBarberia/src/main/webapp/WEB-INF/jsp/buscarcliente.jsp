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
<h4 align="center"><b>RESULTADO DE LA BÚSQUEDA</b></h4>
  
  <p></p>
<div style="overflow-x:auto;">
  <table>

    
    <%Object obuzkclt = session.getAttribute("buzkclt");%>

	<%if(obuzkclt!=null){  %>
	
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
      
	<% List<BuscarClienteInterno> sbuzkclt = (List<BuscarClienteInterno>) obuzkclt; %>
	
	<% for(BuscarClienteInterno lcl: sbuzkclt) { %>

    <tr>
      <td><%=lcl.getBCod()%></td>
      <td><%=lcl.getCCompleto()%></td>
      <td><%=lcl.getDni()%></td>
      <td><%=lcl.getFEsatado()%></td>
      <td><%=lcl.getGCelular()%></td>
      <td><%=lcl.getHEmail()%></td>
      <td><%=lcl.getJDireccion()%></td>
      <td><%=lcl.getKModifiedBy()%></td>
      <td><%=lcl.getLdate()%></td>
      <td colspan="2" align="center">
      
<a 
href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=C&idT=A&aidi=<%=lcl.getAiDCliente()%>" 
style="width:auto;">
<i class="fa fa-wrench" style="font-size: 30px; color: #4d197e">
</i>
</a>
		
		<a href="deletecli?id=<%=lcl.getAiDCliente()%>">
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
