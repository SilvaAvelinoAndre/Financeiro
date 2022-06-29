package br.com.financeiro.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.financeiro.util.HibernateUtil;

public class GenericDao<Entidade> {

	public void salvar(Entidade entidade) {
		Session sessao = HibernateUtil.getFabricadesessoes().openSession();
		Transaction transacao = null;

		try {

			transacao = sessao.beginTransaction();
			sessao.save(entidade);
			transacao.commit();

		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}

	}

}
