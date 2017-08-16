package com.entity;

import java.util.List;

public class Room {

	private int id;
	private String title;
	private List<Toy> toys;

	public Room(int id, String title, List<Toy> toys) {
		this.id = id;
		this.title = title;
		this.toys = toys;
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

	public List<Toy> getToys() {
		return toys;
	}

	public void setToys(List<Toy> toys) {
		this.toys = toys;
	}

	public double getPrice() {
		double price = 0;
		for(Toy toy : toys) {
			price += toy.getPrice();
		}
		return price;
	}

	public Gender getGender() {
		return toys.get(1).getGender();
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", title=" + title + ", toys=" + toys + ", price=" + getPrice() + "]";
	}

}
