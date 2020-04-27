package Generics;

import java.util.Comparator;

public class CarpriceComparater implements Comparator<Car> {
	@Override
	public int compare(Car t, Car o) {
		return o.price - t.price ;
	}

}
