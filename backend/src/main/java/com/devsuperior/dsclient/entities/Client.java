package com.devsuperior.dsclient.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Instant bithDate;
	private Integer children;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant createdAt;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant updatedAt;
	
	
	public Client () {
		}


	public Client(Long id, String name, String cpf, Double income, Instant bithDate, Integer children,
			Instant createdAt, Instant updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.bithDate = bithDate;
		this.children = children;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Double getIncome() {
		return income;
	}


	public void setIncome(Double income) {
		this.income = income;
	}


	public Instant getBithDate() {
		return bithDate;
	}


	public void setBithDate(Instant bithDate) {
		this.bithDate = bithDate;
	}


	public Integer getChildren() {
		return children;
	}


	public void setChildren(Integer children) {
		this.children = children;
	}


	public Instant getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}


	public Instant getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}



