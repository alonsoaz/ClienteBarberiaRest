
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="theme-color" content="#4d197e"/>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="../../w3c/css/hello.css"/>
<link rel="stylesheet" href="../../w3c/css/listadrop.css"/>
<link rel="stylesheet" href="../../w3c/css/redistrop.css"/>
<style>

</style>
</head>
<div style="margin-left: 20px;">
	<div align = "center">
		<i class="fa fa-laptop" style="font-size: 51px; color: #4d197e"></i> 
		<i class="fa fa-scissors" style="font-size: 51px; color: #4d197e"></i>
	</div>
	
		<p></p>
		<h3 align="center"><b>BARBERIA MANTENIMIENTO</b></h3>
    
		<p align="center" ><font size="2" color="blue"><strong>${successMessage}</strong></font></p>

</div>
<body>
	<%String idP = (String) session.getAttribute("idP");%>
	<%if (idP == null){
	    idP="U";
	}
	String idT = (String) session.getAttribute("idT");
	String idUser = session.getAttribute("idUser").toString();
	String aidi= (String) session.getAttribute("aidi");
	String words= (String) session.getAttribute("words");
	%>
	<div class="topnav">
	
		<a href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=<%=idP%>&idT=L"><i class="fa fa-table"></i></a> 
		<a href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=<%=idP%>&idT=R"><i class="fa fa-pencil"></i></a>
		<form action="home" method="GET">
			<button type="submit" class= btn-search ><i class="fa fa-search"></i></button>
			<input type="hidden" placeholder="Search..." name="idUser" value="<%=idUser%>">
			<input type="hidden" placeholder="Search..." name="idP" value="<%=idP%>">
			<input type="hidden" placeholder="Search..." name="idT" value="B">
			<input type="text" placeholder="Search..." name="words">
		</form>
	</div>
	<div id="myNav" class="overlay" align="right">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<div class="overlay-content">
			<a href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=U">USUARIOS</a> 
			<a href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=B">BARBEROS</a> 
			<a href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=S">SERVICIOS</a>
			<a href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=M">MARCAS</a> 
			<a href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=T">TIPOS DE PRODUCTOS</a> 
			<a href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=P">PRODUCTOS</a>
			<a href="${pageContext.request.contextPath}home?idUser=<%=idUser%>&idP=C">CLIENTES</a>
		</div>
	</div>
	<div align = "right" id="Sidenavb" class="sidenav">
		<a href="#" id="about" onclick="openNav()">Menú <i class="fa fa-television" aria-hidden="true"></i></a> 
		<a href="${pageContext.request.contextPath}login" id="projects"> Log Out <i class="fa fa-handshake-o" aria-hidden="true"></i></a>
		
	</div>
      
	<div align = "center" id="Sidenavc" class="sidenav">    
    	<a onclick="document.getElementById('id01').style.display='block'" id="blog">Info  <i class="fa fa-github" aria-hidden="true"></i> </a> 
	</div>

      
    <%if (idP==null ||!"UBSMTPC".contains(idP.toString())) {%>
			<%@include file="redistrop.jsp" %>
	<%}else if ("U".contains(idP.toString())) {
			if (idT==null ||!"BALR".contains(idT.toString())) {%>
					<%@include file="index.jsp" %>
			<%}else if ("R".contains(idT.toString())) {%>
					<%@include file="redistrop.jsp" %>
			<%}else if ("L".contains(idT.toString())) {%>
					<%@include file="listarusuario.jsp" %>
			<%}else if ("A".contains(idT.toString())) {%>
					<%@include file="actualizarusuario.jsp" %>
			<%}else if ("B".contains(idT.toString())) {%>
					<%@include file="buscarusuario.jsp" %>
	<%		  }%>
	<%}else if ("P".contains(idP.toString())) {
			if (idT==null ||!"ALRB".contains(idT.toString())) {%>
					<%@include file="index.jsp" %>
			<%}else if ("R".contains(idT.toString())) {%>
					<%@include file="registrarproducto.jsp" %>
			<%}else if ("L".contains(idT.toString())) {%>
					<%@include file="listarproducto.jsp" %>
			<%}else if ("A".contains(idT.toString())) {%>
					<%@include file="actualizarproducto.jsp" %>
			<%}else if ("B".contains(idT.toString())) {%>
					<%@include file="buscarproducto.jsp" %>
	<%		  }%>
		<%}else if ("B".contains(idP.toString())) {
			if (idT==null ||!"ALRB".contains(idT.toString())) {%>
					<%@include file="index.jsp" %>
			<%}else if ("R".contains(idT.toString())) {%>
					<%@include file="registrarbarbero.jsp" %>
			<%}else if ("L".contains(idT.toString())) {%>
					<%@include file="listarbarbero.jsp" %>
			<%}else if ("A".contains(idT.toString())) {%>
					<%@include file="actualizarbarbero.jsp" %>
			<%}else if ("B".contains(idT.toString())) {%>
					<%@include file="buscarbarbero.jsp" %>
	<%		  }%>
		<%}else if ("S".contains(idP.toString())) {
			if (idT==null ||!"ALRB".contains(idT.toString())) {%>
					<%@include file="index.jsp" %>
			<%}else if ("R".contains(idT.toString())) {%>
					<%@include file="registrarservicio.jsp" %>
			<%}else if ("L".contains(idT.toString())) {%>
					<%@include file="listarservicio.jsp" %>
			<%}else if ("A".contains(idT.toString())) {%>
					<%@include file="actualizarservicio.jsp" %>
			<%}else if ("B".contains(idT.toString())) {%>
					<%@include file="buscarservicio.jsp" %>
	<%		  }%>
		<%}else if ("M".contains(idP.toString())) {
			if (idT==null ||!"ALRB".contains(idT.toString())) {%>
					<%@include file="index.jsp" %>
			<%}else if ("R".contains(idT.toString())) {%>
					<%@include file="registrarmarca.jsp" %>
			<%}else if ("L".contains(idT.toString())) {%>
					<%@include file="listarmarca.jsp" %>
			<%}else if ("A".contains(idT.toString())) {%>
					<%@include file="actualizarmarca.jsp" %>
	<%		  }%>
		<%}else if ("T".contains(idP.toString())) {
			if (idT==null ||!"ALRB".contains(idT.toString())) {%>
					<%@include file="index.jsp" %>
			<%}else if ("R".contains(idT.toString())) {%>
					<%@include file="registrartipoproducto.jsp" %>
			<%}else if ("L".contains(idT.toString())) {%>
					<%@include file="listartipoproducto.jsp" %>
			<%}else if ("A".contains(idT.toString())) {%>
					<%@include file="actualizartipoproducto.jsp" %>
	<%		  }%>
		<%}else if ("C".contains(idP.toString())) {
			if (idT==null ||!"ALRB".contains(idT.toString())) {%>
					<%@include file="index.jsp" %>
			<%}else if ("R".contains(idT.toString())) {%>
					<%@include file="registrarcliente.jsp" %>
			<%}else if ("L".contains(idT.toString())) {%>
					<%@include file="listarcliente.jsp" %>
			<%}else if ("A".contains(idT.toString())) {%>
					<%@include file="actualizarcliente.jsp" %>
			<%}else if ("B".contains(idT.toString())) {%>
					<%@include file="buscarcliente.jsp" %>
	<%		  }%>
	<%}
	session.setAttribute("idP",null);
			session.setAttribute("idT",null);%>
      
      
