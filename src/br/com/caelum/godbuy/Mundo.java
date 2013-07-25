package br.com.caelum.godbuy;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.godbuy.modelo.Produto;
import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {
	public String boasVindas() {
		return "Oi Mundo!!!";
	}
	
	public List<String> paises() {
		List<String> result = new ArrayList<String>();
		result.add("Brasil");
		result.add("Paraguai");
		result.add("Peru");
		result.add("Argentina");
		
		return result;
	}
	
	public Integer idade() {
		return 33;
	}
	
	public Produto dadosProduto() {
		Produto p = new Produto();
		p.setNome("Teste");
		p.setDescricao("Descrição do produto de teste");
		p.setPreco(10.99);
		
		return p;
	}
}
