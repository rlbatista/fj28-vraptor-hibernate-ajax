package br.com.caelum.godbuy.testes;

import br.com.caelum.godbuy.dao.ProdutoDao;
import br.com.caelum.godbuy.modelo.Produto;

public class AlteracaoDeProduto {
	public static void main(String[] args) {
		ProdutoDao produtoDao = new ProdutoDao();
		
		Produto p = produtoDao.buscaPorId(3L);
		
		p.setPreco(47.29);
		
		produtoDao.atualizar(p);
	}
}
