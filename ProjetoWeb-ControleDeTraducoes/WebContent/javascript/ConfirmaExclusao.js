function confirmaExclusao(id){ 
	
	if (confirm("Deseja mesmo apagar essa traducao?")){ 
		alert('Traducao EXCLUIDA com sucesso');
		return true;
	}
	
	return false;
}