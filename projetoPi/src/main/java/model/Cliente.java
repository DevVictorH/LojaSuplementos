package model;

public class Cliente {
	private String nome;
	private String cpf;
	private String senha;
	private String email;
	private int id;
	
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cpf, String senha, String email, int id) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.email = email;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		
}
