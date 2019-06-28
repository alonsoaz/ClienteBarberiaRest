<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="theme-color" content="#4d197e"/>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="../../w3c/css/loginusuario.css"/>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<div class="page-header">
					<div align="center">
						<i class="fa fa-laptop" style="font-size: 100px; color: #009688"></i>
						<i class="fa fa-scissors" style="font-size: 100px; color: #009688"></i>
					</div>
					
						<h2><p align="center"><b>INICIAR SESIÓN</b></p></h2>
					
				</div>
              <h3><p align= "center"><font color="red"><strong>${errorMessage}</strong></font></p></h3>
				
				<form action="login" method="post" class="form-horizontal">
					<div class="form-group">
						<label class="col-lg-3 control-label"><i
							class="fa fa-user-secret" aria-hidden="true"></i> USUARIO</label>
						<div class="col-lg-5">
							<input type="text" placeholder="INGRESAR ALIAS"
								class="form-control" name="username" 
								maxlength="9" required pattern="[A-Za-z0-9]+"
								title="Se necesita un alias válido">
						</div>
					</div>


					<div class="form-group">
						<label class="col-lg-3 control-label"><i
							class="fa fa-key fa-fw"></i> CLAVE</label>
						<div class="col-lg-5">
							<input type="password" placeholder="INGRESAR PASSWORD"
								class="form-control" name="password" required pattern="[A-Za-z0-9]{8,8}"
								title="Password Incorrecto">
						</div>
					</div>

					<div class="form-group">
						<div class="col-lg-9 col-lg-offset-3">
							<input type="submit" name="action" class="log" value="LOG IN">
						</div>
					</div>
				</form>
				<form action="register">
						<div class="form-group">
							<input type="submit" name="action" class="reg" value="REGISTRAR USUARIO">
						</div>
				</form>
			</div>
		</div>
	</div>
	<script>
	</script>
</body>
</html>
