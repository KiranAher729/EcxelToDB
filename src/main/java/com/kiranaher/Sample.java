package com.kiranaher;

public class Sample {

	private int id;
	private String name;
	
	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Sample [id=" + id + ", name=" + name + "]";
	}
	
}
