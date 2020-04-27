package Generics;

import java.util.Comparator;

public class CarspeedComparater implements Comparator<Car> {
	
	@Override
	public int compare(Car t, Car o) {
		return t.speed - o.speed ;
	}

}
