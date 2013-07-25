package br.com.caelum.godbuy.infra;

import br.com.caelum.godbuy.dao.ProdutoDao;
import br.com.caelum.godbuy.modelo.Produto;

public class AdicaoDeProduto {
	public static void main(String[] args) {
		Produto p1 = criaProduto();
		
		new ProdutoDao().salvar(p1);
	}

	private static Produto criaProduto() {
		Produto p1 = new Produto();
		p1.setNome("Mesa");
		p1.setDescricao("Mesa de centro");
		p1.setPreco(28.95);
		return p1;
	}
}
