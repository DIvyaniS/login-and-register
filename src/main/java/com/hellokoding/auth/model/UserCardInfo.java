package com.hellokoding.auth.model;

import javax.persistence.*;

@Entity
@Table(name = "userCardinfo")
public class UserCardInfo {
	
	public UserCardInfo(int id, String bank_name, String card_number, User user) {
		super();
		this.id = id;
		this.bank_name = bank_name;
		this.card_number = card_number;
		this.user = user;
	}

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int id;
	private String bank_name;
	private String card_number;
	
	@ManyToOne
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
