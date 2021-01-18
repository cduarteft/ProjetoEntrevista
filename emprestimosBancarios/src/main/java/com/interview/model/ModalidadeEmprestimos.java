package com.interview.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ModalidadeEmprestimos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String tipo;
	
	@Column
	private String taxa;
	
	
	
	
	
	
	
	
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String string) {
		this.tipo = string;
	}
	public String getTaxa() {
		return taxa;
	}
	public void setTaxa(String taxa) {
		this.taxa = taxa;
	}
	
	
	
}
