package br.com.financeiro.test;
import org.hibernate.Session;
import org.junit.Test;

import br.com.financeiro.util.HibernateUtil;

public class HibernateUtilTest {
	
	@Test
	public void conectar() {
		
		Session sessao = HibernateUtil.getFabricadesessoes().openSession();
		sessao.close();
		
		HibernateUtil.getFabricadesessoes().close();
		
	}
	

}
