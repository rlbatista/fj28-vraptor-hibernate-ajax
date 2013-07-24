package br.com.caelum.godbuy.testes;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import br.com.caelum.godbuy.modelo.Produto;

@SuppressWarnings("deprecation")
public class AlteracaoDeProduto {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Produto p = (Produto) session.load(Produto.class, 1L);
		
		Transaction tx = session.beginTransaction();
		
		p.setPreco(47.29);
		session.update(p);
		
		tx.commit();
	}
}
