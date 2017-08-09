package com.comparator;

import java.util.Comparator;

import com.entity.Toy;

public class SizeComparator implements Comparator<Toy> {

	@Override
	public int compare(Toy o1, Toy o2) {
		return o1.getSize().ordinal() - o2.getSize().ordinal();
	}

}
