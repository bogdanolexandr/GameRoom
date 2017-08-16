package com.comparator;

import java.util.Comparator;

import com.entity.Toy;

public class GenderComparator implements Comparator<Toy> {

	@Override
	public int compare(Toy o1, Toy o2) {
		return o1.getGender().ordinal() - o2.getGender().ordinal();
	}

}
