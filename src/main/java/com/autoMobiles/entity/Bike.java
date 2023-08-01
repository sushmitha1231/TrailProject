package com.autoMobiles.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bike_details")
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private int price;
	private String color;
	private int cc;
	private int maileage;
	private String noPlate;

	public Bike(int id, String brand, int price, String color, int cc, int maileage, String noPlate) {

		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.cc = cc;
		this.maileage = maileage;
		this.noPlate = noPlate;

	}

	public Bike() {
		super();
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", cc=" + cc
				+ ", maileage=" + maileage + ", noPlate=" + noPlate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getMaileage() {
		return maileage;
	}

	public void setMaileage(int maileage) {
		this.maileage = maileage;
	}

	public String getNoPlate() {
		return noPlate;
	}

	public void setNoPlate(String noPlate) {
		this.noPlate = noPlate;
	}

}
