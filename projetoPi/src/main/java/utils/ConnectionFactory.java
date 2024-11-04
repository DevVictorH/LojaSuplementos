package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConexao() throws SQLException {
		
	try {
		String url = "jdbc:mysql://localhost:3306/srilankalab";
		String usuario = "root";
		String senha = "123321";
		
		return DriverManager.getConnection(url, usuario, senha);
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
	
	}
	
}
