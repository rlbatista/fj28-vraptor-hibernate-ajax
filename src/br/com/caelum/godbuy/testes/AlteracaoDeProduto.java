package br.com.caelum.godbuy.testes;

import org.hibernate.classic.Session;

import br.com.caelum.godbuy.dao.ProdutoDao;
import br.com.caelum.godbuy.infra.CriadorDeSessaoFactory;
import br.com.caelum.godbuy.infra.CriadorDeSession;
import br.com.caelum.godbuy.modelo.Produto;

public class AlteracaoDeProduto {
	public static void main(String[] args) {
		Session session = new CriadorDeSession(new CriadorDeSessaoFactory().getInstance()).getInstance();
		ProdutoDao produtoDao = new ProdutoDao(session);
		
		Produto p = produtoDao.buscaPorId(3L);
		
		p.setPreco(47.29);
		
		produtoDao.atualiza(p);
	}
}
