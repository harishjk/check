package com.capgemini.capstore.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PaymentMethod")
public class PaymentMethod {

	@Id
	private int id;
	private int cash;
	private int netbanking;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public int getNetbanking() {
		return netbanking;
	}
	public void setNetbanking(int netbanking) {
		this.netbanking = netbanking;
	}
}
