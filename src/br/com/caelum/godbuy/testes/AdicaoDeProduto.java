package br.com.caelum.godbuy.testes;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import br.com.caelum.godbuy.modelo.Produto;

@SuppressWarnings("deprecation")
public class AdicaoDeProduto {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Produto p1 = new Produto();
		p1.setNome("Mesa");
		p1.setDescricao("Mesa de centro");
		p1.setPreco(28.95);
		
		Produto p2 = new Produto();
		p2.setNome("Prateleira");
		p2.setDescricao("Uma prateleira para colocar livros");
		p2.setPreco(35.9);
		
		Produto p3 = new Produto();
		p3.setNome("Cadeira");
		p3.setDescricao("Cadeira tipo executivo a g�s");
		p3.setPreco(115.84);		
		
		Transaction tx = session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		tx.commit();
	}
}
