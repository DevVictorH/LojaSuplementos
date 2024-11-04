package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utils.ConnectionFactory;
import model.Cliente;

public class ClienteDao {

	Connection conexao;

	public boolean inserir(Cliente cliente) {
		boolean retorno = false;

		try {
			conexao = ConnectionFactory.getConexao();
			String sql = "INSERT INTO clientes (cpf,nome) values(?,?)";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, cliente.getCpf());
			ps.setString(2, cliente.getNome());
			int linhasAfetadas = ps.executeUpdate();
			if (linhasAfetadas > 0) {
				retorno = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			if (conexao != null) {
				try {
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return retorno;
	}

	public ArrayList<Cliente> listar() {
		String sql = "SELECT * FROM Clientes";
		ArrayList<Cliente> clientes = new ArrayList<>();

		try (Connection conexao = ConnectionFactory.getConexao();
				PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				Cliente cliente = new Cliente();
				cliente.setId(id);
				cliente.setCpf(cpf);
				cliente.setNome(nome);
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return clientes;
	}

	public boolean atualizar(Cliente clienteAtualizar) {
		boolean retorno = false;

		try {
			conexao = ConnectionFactory.getConexao();
			String sql = "UPDATE clientes SET nome=? WHERE id_cliente = ?";
			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setString(1, clienteAtualizar.getNome());
			ps.setInt(2, clienteAtualizar.getId());
			int linhasAfetadas = ps.executeUpdate();
			if (linhasAfetadas > 0) {
				retorno = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conexao != null) {
				try {
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return retorno;
	}

	public boolean excluir(int id) {
		boolean retorno = false;
		try {

			conexao = ConnectionFactory.getConexao();
			String sql = "DELETE FROM clientes WHERE id_cliente = ?";

			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			int linhasAfetadas = ps.executeUpdate();

			if (linhasAfetadas > 0) {
				retorno = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conexao != null) {
				try {
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return retorno;
	}

	public Cliente buscarPorId(int id) { // terminar de fazer
		try {
			
			Cliente clienteAchado = new Cliente();
			
			conexao = ConnectionFactory.getConexao();
			String sql = "SELECT FROM clientes WHERE idCliente = ?";

			PreparedStatement ps = conexao.prepareStatement(sql);
			ps.setInt(1, id);
			int linhasAfetadas = ps.executeUpdate();

			if (linhasAfetadas > 0) {
				return clienteAchado;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conexao != null) {
				try {
					conexao.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}