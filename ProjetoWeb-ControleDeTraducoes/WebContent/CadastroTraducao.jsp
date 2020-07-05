<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>TL || Cadastro</title>
</head>
<body>
	<%@ include file="Cabecalho.jsp"%>
	<div class="container">	
		<div class="card">
			<div class="card-body" align="center">
				<div align="center">
					<h1>Cadastrar Tradução</h1><br>
                </div>
				<form method="post" action="TraducaoServlet"> 
					<div class="form-group">
						<label class="subtitulo" for="txtNicknameUsuario">Usuário</label>
						<input  type="text" maxlength="45" class="form-control col-sm-6" name="txtNicknameUsuario" id="txtNicknameUsuario" placeholder="Digite o seu nickname" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtNicknameGerente">Gerente de Canal</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtNicknameGerente" id="txtNicknameGerente" placeholder="Digite o nickname do gerente" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtNicknameModerador">Moderador</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtNicknameModerador" id="txtNicknameModerador" placeholder="Digite o nickname do moderador" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtPrograma">Programa</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtPrograma" id="txtPrograma" placeholder="Digite o nome do programa" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtEquipe">Equipe</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtEquipe" id="txtEquipe" placeholder="Digite o nome da equipe" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtLinguaOrigem">Língua de Origem</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtLinguaOrigem" id="txtLinguaOrigem" placeholder="Digite a lingua origem da tradução " style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtLinguaDestino">Língua de Destino</label>
						<input type="text" class="form-control col-sm-6" name="txtLinguaDestino" id="txtLinguaDestino" placeholder="Digite a lingua que será traduzida" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="dateTraducao">Data da Tradução</label>
						<input type="date" class="form-control col-sm-6" name="dateTraducao" id="dateTraducao" placeholder="Digite a data da tradução" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtQtdTraducao">Quantidade de Traduções</label>
						<input type="number" min="0" class="form-control col-sm-6" name="txtQtdTraducao" id="txtQtdTraducao" placeholder="Digite a quantidade de legendas traduzidas" style="background: #d9d9d9" required>
					</div>
					<div align="center">
					<a class="btn btn-black col-sm-2" href="http://localhost:8080/ProjetoWeb-ControleDeTraducoes/TraducaoServlet?tipoOperacao=listar" style="background: #277DFF; color: #FFFFFF; margin-left:50px; margin-right:50px;">Cancelar</a>
					<button type="submit" class="btn btn-black col-sm-2" name="btnBotao" value="Cadastrar" style="background: #277DFF; color: #FFFFFF; margin-left:50px; margin-right:50px; ">Cadastrar</button>
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