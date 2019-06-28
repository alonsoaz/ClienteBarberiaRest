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
<h4 align="center"><b>LISTADO DE BARBEROS</b></h4>
  
  <p></p>
<div style="overflow-x:auto;">
  <table>

    
    <%Object obuzkbarb= session.getAttribute("buzkbarb");%>

	<%if(obuzkbarb!=null){  %>
	
    <tr>
      <th>COD</th>
      <th>NOMBRE</th>
      <th>ESTADO</th>
      <th>CELULAR</th>
      <th>DNI</th>
      <th>E-MAIL</th>
      <th>DIRECCION</th>
      <th>MODIF. POR</th>
      <th>FECHA MOD.</th>
      <th colspan="2">ACCIONES</th>      
    </tr>
      
	<% List<BuscarBarberoInterno> sbuzkbarb = (List<BuscarBarberoInterno>) obuzkbarb; %>
	
	<% for(BuscarBarberoInterno lbr: sbuzkbarb) { %>

    <tr>
      <td><%=lbr.getBcod()%></td>
      <td><%=lbr.getECompleto()%></td>
      <td><%=lbr.getFEstado()%></td>
      <td><%=lbr.getHcelular()%></td>
      <td><%=lbr.getIDni()%></td>
      <td><%=lbr.getJEmail()%></td>
      <td><%=lbr.getKDireccion()%></td>
      <td><%=lbr.getLModifiedBy()%></td>
      <td><%=lbr.getMdate()%></td>
      <td colspan="2" align="center">
<a 
href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=B&idT=A&aidi=<%=lbr.getAidBarbero()%>" 
style="width:auto;">
<i class="fa fa-wrench" style="font-size: 30px; color: #4d197e">
</i>
</a>
		<a href="deletebarb?id=<%=lbr.getAidBarbero()%>">
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
