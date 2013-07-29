package br.com.caelum.godbuy.infra;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CriadorDeSession implements ComponentFactory<Session> {
	private final SessionFactory factory;
	
	public CriadorDeSession(SessionFactory factory) {
		this.factory = factory;
	}
	
	public Session getInstance() {
		Session session = factory.openSession();
		return session;
	}

}