package br.com.bo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.bean.TraducaoBean;
import br.com.dao.TraducaoDAO;

public class TraducaoBO {
	
	// ----- CADASTRAR TRADUÇÃO -----
	public boolean cadastrarTraducao(String nicknameUsuario, String nicknameModerador, 
									 String nicknameGerente, String programa, 
									 String equipe, String linguaOrigem, 
								     String linguaDestino, Date dataTraducao, 
								     int qtdLegendas) {
		
		TraducaoBean traducaoBean = new TraducaoBean(nicknameUsuario, nicknameModerador, 
													 nicknameGerente, programa, equipe, 
													 linguaOrigem, linguaDestino, 
													 dataTraducao, qtdLegendas);
		TraducaoDAO traducaoDAO = new TraducaoDAO();
		return traducaoDAO.cadastrarTraducao(traducaoBean);
	}
	
	// ----- LISTAR TRADUÇÕES -----
	public ArrayList<TraducaoBean> listarTraducoes() {
		TraducaoDAO listaTraducoes = new TraducaoDAO();
		return listaTraducoes.listarTraducoes();
	}
	
	// ----- BUSCAR TRADUÇÃO PELO NOME DO PROGRAMA -----
	public ArrayList<TraducaoBean> buscarTraducao(String termoBusca) {
		TraducaoDAO traducaoDAO = new TraducaoDAO();
		return traducaoDAO.buscarTraducao(termoBusca);
	}
	
	// ----- BUSCAR TRADUÇÃO PELO ID -----
	public TraducaoBean buscarTraducaoID (int idTraducao) {
		TraducaoDAO traducaoDAO = new TraducaoDAO();
		return traducaoDAO.buscarTraducaoID(idTraducao);	
	}
	
	// ----- ALTERAR CADASTRO DA TRADUÇÃO -----
	public boolean editarTraducao(int idTraducao, String nicknameUsuario, 
								  String nicknameModerador,String nicknameGerente, 
								  String programa, String equipe, String linguaOrigem, 
								  String linguaDestino, Date dataTraducao, int qtdLegendas) {
		
		TraducaoBean traducaoBean = new TraducaoBean(idTraducao, nicknameUsuario, 
													 nicknameModerador, programa, 
													 equipe, linguaOrigem, linguaDestino, 
													 linguaDestino, dataTraducao, 
													 qtdLegendas);
		TraducaoDAO traducaoDAO = new TraducaoDAO();
		return traducaoDAO.editarTraducao(traducaoBean);
	}
	
	// ----- EXCLUIR TRADUÇÃO -----
	public boolean excluirTraducao(int idTraducao) {
		TraducaoDAO traducaoDAO = new TraducaoDAO();
		TraducaoBean traducaoBean = traducaoDAO.buscarTraducaoID(idTraducao);
		
		if (traducaoBean != null) {
			traducaoDAO.excluirTraducao(idTraducao);
			return true;
		}
		return false;
	}
	
	// ----- CONVERTENDO STRING PARA DATA -----
	public Date converterStringEmDate(String data) throws ParseException {
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
        formatoData.setLenient(false);
        return formatoData.parse(data);
    }  

}
