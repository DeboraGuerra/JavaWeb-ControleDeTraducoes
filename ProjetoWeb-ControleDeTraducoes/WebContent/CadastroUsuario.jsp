<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/style.css">
	<script type="text/javascript" src="javascript/ValidaCampos.js"></script>
	<meta charset="UTF-8">
	<title>TL || Novo Usuário</title>
</head>

<body class="background">
	
	<%@include file="CabecalhoLogin.jsp"%>
	
	<div class="container">
		<div class="card">
			<div class="card-body" align="center">
				<div align="center">
					<h1>Cadastrar Usuário</h1><br>
                </div>
				<form method="post" action="LoginServlet"> 
					<div align="center">
	                   	<label class="subtitulo" for="txtUsuarioLogin">Usuário</label>
	                	<input type="text" maxlength="45" class="form-control col-sm-6" name="txtUsuario" id="txtUsuarioLogin" style="background: #d9d9d9" placeholder="Digite aqui o seu nickname" required>
	                </div>
	                <br>
					<div align="center">
                       	<label class="subtitulo" for="txtSenhaLogin">Senha</label>
                    	<input type="password" maxlength="45" class="form-control col-sm-6" name="txtSenha" id="txtSenhaLogin" style="background: #d9d9d9" placeholder="Digite aqui a sua senha" required>
	                </div>
	                <br>
	                <div align="center">
                       	<label class="subtitulo" for="txtPerguntaLogin">Pergunta de Segurança</label><br>
                    	<select name="selectPergunta" id="selectPergunta" class="form-control col-sm-6">
							<option value="nomeAnimalAtual">Qual o nome do meu primeiro animal de estimação?</option>
							<option value="nomeMelhorAmigo">Qual o nome do(a) meu/minha melhor amigo(a)?</option>
							<option value="especiePrimeiroAnimal">Qual foi o meu primeiro animal de estimação?</option>
							<option value="nomeMae">Qual o nome da minha mãe?</option>
						</select>
	                </div>
	                <br>
	                <div align="center">
                       	<label class="subtitulo" for="txtRespostaLogin">Resposta de Segurança</label>
                    	<input type="text" maxlength="50" class="form-control col-sm-6" name="txtResposta" id="txtRespostaLogin" style="background: #d9d9d9" placeholder="Digite aqui a sua resposta" required>
	                </div>
	                <br>
	                <br>
	                <div align="center">
	                	<a class="btn btn-black col-sm-2" href="Login.jsp" style="background: #277DFF; color: #FFFFFF; margin-left:50px; margin-right:50px;">Cancelar</a>
		                <button type="submit" class="btn  btn-black col-sm-2" name="btnBotao" value="Cadastrar" style="background: #277DFF; color: #FFFFFF; margin-left:50px; margin-right:50px;">Cadastrar</button>
						<input type="hidden" name="tipoOperacao" value="cadastrar">
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