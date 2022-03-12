package com.database;

public class User {

	protected int id;
	protected String name;
	protected String no;
	protected String price;
	
	public User() {
		
	}
	public User(String name, String no, String price) {
		super();
		this.name = name;
		this.no = no;
		this.price = price;
	}
	
	public User(int id, String name, String no, String price) {
		super();
		this.id = id;
		this.name = name;
		this.no = no;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
