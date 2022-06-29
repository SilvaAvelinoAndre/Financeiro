package br.com.financeiro.test.dao;

import org.junit.Test;

import br.com.financeiro.dao.EstadoDao;
import br.com.financeiro.domain.Estado;

public class EstadoDAOTest {
	
	
	@Test
	public void salvar() {
	
	Estado estado = new Estado();
	estado.setNome("São Paulo");
	estado.setSigla("SP");
	
	EstadoDao edao = new EstadoDao();
	edao.salvar(estado);
	
	}

}
