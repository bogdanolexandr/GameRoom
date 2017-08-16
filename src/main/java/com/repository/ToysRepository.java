package com.repository;

import java.util.HashMap;
import java.util.Map;
import com.entity.Color;
import com.entity.Gender;
import com.entity.Size;
import com.entity.Toy;

public class ToysRepository {

	private Toy[] arrayOfToys = { new Toy(1, "big car", 23, Size.BIG, Gender.BOY, Color.BLUE),
			new Toy(2, "medium car", 20, Size.MEDIUM, Gender.BOY, Color.GREEN),
			new Toy(3, "small car", 18, Size.SMALL, Gender.BOY, Color.RED),
			new Toy(4, "big gun", 38, Size.BIG, Gender.BOY, Color.BLACK),
			new Toy(5, "medium gun", 34, Size.MEDIUM, Gender.BOY, Color.BLACK),
			new Toy(6, "small gun", 30, Size.SMALL, Gender.BOY, Color.GREEN),
			new Toy(7, "big doll", 23, Size.BIG, Gender.GIRL, Color.PINK),
			new Toy(8, "medium doll", 22, Size.MEDIUM, Gender.GIRL, Color.ORANGE),
			new Toy(9, "small doll", 21, Size.SMALL, Gender.GIRL, Color.RED),
			new Toy(10, "pink jumping-rope", 12, Size.MEDIUM, Gender.GIRL, Color.PINK),
			new Toy(11, "red jumping-rope", 12, Size.MEDIUM, Gender.GIRL, Color.RED),
			new Toy(12, "big cube", 38, Size.BIG, Gender.BOTH, Color.BLUE),
			new Toy(13, "medium cube", 34, Size.MEDIUM, Gender.BOTH, Color.GREEN),
			new Toy(14, "small cube", 34, Size.SMALL, Gender.BOTH, Color.WHITE),
			new Toy(15, "big bucket", 18, Size.BIG, Gender.BOTH, Color.ORANGE),
			new Toy(16, "medium bucket", 13, Size.MEDIUM, Gender.BOTH, Color.RED),
			new Toy(17, "small bucket", 10, Size.SMALL, Gender.BOTH, Color.WHITE),
			new Toy(18, "big bear", 20, Size.BIG, Gender.BOTH, Color.GREEN),
			new Toy(19, "medium bear", 17, Size.MEDIUM, Gender.BOTH, Color.BLUE),
			new Toy(20, "small bear", 13, Size.SMALL, Gender.BOTH, Color.PINK) };

	private Map<String, Toy> toys = new HashMap<>();

	public ToysRepository() {
		for (Toy toy : arrayOfToys) {
			toys.put(toy.getTitle(), toy);
		}
	}

	public Toy getToy(String title) {
		return toys.get(title);
	}

}
