package gameDemo.entities.concretes;

import java.time.LocalDate;

import gameDemo.entities.abstracts.Entity;

public class Campaign implements Entity{

private	int id;
private String name;
private LocalDate startDate;
private LocalDate finisDate;
private double discount;

public Campaign(int id, String name, LocalDate startDate, LocalDate finisDate, double discount) {
	super();
	this.id = id;
	this.name = name;
	this.startDate = startDate;
	this.finisDate = finisDate;
	this.discount = discount;
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

public LocalDate getStartDate() {
	return startDate;
}

public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
}

public LocalDate getFinisDate() {
	return finisDate;
}

public void setFinisDate(LocalDate finisDate) {
	this.finisDate = finisDate;
}

public double getDiscount() {
	return discount;
}

public void setDiscount(double discount) {
	this.discount = discount;
}

}
