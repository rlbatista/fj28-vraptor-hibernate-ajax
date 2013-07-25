package br.com.caelum.godbuy.dao;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import br.com.caelum.godbuy.infra.CriadorDeSession;
import br.com.caelum.godbuy.modelo.Produto;

public class ProdutoDao {

	private final Session session;	

	public ProdutoDao() {
		this.session = CriadorDeSession.getSession();
	}

	public void salvar(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}

	public Produto buscaPorId(Long id) {
		Produto protudo = (Produto) session.load(Produto.class, id);
		return protudo;
	}

	public void atualizar(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.update(produto);
		tx.commit();
	}

	public void remover(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.delete(produto);
		tx.commit();		
	}

}
