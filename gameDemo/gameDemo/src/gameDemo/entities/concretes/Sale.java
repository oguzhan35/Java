package gameDemo.entities.concretes;

import gameDemo.entities.abstracts.Entity;

public class Sale implements Entity {

	private int id;
	private int customerId;
	private int productId;
	private int campaingId;
	
	public Sale(int id, int customerId, int productId, int campaingId) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.productId = productId;
		this.campaingId = campaingId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}
	
}
