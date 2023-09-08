package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="materia")
public class Materia {
	@GeneratedValue(generator = "seq_materia", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, name = "seq_materia", sequenceName = "seq_materia")
	
	@Id
	@Column(name="mate_id")
	private Integer id;
	@Column(name="mate_codigo")
	private String codigo;
	@Column(name="mate_numeroCredito")
	private Integer numeroCredito;
	@Column(name="mate_cedulaProfesor")
	private String cedulaProfesor;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getNumeroCredito() {
		return numeroCredito;
	}
	public void setNumeroCredito(Integer numeroCredito) {
		this.numeroCredito = numeroCredito;
	}
	public String getCedulaProfesor() {
		return cedulaProfesor;
	}
	public void setCedulaProfesor(String cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}
	@Override
	public String toString() {
		return "Materia [id=" + id + ", codigo=" + codigo + ", numeroCredito=" + numeroCredito + ", cedulaProfesor="
				+ cedulaProfesor + "]";
	}
	
	
	
	

}
