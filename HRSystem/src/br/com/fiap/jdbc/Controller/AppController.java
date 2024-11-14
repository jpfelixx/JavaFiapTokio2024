package br.com.fiap.jdbc.Controller;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.jdbc.dao.AreaAtuacaoDAO;
import br.com.fiap.jdbc.dao.CandidatoDAO;
import br.com.fiap.jdbc.model.areaAtuacao;

public class AppController {

	private static AppController instance;
	private Connection connection;
	private CandidatoDAO candidatoDAO;
	private AreaAtuacaoDAO areaDAO;
	
	public AppController() {
		
		this.connection = new ConnectionFactory().conectar();
		this.candidatoDAO = new CandidatoDAO(connection);
		this.areaDAO =  new AreaAtuacaoDAO(connection);
	}
	//obtem uam unica instancia
	public static AppController getInstance() throws SQLException {
		
		if(instance == null) {
			instance = new AppController();
		}
		return instance;
	}
	public void closeConnection()throws SQLException {
		
		if(connection!=null && !connection.isClosed() {
			connection.close();
		}
	}
	
	

}
