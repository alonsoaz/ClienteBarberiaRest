<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.barberia.response.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../../w3c/css/listadrop.css"/>
<link rel="stylesheet" href="../../w3c/css/redistrop.css"/>
<link rel="stylesheet" href="../../w3c/css/modal.css"/>
</head>
<body>
<p></p>
<h4 align="center"><b>LISTADO DE USUARIOS</b></h4>
  
  <p></p>
<div style="overflow-x:auto;">
  <table>
    
    <% 
    Object olistauzr = session.getAttribute("listauzr");%>

	<%if(olistauzr!=null){  %>
	
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
      
	<% List<ListarUsuarios> slistauzr = (List<ListarUsuarios>) olistauzr; %>
	
	<% for(int i =0; i < slistauzr.size(); i++ ) { %>

    <tr>
      <td><%=slistauzr.get(i).getBCod()%></td>
      <td><%=slistauzr.get(i).getCnombre()%></td>
      <td><%=slistauzr.get(i).getDargo()%></td>
      <td><%=slistauzr.get(i).getEaka()%></td>
      <td><%=slistauzr.get(i).getFmail()%></td>
      <td><%=slistauzr.get(i).getGcelular()%></td>
      <td><%=slistauzr.get(i).getHDescripcion()%></td>
     <td colspan="1" align="center">

  
<a 
href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=U&idT=A&aidi=<%=slistauzr.get(i).getAidUsuario()%>" 
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
