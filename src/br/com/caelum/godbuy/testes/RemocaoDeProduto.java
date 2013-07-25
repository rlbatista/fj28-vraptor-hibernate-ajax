package br.com.caelum.godbuy.testes;

import br.com.caelum.godbuy.dao.ProdutoDao;
import br.com.caelum.godbuy.modelo.Produto;

public class RemocaoDeProduto {
	public static void main(String[] args) {
		ProdutoDao produtoDao = new ProdutoDao();
		
		Produto p = produtoDao.buscaPorId(3L);
		
		produtoDao.remover(p);
	}
}
