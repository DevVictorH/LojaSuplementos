package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ProdutoServlet() {
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	  @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        int numErros = 0;

	        try {
	            // Coleta dos parâmetros
	            String nome = request.getParameter("nome");
	            String strQuantidade = request.getParameter("quantidade");

	            // Validação do nome do produto
	            if (nome == null || nome.trim().isEmpty()) {
	                throw new Exception("O nome do produto é obrigatório.");
	            }

	            // Validação da quantidade
	            if (strQuantidade == null || strQuantidade.trim().isEmpty()) {
	                throw new Exception("A quantidade é obrigatória.");
	            }

	            int quantidade = Integer.parseInt(strQuantidade);

	            // Caso a validação passe, definir a mensagem de sucesso
	            request.setAttribute("sucesso", "Produto cadastrado com sucesso!");

	        } catch (NumberFormatException ex) {
	            // Exceção para erros de formato de número
	            request.setAttribute("erro", "Somente número na quantidade.");
	            numErros++;
	        } catch (Exception e) {
	            // Exceção para outros erros de validação
	            request.setAttribute("erro", e.getMessage());
	            numErros++;
	        }

	        // Se houver erros, permanecer na página de cadastro
	        if (numErros > 0) {
	            request.getRequestDispatcher("/views/cadastroProduto.jsp").forward(request, response);
	        } else {
	            // Caso contrário, redirecionar para a página de sucesso ou exibir a mensagem
	            request.getRequestDispatcher("/views/cadastroProduto.jsp").forward(request, response);
	        }
	    }
	}