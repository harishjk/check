package com.capgemini.capstore.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Inventory {

	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
