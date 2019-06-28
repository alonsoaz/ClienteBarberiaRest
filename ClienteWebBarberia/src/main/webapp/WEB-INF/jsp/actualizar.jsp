<%@page import="entidad.*"%>

<body>
	<% for(int i = 0; i<=2; i++){ %>  
	datos p=(datos)request.getAttribute("registro"); %>

	<form action="ServletDatos?tipo=actualizar" name="frmactualizar"
		method="post">
		<input type="hidden" name="txt_cod" value="<%=p.getCodigo()%>">
		<table border="1" align="center">
			<tr>
				<td>CLIENTE</td>
				<td><input type="text" name="txt_cliente"
					value="<%=p.getCliente()%>"></td>
			</tr>

			<tr>
				<td>RUC</td>
				<td><input type="text" name="txt_ruc"
					value="<%=p.getRuc()%>"></td>
			</tr>
			<tr>
				<td>CREDITO</td>
				<td><input type="text" name="txt_credito"
					value="<%=p.getCredito()%>"></td>
			</tr>

			<tr>
				<td>ESTADO</td>
				<td><input type="text" name="txt_estado"
					value="<%=p.getEstado()%>"></td>
			</tr>


			<tr>
				<td colspan="2" align="right"><input type="submit"
					value="Actualizar"></td>
			</tr>
		</table>
	</form>
	<%} %>
</body>
