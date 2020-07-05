<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
		
	<div class="container">
			<form action="TraducaoServlet" method="get">
				<div class="row" align="left">    
			       <fieldset class="form-group col-sm-4">
			           <input type="text" maxlength="45" class="form-control" name="txtBuscarPrograma" id="txtBuscarPrograma" placeholder="Buscar programa..." style="background: #d9d9d9; margin: 5px 0px 5px 20px;" required>
			       </fieldset>
			       <fieldset class="form-group col-md-0">
			           <button type="submit" class='btn btn-default btn-block' style="background-image: url(./IMAGENS/LUPA.png); border: none;background-repeat: no-repeat; padding: 15px; right:0; width: 30px;margin: 5px 0px 5px 20px;"></button>
			       </fieldset>
			   	</div>
				<input type="hidden" name="tipoOperacao" value="buscar">
			</form>	
	</div>

</body>
</html>