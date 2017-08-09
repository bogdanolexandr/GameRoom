package com.repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.comparator.ColorComparator;
import com.comparator.GenderComparator;
import com.comparator.PriceComparator;
import com.comparator.SizeComparator;
import com.entity.Color;
import com.entity.Gender;
import com.entity.Size;
import com.entity.Toy;

public class ToysRepository {

	private Toy[] toys = { 
			new Toy("car", 23, Size.BIG, Gender.BOY, Color.BLUE),
			new Toy("doll", 24, Size.MEDIUM, Gender.GIRL, Color.ORANGE),
			new Toy("cube", 34, Size.SMALL, Gender.BOTH, Color.WHITE),
			new Toy("bucket", 13, Size.MEDIUM, Gender.BOTH, Color.RED),
			new Toy("bear", 13, Size.SMALL, Gender.BOTH, Color.PINK) };

	private List<Toy> list = new LinkedList<>(Arrays.asList(toys));

	public List<Toy> getToys(String orderBy) {

		if (orderBy == null) {
			orderBy = "color";
		}

		switch (orderBy) {
		case "color":
			Collections.sort(list, new ColorComparator());
			break;
		case "gender":
			Collections.sort(list, new GenderComparator());
			break;
		case "price":
			Collections.sort(list, new PriceComparator());
			break;
		case "size":
			Collections.sort(list, new SizeComparator());
			break;
		}

		return list;
	}

}
