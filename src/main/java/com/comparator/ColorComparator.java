package com.comparator;

import java.util.Comparator;

import com.entity.Toy;

public class ColorComparator implements Comparator<Toy> {

	@Override
	public int compare(Toy o1, Toy o2) {
		return o1.getColor().ordinal() - o2.getColor().ordinal();
	}

}
