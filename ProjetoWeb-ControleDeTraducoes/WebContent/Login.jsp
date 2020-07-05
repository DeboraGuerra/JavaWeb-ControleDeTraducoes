<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/style.css">
	<script type="text/javascript" src="javascript/ValidaCampos.js"></script>
	<meta charset="UTF-8">
	<title>TL || Login</title>
</head>

<body class="background">
	
	<%@include file="CabecalhoLogin.jsp"%>
	<div class="container">
		<h6 class="text-danger">${mensagem}</h6>
		<div class="card">
			<div class="card-body" align="center">
				<div align="center">
					<h1>Login</h1><br>
                </div>
				<form action="LoginServlet" method="post">
					<input type="hidden" name="tipoOperacao" value="login">
                   	<div align="center">
                   		<label class="subtitulo" for="txtUsuarioLogin">Usuário</label>
                   		<input type="text" maxlength="45" class="form-control col-sm-6" name="txtUsuario" id="txtUsuarioLogin" style="background: #D9D9D9" placeholder="Digite aqui o seu nickname" required><br>
                  	</div>
                  	<br>
                     <div align="center">
                      	<label class="subtitulo" for="txtSenhaLogin">Senha</label>
                      	<input type="password" maxlength="45" class="form-control col-sm-6" name="txtSenha" id="txtSenhaLogin" style="background: #D9D9D9" placeholder="Digite aqui a sua senha" required><br>
                   	</div>
                   	<br>
                   	<div align="center">
                   		<a href="EsqueciSenha.jsp" style=" color: #1E90FF; margin-left:50px; margin-right:50px;">Esqueci minha senha</a>
                   		<a href="CadastroUsuario.jsp" style=" color: #1E90FF; margin-left:50px; margin-right:50px;">Novo por aqui? Cadastre-se!</a><br>
                   	</div>
                   	<br>
                   	<div class="text-center mt-4">
                     	<button type="submit" class="btn btn-primary col-sm-2" style="background: #277DFF; color: #FFFFFF;">Efetuar Login</button>
                   	</div>
				</form>
			</div>
		</div>	
	</div>
    <script src="./js/bootstrap.min.js"></script>
	<script src="./js/jquery-3.5.0.min.js"></script>
	<script src="./js/custom.js"></script>	
</body>
</html>