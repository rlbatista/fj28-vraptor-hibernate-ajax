package br.com.caelum.godbuy.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@SuppressWarnings("deprecation")
@Component @ApplicationScoped
public class CriadorDeSessaoFactory implements ComponentFactory<SessionFactory> {

	private SessionFactory factory;

	public SessionFactory getInstance() {
		return this.factory;
	}
	
	@PostConstruct
	public void abre() {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure();
		this.factory = cfg.buildSessionFactory();		
	}
	
	@PreDestroy
	public void fecha() {
		this.factory.close();
	}
}
