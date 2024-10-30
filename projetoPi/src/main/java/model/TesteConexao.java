package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import utils.ConnectionFactory;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = ConnectionFactory.getConexao();
		
		System.out.println("conexão efetuada com sucesso!");
		
		 String sql = "SELECT * FROM login";

	        Statement st = conexao.createStatement();
	        ResultSet resultado = st.executeQuery(sql);

	        List<Pessoa> pessoas = new ArrayList<>();

	        while(resultado.next()){
	            int codigo = resultado.getInt("idCliente");
	            String nome = resultado.getString("nomeCliente");
	            pessoas.add(new Pessoa(codigo, nome));
	        }

	        for(Pessoa p : pessoas){
	            System.out.println(p.getCodigo() + " - " + p.getNome());
	        }

	        st.close();
	        conexao.close();
	}
}
