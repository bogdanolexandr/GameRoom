package com.entity;

public class Toy {

	private int id;
	private String title;
	private double price;
	private Size size;
	private Gender gender;
	private Color color;

	public Toy(int id, String title, double price, Size size, Gender gender, Color color) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.size = size;
		this.gender = gender;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Toy [id=" + id + ", title=" + title + ", price=" + price + ", size=" + size + ", gender=" + gender
				+ ", color=" + color + "]";
	}

}
