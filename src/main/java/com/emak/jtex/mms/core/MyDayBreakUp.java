package com.emak.jtex.mms.core;

import java.io.Serializable;

public class MyDayBreakUp implements Serializable {
	private static final long serialVersionUID = 3346413771320418908L;

	private int id;
	private Product product;
	private int quantity;
	private String feedBack;

	public MyDayBreakUp() {
		this.id = 0;
		this.product = new Product();
		this.quantity = 0;
		this.feedBack = "";
	}

	public MyDayBreakUp(int id, Product product, int quantity, String feedBack) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.feedBack = feedBack;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

	public void clear() {

		this.id = 0;
		this.product = new Product();
		this.quantity = 0;
		this.feedBack = "";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDayBreakUp other = (MyDayBreakUp) obj;
		if (id != other.id)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		return true;
	}
	
	

}
