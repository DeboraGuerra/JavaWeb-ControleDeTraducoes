package br.com.controller;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bo.TraducaoBO;
import br.com.bo.UsuarioBO;

@WebServlet("/LoginServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioBO usuarioBO = new UsuarioBO();
		String tipoOperacao = request.getParameter("tipoOperacao");
		boolean resultBool = true;
		
		switch (tipoOperacao) {
    	
			case "login":
				resultBool = usuarioBO.fazerLogin(request.getParameter("txtUsuario"), 
					    						  request.getParameter("txtSenha"));
				if (resultBool) {
					TraducaoBO traducaoBO = new TraducaoBO();
					request.setAttribute("listaTraducao", traducaoBO.listarTraducoes());
					request.getRequestDispatcher("ListaTraducao.jsp").forward(request, response);
				} else {
					request.setAttribute("mensagem", "Usuário e/ou senha incorretos!");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				}
				break;
			
			case "cadastrar":
				resultBool = usuarioBO.cadastrarUsuario(request.getParameter("txtUsuario"), 
						  						  		request.getParameter("txtSenha"),
						  						  		request.getParameter("selectPergunta"),
						  						  		request.getParameter("txtResposta"));
				if (resultBool) {
					request.setAttribute("mensagem", "Cadastro realizado com SUCESSO!");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				} else {
					request.setAttribute("mensagem", "Houve um problema ao realizar o cadastro.");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				}
				break;
				
			case "alterarSenha":
				resultBool = usuarioBO.alterarSenha(request.getParameter("txtUsuario"), 
											  		request.getParameter("txtNovaSenha"),
											  		request.getParameter("selectPergunta"),
					  						  		request.getParameter("txtResposta"));
				if (resultBool) {
					request.setAttribute("mensagem", "Senha alterada com SUCESSO!");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				} else {
					request.setAttribute("mensagem", "Houve um problema ao alterar a senha.");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
				}
				break;
		}
		
	}

}
