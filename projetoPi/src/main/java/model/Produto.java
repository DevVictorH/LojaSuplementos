package model;

public class Produto {
	private String nome;
	private double preco;
	private int id;
	private int quantidade;
	
	public Produto(String nome, double preco, int id, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.id = id;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
