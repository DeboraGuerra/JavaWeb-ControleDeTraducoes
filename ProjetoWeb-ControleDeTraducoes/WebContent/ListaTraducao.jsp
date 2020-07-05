<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/style.css">
	<script type="text/javascript" src="javascript/ConfirmaExclusao.js"></script>
	<meta charset="UTF-8">
	<title>TL || Lista</title>
</head>

<body class="background">
	<%@include file="Cabecalho.jsp"%><br>
	
	<input type="hidden" name="listar">
	
	<div class="container">
		<div class="card">
			<div class="card-body">
				<table class="table" >
				    <thead class="thead-light" style="color: #ffffff">
						<tr>
							<th scope="col">Programa</th>
							<th scope="col">Tradutor</th>
							<th scope="col">Gerente</th>
							<th scope="col">Moderador</th>
							<th scope="col">Equipe</th>
							<th scope="col">Língua Origem</th>
							<th scope="col">Língua Destino</th>
							<th scope="col">Data    </th>
							<th scope="col">Qtde. de Legendas</th>
							<th scope="col">Opções</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listaTraducao}" var="traducao">
					    	<tr>
					    		<td>${traducao.getPrograma()}</td>
					    		<td>${traducao.getNicknameUsuario()}</td>
								<td>${traducao.getNicknameGerente()}</td>
								<td>${traducao.getNicknameModerador()}</td>
								<td>${traducao.getEquipe()}</td>
								<td>${traducao.getLinguaOrigem()}</td>
								<td>${traducao.getLinguaDestino()}</td>
								<td>${traducao.getDataTraducao()}</td>
								<td>${traducao.getQtdLegendas()}</td>
								<td>
									<a href="http://localhost:8080/ProjetoWeb-ControleDeTraducoes/TraducaoServlet?tipoOperacao=formAlterar&txtIdTraducao=${traducao.getIdTraducao()}" class="btn btn-black" role="button" style="background-image: url(./IMAGENS/EDITAR.png); border: none;background-repeat: no-repeat; padding: 15px; right:0; width: 30px;margin: 5px 0px 5px 20px;"></a>
									<a href="http://localhost:8080/ProjetoWeb-ControleDeTraducoes/TraducaoServlet?tipoOperacao=excluir&txtIdTraducao=${traducao.getIdTraducao()}" class="btn btn-black" onclick="return confirmaExclusao();" role="button" style="background-image: url(./IMAGENS/LIXEIRA.png); border: none;background-repeat: no-repeat; padding: 15px; right:0; width: 30px;margin: 5px 0px 5px 20px;"></a>
								</td>
					      	</tr>
					     </c:forEach>
					</tbody>
				</table>
				</div>
			</div>
		</div>
		
	</body>

</html>