package br.com.financeiro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Estado extends GenericDomain {
	
	@Column(length = 2, nullable = false)
	private String sigla;
	
	@Column(length = 30, nullable = false)
	private String nome;

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