<div id="id01" class="modal" >
  
  <form class="modal-content animate" action="/action_page.php">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
    </div>

    <div align="center" class="modcontainer">
      
      <i class="fa fa-cog fa-spin" style="font-size: 185px; color: #4d197e">
        
      </i>
            
       <p  style="font-size:36px;"><span class="psw">
        <a href=https://goo.gl/MPSXnH> 
         <i class="fa fa-github" aria-hidden="true" style="font-size:36px;">
      </i></a>
        Cliente REST Barbería 
        <i class="fa fa-scissors" aria-hidden="true" style="font-size:36px;">
        </i></span></p>

      
       <p  style="font-size:36px;"><span class="psw">
        <a href="https://goo.gl/5ZDkZN">
        <i class="fa fa-github" aria-hidden="true" style="font-size:36px;">
        </i></a>
        Servicio REST Barbería<i class="fa fa-server" aria-hidden="true" style="font-size:36px;">
        </i></span></p>
      
       <p  style="font-size:36px;"><span class="psw"><a href="https://goo.gl/btjQtg">
        <i class="fa fa-database" aria-hidden="true" style="font-size:36px;"></i></a>
      
        barberia.DB</span></p>
      
      <p  style="font-size:36px;"><span class="psw">
       <a href="https://goo.gl/a6i4Hs"><i class="fa fa-youtube" aria-hidden="true" style="font-size:36px;">
      </i></a> 
        Springboot 
        <i class="fa fa-leaf" aria-hidden="true" style="font-size:36px;">
          
        </i>
        <i class="fa fa-power-off" aria-hidden="true" style="font-size:36px;">
          
        </i> 
        </span></p>
      
      <p  style="font-size:36px;"><span class="psw">
       <a href="https://goo.gl/RPnin4"><i class="fa fa-youtube" aria-hidden="true" style="font-size:36px;">
      </i></a> 
        Test de BD
        </span></p>
      
      <p  style="font-size:36px;"><span class="psw"> 
        
        <a href="https://goo.gl/nniJRk"><i class="fa fa-youtube" aria-hidden="true"></i></a>
        Test de Servicio y Cliente
      </span></p>      
      
      <p style="font-size:36px;" ><span class="psw">
        <a href=https://goo.gl/GBC4P7><i class="fa fa-download" aria-hidden="true" ></i></a>
        Repositorio</span></p>      
    </div>

  </form>
</div>    
      

	<script>
function openNav() {
  document.getElementById("myNav").style.height = "100%";
}

function closeNav() {
  document.getElementById("myNav").style.height = "0%";
}

// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>
</body>
</html>
