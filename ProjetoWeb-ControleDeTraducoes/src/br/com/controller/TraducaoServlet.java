package br.com.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bean.TraducaoBean;
import br.com.bo.TraducaoBO;

@WebServlet("/TraducaoServlet")
public class TraducaoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<TraducaoBean> listaTraducao = new ArrayList<TraducaoBean>();
		TraducaoBO traducaoBO = new TraducaoBO();
		String tipoOperacao = request.getParameter("tipoOperacao");
		Boolean resultBool = true;
    	
    	switch (tipoOperacao) {
    	
    		case "cadastrar":
    			try {
					resultBool = traducaoBO.cadastrarTraducao(request.getParameter("txtNicknameUsuario"), 
										    				  request.getParameter("txtNicknameModerador"),
										    				  request.getParameter("txtNicknameGerente"), 
										    				  request.getParameter("txtPrograma"), 
										    				  request.getParameter("txtEquipe"),
										    				  request.getParameter("txtLinguaOrigem"), 
										    				  request.getParameter("txtLinguaDestino"),
										    				  traducaoBO.converterStringEmDate(request.getParameter("dateTraducao")), 
										    				  Integer.parseInt(request.getParameter("txtQtdTraducao")));
				} catch (NumberFormatException | ParseException e) {
					e.printStackTrace();
				}
    			
    			if (resultBool) {
	    			listaTraducao = traducaoBO.listarTraducoes();
	    			request.setAttribute("listaTraducao", listaTraducao);
					request.getRequestDispatcher("ListaTraducao.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("Error.jsp").forward(request, response);
				}
				break;
				
    		case "listar":
    			listaTraducao = traducaoBO.listarTraducoes();
    			request.setAttribute("listaTraducao", listaTraducao);
				request.getRequestDispatcher("ListaTraducao.jsp").forward(request, response);
    			break;
	    		
	    	case "buscar":
	    		String termoBusca = request.getParameter("txtBuscarPrograma");
	    		listaTraducao = traducaoBO.buscarTraducao(termoBusca);
	    		request.setAttribute("listaTraducao", listaTraducao);
				request.getRequestDispatcher("ListaTraducao.jsp").forward(request, response);
	    		break;
				
	    	case "formAlterar":
	    		TraducaoBean traducaoBean = traducaoBO.buscarTraducaoID(Integer.parseInt(request.getParameter("txtIdTraducao")));
	    		request.setAttribute("traducao", traducaoBean);
	    		request.getRequestDispatcher("AlterarTraducao.jsp").forward(request, response);
	    		break;	
	    		
	    	case "alterar":
				try {
					resultBool = traducaoBO.editarTraducao(Integer.parseInt(request.getParameter("txtIdTraducao")), 
		    											   request.getParameter("txtNicknameUsuario"), 
									    				   request.getParameter("txtNicknameModerador"),
									    				   request.getParameter("txtNicknameGerente"), 
									    				   request.getParameter("txtPrograma"), 
									    				   request.getParameter("txtEquipe"),
									    				   request.getParameter("txtLinguaOrigem"), 
									    				   request.getParameter("txtLinguaDestino"),
									    				   traducaoBO.converterStringEmDate(request.getParameter("dateTraducao")), 
									    				   Integer.parseInt(request.getParameter("txtQtdTraducao")));
				} catch (NumberFormatException | ParseException e) {
					e.printStackTrace();
				}

				if (resultBool) {
					listaTraducao = traducaoBO.listarTraducoes();
					request.setAttribute("listaTraducao", listaTraducao);
					request.getRequestDispatcher("ListaTraducao.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("Error.jsp").forward(request, response);
				}
	    		break;
			
	    	case "excluir":
	    		resultBool = traducaoBO.excluirTraducao(Integer.parseInt(request.getParameter("txtIdTraducao")));
	    		
	    		if(resultBool) {
	    			request.setAttribute("listaTraducao", traducaoBO.listarTraducoes());
	    			request.getRequestDispatcher("ListaTraducao.jsp").forward(request, response);
				} else {
					request.getRequestDispatcher("Error.jsp").forward(request, response);
				}
	    		break;
    	}
    		
	}
	
}
