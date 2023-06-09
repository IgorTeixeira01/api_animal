package br.com.magna.animal.api.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "TB_ALIMENTACAO")
@Entity
public class Alimentacao{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PK_ID")
	private Long id;
	@Column(name = "VAR_NOME")
	private String nome;
	@Column(name = "BOOL_FONTE_ANIMAL")
	private Boolean fonteAnimal;
	@Column(name = "BOOL_FONTE_VEGETAL")
	private Boolean fonteVegetal;
	

	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public Boolean getFonteVegetal() {
		return fonteVegetal;
	}
	public Boolean getFonteAnimal() {
		return fonteAnimal;
	}
}
