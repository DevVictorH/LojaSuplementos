package model;

public class ProdutoValidador {
	
	public static String validar(Produto produto) {
		
		if(produto.getNome() == null || produto.getNome().trim().isEmpty()) {
			return "O nome do produto é obrigatório";
		}
		if(produto.getQuantidade() <= 0 || produto.getNome().trim().isEmpty()) {
			return "A quantidade de produto é obrigatória";
		}
		
		try {
			Integer.parseInt(produto.getQuantidade());
			 } catch (NumberFormatException e) {
			return "A quantidade deve conter apenas números.";
			 }
		return null;
		
	}

}
