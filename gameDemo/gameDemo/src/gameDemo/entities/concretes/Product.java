package gameDemo.entities.concretes;

import gameDemo.entities.abstracts.Entity;

public class Product implements Entity {

	private int id;
	private String name;
	private int price;
	private int unitsInStock;
	
	public Product(int id, String name, int price, int unitsInStock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.unitsInStock = unitsInStock;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
}
