package com.book;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookEntity {
	@Id
	double Id;
	String bname;
	int qty;
	float price;
	
	public BookEntity(double id, String bname, int qty, float price) {
		super();
		Id = id;
		this.bname = bname;
		this.qty = qty;
		this.price = price;
	}

	public double getId() {
		return Id;
	}

	public void setId(double id) {
		Id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookEntity [Id=" + Id + ", bname=" + bname + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	

}
