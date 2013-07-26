package br.com.caelum.godbuy.dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import br.com.caelum.godbuy.infra.CriadorDeSession;
import br.com.caelum.godbuy.modelo.Produto;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class ProdutoDao {

	private final Session session;	

	public ProdutoDao() {
		this.session = CriadorDeSession.getSession();
	}

	public void salva(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}

	public void atualiza(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.update(produto);
		tx.commit();
	}
	
	public void remove(Produto produto) {
		Transaction tx = session.beginTransaction();
		session.delete(produto);
		tx.commit();		
	}
	
	public Produto buscaPorId(Long id) {
		Produto produto = (Produto) session.load(Produto.class, id);
		return produto;
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> listaTudo(){
		return session.createCriteria(Produto.class).list();
	}
}
