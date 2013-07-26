package br.com.caelum.godbuy.controller;

import java.util.List;

import br.com.caelum.godbuy.dao.ProdutoDao;
import br.com.caelum.godbuy.modelo.Produto;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ProdutosController {
	private final ProdutoDao dao;
	private final Result result;
	
	public ProdutosController(ProdutoDao dao, Result result) {
		this.dao = dao;
		this.result = result;
	}

	public void formulario() {
		
	}
	
	public List<Produto> lista(){
		return dao.listaTudo();
	}
	
	public void adiciona(Produto produto) {
		dao.salva(produto);
		result.redirectTo(this).lista();
	}
	
	public Produto edita(Long id) {
		return dao.buscaPorId(id);
	}
	
	public void altera(Produto produto) {
		dao.atualiza(produto);
		result.redirectTo(this).lista();
	}
	
	public void remove(Long id) {
		Produto produto = dao.buscaPorId(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}
}
