package br.com.bo;

import br.com.bean.UsuarioBean;
import br.com.dao.UsuarioDAO;

public class UsuarioBO {
	
	// ----- LOGAR USUÁRIO -----
	public boolean fazerLogin(String nomeUsuario, String senhaUsuario) {
		UsuarioBean usuarioBean = new UsuarioBean (nomeUsuario, senhaUsuario);
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.fazerLogin(usuarioBean);
	}
	
	// ----- CADASTRAR USUÁRIO -----
	public boolean cadastrarUsuario(String nomeUsuario, String senhaUsuario, String perguntaSeguranca, String respostaSeguranca) {
		UsuarioBean usuarioBean = new UsuarioBean (nomeUsuario, senhaUsuario, perguntaSeguranca, respostaSeguranca);
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		if(validaEspacoBranco(nomeUsuario) || validaEspacoBranco(senhaUsuario) || validaEspacoBranco(respostaSeguranca) == false) {
			if(usuarioDAO.validarRepeticao(nomeUsuario) == false) { // não há usuário com esse nome
				return usuarioDAO.cadastrarUsuario(usuarioBean);
			}
		}
		return false;
	}
	
	// ----- ALTERAR SENHA DO USUÁRIO -----
	public boolean alterarSenha(String nomeUsuario, String senhaUsuario, String perguntaSeguranca, String respostaSeguranca) {
		UsuarioBean usuarioBean = new UsuarioBean (nomeUsuario, senhaUsuario, perguntaSeguranca, respostaSeguranca);
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		if(validaEspacoBranco(nomeUsuario) || validaEspacoBranco(senhaUsuario) || validaEspacoBranco(respostaSeguranca) == false) {
			return usuarioDAO.alterarSenha(usuarioBean);
		}
		return false;
	}
	
	// ----- VALIDAR ESPAÇO EM BRANCO -----
	boolean validaEspacoBranco (String var) {
		if (var.trim() != null) {
			return false; // a string recebida é válida (não é um espaço em branco)
		}
		return true;
	}
}
