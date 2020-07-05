package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.bean.TraducaoBean;

public class TraducaoDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	
	ArrayList<TraducaoBean> lista = new ArrayList<TraducaoBean>();
	
	public TraducaoDAO() {
		conn = new ConnectionFactory().getConnection();	
	}
	
	// ----- CADASTRAR TRADUÇÃO -----
	public boolean cadastrarTraducao(TraducaoBean traducaoBean) {
		String sql = "INSERT INTO dbtraducoes.traducao (nickUsuario, nickModerador, nickGerente, programa, equipe, linguaOrigem, linguaDestino, dataTraducao, qtdLegendas) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, traducaoBean.getNicknameUsuario());
			ps.setString(2, traducaoBean.getNicknameModerador());
			ps.setString(3, traducaoBean.getNicknameGerente());
			ps.setString(4, traducaoBean.getPrograma());
			ps.setString(5, traducaoBean.getEquipe());
			ps.setString(6, traducaoBean.getLinguaOrigem());
			ps.setString(7, traducaoBean.getLinguaDestino());
			ps.setDate(8, new java.sql.Date(traducaoBean.getDataTraducao().getTime()));
			ps.setInt(9, traducaoBean.getQtdLegendas());
			
			ps.execute();
			ps.close();
			return true;
		} catch (Exception erro) {}
		
		return false;
	}
	
	// ----- LISTAR TRADUÇÕES -----
	public ArrayList<TraducaoBean> listarTraducoes() {
		String sql = "SELECT * FROM dbtraducoes.traducao";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				TraducaoBean traducaoBean = new TraducaoBean(rs.getInt("id"),
															 rs.getString("nickUsuario"),
															 rs.getString("nickModerador"),
															 rs.getString("nickGerente"),
															 rs.getString("programa"),
															 rs.getString("equipe"),
															 rs.getString("linguaOrigem"),
															 rs.getString("linguaDestino"),
															 rs.getDate("dataTraducao"),
															 rs.getInt("qtdLegendas"));
				lista.add(traducaoBean);
			}
		} catch (Exception erro) { }
		
		return lista;
	}
	
	// ----- BUSCAR TRADUÇÃO PELO NOME DO PROGRAMA -----
	public ArrayList<TraducaoBean> buscarTraducao (String termoBusca) {
		String sql = "SELECT * FROM dbtraducoes.traducao WHERE programa LIKE '%"+termoBusca+"%'";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				TraducaoBean traducaoBean = new TraducaoBean(rs.getInt("id"),
															 rs.getString("nickUsuario"),
															 rs.getString("nickModerador"),
															 rs.getString("nickGerente"),
															 rs.getString("programa"),
															 rs.getString("equipe"),
															 rs.getString("linguaOrigem"),
															 rs.getString("linguaDestino"),
															 rs.getDate("dataTraducao"),
															 rs.getInt("qtdLegendas"));
				lista.add(traducaoBean);
			}
		} catch (Exception erro) { }
		
		return lista;
		
	}
	
	// ----- BUSCAR TRADUÇÃO PELO ID -----
	public TraducaoBean buscarTraducaoID(int idTraducao) {
		String sql = "SELECT * FROM dbtraducoes.traducao WHERE id = '"+idTraducao+"'";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			rs.next();
			
			TraducaoBean traducaoBean = new TraducaoBean(rs.getInt("id"),
														 rs.getString("nickUsuario"),
													  	 rs.getString("nickModerador"),
														 rs.getString("nickGerente"),
														 rs.getString("programa"),
														 rs.getString("equipe"),
														 rs.getString("linguaOrigem"),
														 rs.getString("linguaDestino"),
														 rs.getDate("dataTraducao"),
														 rs.getInt("qtdLegendas"));
			traducaoBean.setIdTraducao(rs.getInt("id"));
			
			rs.close();
			st.close();
			return traducaoBean;
		} catch (Exception e) {
			System.out.println("ERRO EM 'BUSCAR TRADUÇÃO PELO ID': "+e);
		}
		return null;
	}
	
	// ----- ALTERAR CADASTRO DA TRADUÇÃO -----
	public boolean editarTraducao (TraducaoBean traducaoBean) {
		String sql = "UPDATE dbtraducoes.traducao SET nickUsuario = ?, nickModerador = ?, nickGerente = ?, programa = ?, equipe = ?, linguaOrigem = ?, linguaDestino = ?, dataTraducao = ?,qtdLegendas = ? WHERE id = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, traducaoBean.getNicknameUsuario());
			ps.setString(2, traducaoBean.getNicknameModerador());
			ps.setString(3, traducaoBean.getNicknameGerente());
			ps.setString(4, traducaoBean.getPrograma());
			ps.setString(5, traducaoBean.getEquipe());
			ps.setString(6, traducaoBean.getLinguaOrigem());
			ps.setString(7, traducaoBean.getLinguaDestino());
			ps.setDate(8, new java.sql.Date(traducaoBean.getDataTraducao().getTime()));
			ps.setInt(9, traducaoBean.getQtdLegendas());
			ps.setInt(10, traducaoBean.getIdTraducao());
			
			ps.execute();
			ps.close();
			return true;
		} catch (Exception erro) { }
		return false;
	}
	
	// ----- EXCLUIR TRADUÇÃO -----
	public void excluirTraducao (int idTraducao) {
		String sql = "DELETE FROM dbtraducoes.traducao WHERE id = "+idTraducao;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
		} catch (Exception erro) { }
	}

}
