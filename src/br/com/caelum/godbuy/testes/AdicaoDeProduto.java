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
		
		Produto produto = new Produto();
		produto.setNome("Prateleira");
		produto.setDescricao("Uma prateleira para colocar livros");
		produto.setPreco(35.90);
		
		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}
}
