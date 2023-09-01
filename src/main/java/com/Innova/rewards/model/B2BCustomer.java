package com.Innova.rewards.model;

import java.beans.Transient;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
public class B2BCustomer {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@OneToMany(mappedBy="customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Transaction> transactions;
	@JsonInclude
	private Long rewardPoints;
	@JsonInclude
	private Double totalPurchases;
	
	public B2BCustomer() {
		super();
	}
	public B2BCustomer(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}
	public Long getRewardPoints() {
		if (transactions == null || transactions.isEmpty()) return 0l;
		
		return transactions.stream().map(x -> x.getPoints().intValue()).reduce(0, (a,b) -> a + b).longValue();
	}
	public Double getTotalPurchases() {
		if (transactions == null || transactions.isEmpty()) return 0d;
		
		return transactions.stream().map(x -> x.getTotal().doubleValue()).reduce(0d, (a,b) -> a + b).doubleValue();
	}
	
	
}
