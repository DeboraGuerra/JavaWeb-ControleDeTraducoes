package br.com.bean;

public class UsuarioBean {
	
	// ----- ATRIBUTOS -----
	private int idUsuario;
	private String nomeUsuario;
	private String senhaUsuario;
	private String perguntaSeguranca;
	private String respostaSeguranca;
	
	
	// ----- CONSTRUTORES -----
	public UsuarioBean(String nomeUsuario, String senhaUsuario) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.senhaUsuario = senhaUsuario;
	}
	
	public UsuarioBean(int idUsuario, String nomeUsuario, String senhaUsuario, 
					   String perguntaSeguranca, String respostaSeguranca) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.senhaUsuario = senhaUsuario;
		this.perguntaSeguranca = perguntaSeguranca;
		this.respostaSeguranca = respostaSeguranca;
	}
	
	public UsuarioBean(String nomeUsuario, String senhaUsuario, 
					   String perguntaSeguranca, String respostaSeguranca) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.senhaUsuario = senhaUsuario;
		this.perguntaSeguranca = perguntaSeguranca;
		this.respostaSeguranca = respostaSeguranca;
	}
	
	
	// ----- GETTERS e SETTERS -----
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public String getPerguntaSeguranca() {
		return perguntaSeguranca;
	}
	public void setPerguntaSeguranca(String perguntaSeguranca) {
		this.perguntaSeguranca = perguntaSeguranca;
	}
	public String getRespostaSeguranca() {
		return respostaSeguranca;
	}
	public void setRespostaSeguranca(String respostaSeguranca) {
		this.respostaSeguranca = respostaSeguranca;
	}
	
}
