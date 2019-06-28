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

    
    <%Object objdatos = session.getAttribute("buzkuzr");%>

	<%if(objdatos!=null){  %>
	
    <tr>
      <th>COD</th>
      <th>NOMBRE</th>
      <th>CARGO</th>
      <th>ALIAS</th>
      <th>E-MAIL</th>
      <th>CELULAR</th>
      <th>DESCRIPCION</th>
      <th colspan="1">ACCIONES</th>
    </tr>
      
	<% List<BuscarUsuario> XD = (List<BuscarUsuario>) objdatos; %>
	
	<% for(BuscarUsuario p: XD) { %>

    <tr>
      <td><%=p.getBCod()%></td>
      <td><%=p.getCnombre()%></td>
      <td><%=p.getDargo()%></td>
      <td><%=p.getEaka()%></td>
      <td><%=p.getFmail()%></td>
      <td><%=p.getGcelular()%></td>
      <td><%=p.getHDescripcion()%></td>
     <td colspan="1" align="center">

  
<a 
href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=U&idT=A&aidi=<%=p.getAidUsuario()%>" 
style="width:auto;">
<i class="fa fa-wrench" style="font-size: 30px; color: #4d197e">
</i>
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
