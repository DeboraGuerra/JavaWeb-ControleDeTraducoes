<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>TL || Alterar</title>
</head>
<body>
	<%@ include file="Cabecalho.jsp"%>
	<div class="container">
		<div class="card" >
			<div class="card-body" align="center">
				<div align="center">
					<h1>Alterar Tradução</h1><br>
                </div>
				<form method="post" action="http://localhost:8080/ProjetoWeb-ControleDeTraducoes/TraducaoServlet?tipoOperacao=alterar"> 
					<div class="form-group">
						<label class="subtitulo" for="txtNicknameUsuario">Usuário</label>
						<input  type="text" maxlength="45" class="form-control col-sm-6" name="txtNicknameUsuario" id="txtNicknameUsuario" value="${traducao.getNicknameUsuario()}" style="background: #d9d9d9" readonly="readonly">
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtNicknameGerente">Gerente de Canal</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtNicknameGerente" id="txtNicknameGerente" value="${traducao.getNicknameGerente()}" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtNicknameModerador">Moderador</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtNicknameModerador" id="txtNicknameModerador" value="${traducao.getNicknameModerador()}" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtPrograma">Programa</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtPrograma" id="txtPrograma" value="${traducao.getPrograma()}" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtEquipe">Equipe</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtEquipe" id="txtEquipe" value="${traducao.getEquipe()}" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtLinguaOrigem">Língua de Origem</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtLinguaOrigem" id="txtLinguaOrigem" value="${traducao.getLinguaOrigem()}" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtLinguaDestino">Língua de Destino</label>
						<input type="text" maxlength="45" class="form-control col-sm-6" name="txtLinguaDestino" id="txtLinguaDestino" value="${traducao.getLinguaDestino()}" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="dateTraducao">Data da Tradução</label>
						<input type="date" class="form-control col-sm-6" name="dateTraducao" id="dateTraducao" value="${traducao.getDataTraducao()}" style="background: #d9d9d9" required>
					</div>
					<div class="form-group">
						<label class="subtitulo" for="txtQtdTraducao">Quantidade de Traduções</label>
						<input type="number" min="0" class="form-control col-sm-6" name="txtQtdTraducao" id="txtQtdTraducao" value="${traducao.getQtdLegendas()}" style="background: #d9d9d9" required>
					</div>
					<br>
					<a class="btn btn-black col-sm-2" href="http://localhost:8080/ProjetoWeb-ControleDeTraducoes/TraducaoServlet?tipoOperacao=listar" style="background: #277DFF; color: #FFFFFF; margin-left:50px; margin-right:50px;">Cancelar</a>
					<button type="submit" class="btn btn-black col-sm-2" name="btnBotao" value="alterar" style="background: #277DFF; color: #FFFFFF; margin-left:50px; margin-right:50px;">Alterar</button>
					<input type="hidden" name="txtIdTraducao" value="${traducao.getIdTraducao()}">
					<input type="hidden" name="tipoOperacao" value="alterar">
				</form>
			</div>
		</div>	
	</div>
    <script src="./js/bootstrap.min.js"></script>
	<script src="./js/jquery-3.5.0.min.js"></script>
	<script src="./js/custom.js"></script>
</body>
</html>