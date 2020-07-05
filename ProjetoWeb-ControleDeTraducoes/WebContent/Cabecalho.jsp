<style>
	body{
	    background-image: url(./IMAGENS/FUNDO.jpg); /*Informamos o diret�rio da imagem de fundo.*/
	    background-size: cover;                     /*Background-size � onde especificamos o tamanho da imagem de fundo, o valor cover especifica que a imagem deve preencher toda a tela, de modo que o usu�rio possa vizualizar toda imagem.*/
	    background-attachment:  fixed;              /*background-attachment, especifica a fixa��o da imagem, definimos o valor fixed para que a imagem fique fixa e n�o sobra nenhum tipo de movimenta��o.*/
	    background-position: center;                /*background-position: Especificamos o posicionamento da imagem, definimos o valor center para que a imagem fique centralizada.*/
	    background-repeat: no-repeat;               /*background-repeat: Especifica quando haver� repeti��o em nosso background, definimos o valor no-repeat para que n�o ocorra nenhuma repeti��o.*/
	}
	div.card {
		  background: rgba(0, 0, 0, 0.5);
		  color: #FFFFFF;
	}
	.subtitulo{
		color: #FFFFFF;
		font-weight: 600;

	}
</style>
<footer>
	<div align="right" style="background: none; padding: 20px 20px 20px ;" >
	<!-- <div align="right" style=""> -->
		<a href="http://localhost:8080/ProjetoWeb-ControleDeTraducoes/TraducaoServlet?tipoOperacao=listar" style="color: #1E90FF; margin: 5px 0px 5px 20px;"> Home </a>
		<a href="CadastroTraducao.jsp" style="color: #1E90FF; margin: 5px 0px 5px 20px;"> Cadastrar Tradu��o </a>
		<a href="Login.jsp" style="color: #1E90FF;margin: 5px 10px 5px 20px;">Sair</a>
	<!-- </div> -->
	</div>
	<div align="center">
		<img src="./IMAGENS/TITULO.png" class="img-fluid" style="background-position: center; margin: 30x 0px 10px 0px; ">
	</div>
	<div class="container" >
			<div class="form-grou row" style="background-color: none" align="left">
				<%@ include file="BuscarTraducao.jsp"%>
			</div>
	</div>
	<br>
</footer>
