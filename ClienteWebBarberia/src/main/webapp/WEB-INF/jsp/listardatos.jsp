<%@page import="entidad.datos"%>
<%@page import="java.util.List"%>

<body>
	<%
	List<datos> objdatos=(List<datos>)request.getAttribute("data");
	%>
	<h2 align="center">LISTADO DE CLIENTES </h2>
	<p align="center" ><a href="registrar.jsp"> Registrar Nuevo Cliente</a>
	<table border="2" align="center" width="75%">
		<tr>
			<th>CODIGO</th>
			<th>CLIENTE</th>
			<th>RUC</th>
			<th>CREDITO</th>
			<th>ESTADO</th>
			<th colspan="2">ACCIONES</th>
		</tr>
	



<%
	if(objdatos!=null){
		for(datos p:objdatos){
		%>
		<tr>
			<td><%=p.getCodigo()%></td>
			<td><%=p.getCliente()%></td>
			<td><%=p.getRuc()%></td>
			<td><%=p.getCredito()%></td>
			<td><%=p.getEstado()%></td>
			<td colspan="2" align="center">
			<a href="ServletDatos?tipo=buscar&cod=<%=p.getCodigo()%>"><img alt="Editar" title="Editar" src="img/editar.png"></a>
			<a href="ServletDatos?tipo=eliminar&cod=<%=p.getCodigo()%>"><img alt="Eliminar" title="Eliminar"
			src="img/borrar.png"></a>
			</td>
		</tr>
		<%
		}
	}
	%> </table>
	</body>
	
	<p align="center" ><a href="menu.jsp"> Regresar al Menu</a>
	
	</html>
	

</html>
