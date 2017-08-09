package com.entity;

public class Toy {

	private String title;
	private double price;
	private Size size;
	private Gender gender;
	private Color color;

	public Toy(String title, double price, Size size, Gender gender, Color color) {
		this.title = title;
		this.price = price;
		this.size = size;
		this.gender = gender;
		this.color = color;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
