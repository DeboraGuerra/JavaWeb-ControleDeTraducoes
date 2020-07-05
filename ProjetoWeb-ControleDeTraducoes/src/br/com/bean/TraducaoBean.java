package br.com.bean;

import java.util.Date;

public class TraducaoBean {
	
	// ----- ATRIBUTOS -----
	private int idTraducao;
	private String nicknameUsuario;
	private String nicknameModerador;
	private String nicknameGerente;
	private String programa;
	private String equipe;
	private String linguaOrigem;
	private String linguaDestino;
	private Date dataTraducao;
	private int qtdLegendas;
	
	
	// ----- CONSTRUTORES -----
	public TraducaoBean(int idTraducao, String nicknameUsuario, 
						String nicknameModerador, String nicknameGerente, 
						String programa, String equipe, String linguaOrigem, 
						String linguaDestino, Date dataTraducao,
						int qtdLegendas) {
		super();
		this.idTraducao = idTraducao;
		this.nicknameUsuario = nicknameUsuario;
		this.nicknameModerador = nicknameModerador;
		this.nicknameGerente = nicknameGerente;
		this.programa = programa;
		this.equipe = equipe;
		this.linguaOrigem = linguaOrigem;
		this.linguaDestino = linguaDestino;
		this.dataTraducao = dataTraducao;
		this.qtdLegendas = qtdLegendas;
	}
	
	public TraducaoBean(String nicknameUsuario, String nicknameModerador, 
						String nicknameGerente, String programa, 
						String equipe, String linguaOrigem, 
						String linguaDestino, Date dataTraducao,
						int qtdLegendas) {
		super();
		this.nicknameUsuario = nicknameUsuario;
		this.nicknameModerador = nicknameModerador;
		this.nicknameGerente = nicknameGerente;
		this.programa = programa;
		this.equipe = equipe;
		this.linguaOrigem = linguaOrigem;
		this.linguaDestino = linguaDestino;
		this.dataTraducao = dataTraducao;
		this.qtdLegendas = qtdLegendas;
	}
	
	
	// ----- GETTERS e SETTERS -----
	public int getIdTraducao() {
		return idTraducao;
	}
	public void setIdTraducao(int idTraducao) {
		this.idTraducao = idTraducao;
	}
	public String getNicknameUsuario() {
		return nicknameUsuario;
	}
	public void setNicknameUsuario(String nicknameUsuario) {
		this.nicknameUsuario = nicknameUsuario;
	}
	public String getNicknameModerador() {
		return nicknameModerador;
	}
	public void setNicknameModerador(String nicknameModerador) {
		this.nicknameModerador = nicknameModerador;
	}
	public String getNicknameGerente() {
		return nicknameGerente;
	}
	public void setNicknameGerente(String nicknameGerente) {
		this.nicknameGerente = nicknameGerente;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	public String getLinguaOrigem() {
		return linguaOrigem;
	}
	public void setLinguaOrigem(String linguaOrigem) {
		this.linguaOrigem = linguaOrigem;
	}
	public String getLinguaDestino() {
		return linguaDestino;
	}
	public void setLinguaDestino(String linguaDestino) {
		this.linguaDestino = linguaDestino;
	}
	public Date getDataTraducao() {
		return dataTraducao;
	}
	public void setDataTraducao(Date dataTraducao) {
		this.dataTraducao = dataTraducao;
	}
	public int getQtdLegendas() {
		return qtdLegendas;
	}
	public void setQtdLegendas(int qtdLegendas) {
		this.qtdLegendas = qtdLegendas;
	}

}
