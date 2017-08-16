package com.util;

import java.util.Collections;
import java.util.List;
import com.comparator.ColorComparator;
import com.comparator.GenderComparator;
import com.comparator.PriceComparator;
import com.comparator.SizeComparator;
import com.entity.Toy;

public class Sorter {

	public static void sort(List<Toy> data, String orderBy) {

		List<Toy> list = data;

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

	}

}
