package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.bean.UsuarioBean;

public class UsuarioDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public UsuarioDAO() {
		conn = new ConnectionFactory().getConnection();
	}

	
	// ----- LOGAR USUÁRIO -----
	public boolean fazerLogin(UsuarioBean usuarioBean) {
		String sql = "SELECT * FROM dbtraducoes.usuario WHERE nome = ? AND senha = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, usuarioBean.getNomeUsuario());
			ps.setString(2, usuarioBean.getSenhaUsuario());
			rs = ps.executeQuery();
            if (rs.next()) {
            	return true;
            }
			
			ps.close();	
		} catch (Exception erro) { }

		return false;
	}
	
	// ----- CADASTRAR USUÁRIO -----
	public boolean cadastrarUsuario(UsuarioBean usuarioBean) {
		String sql = "INSERT INTO dbtraducoes.usuario (nome, senha, pergunta, resposta) values (?, ?, ?, ?)";
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, usuarioBean.getNomeUsuario());
			ps.setString(2, usuarioBean.getSenhaUsuario());
			ps.setString(3, usuarioBean.getPerguntaSeguranca());
			ps.setString(4, usuarioBean.getRespostaSeguranca());
			
			ps.execute();
			ps.close();
			return true;
		} catch (Exception erro) {}
		
		return false;
	}
	
	// ----- ALTERAR SENHA -----
	public boolean alterarSenha(UsuarioBean usuarioBean) {
		String sql = "UPDATE dbtraducoes.usuario SET senha = ? WHERE nome = ? AND pergunta = ? AND resposta = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, usuarioBean.getSenhaUsuario());
			ps.setString(2, usuarioBean.getNomeUsuario());
			ps.setString(3, usuarioBean.getPerguntaSeguranca());
			ps.setString(4, usuarioBean.getRespostaSeguranca());
			
			ps.execute();
			ps.close();
			return true;
		} catch (Exception erro) {}
		
		return false;
	}
	
	// ----- VALIDAR USUÁRIO REPETIDO -----
	public boolean validarRepeticao(String nickname) {
		String sql = "SELECT * FROM dbtraducoes.usuario WHERE nome = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, nickname);
			rs = ps.executeQuery();
            if (rs.next()) {
            	return true; // usuário já existente
            }
			ps.close();	
		} catch (Exception erro) { }

		return false; // não é usuário já existente
	}
}
