package com.comparator;

import java.util.Comparator;

import com.entity.Toy;

public class PriceComparator implements Comparator<Toy> {

	@Override
	public int compare(Toy o1, Toy o2) {
		double result = o1.getPrice() - o2.getPrice();
		boolean isMore = result > 0;
		boolean isLess = result < 0;
		if(isMore) {
			return 1;
		}else{
			if(isLess) {
				return -1;
			}
		}
		return 0;
	}

}
