package Generics;

public class Car { //implements Comparable<Car> {
	int speed;
	int price;
	String color;

	public Car(int speed, int price, String color) {
		this.speed = speed;
		this.color = color;
		this.price = price;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "s: " + this.speed + " p: " + this.price + " C: " + this.color;

	}

//	@Override
//	public int compareTo(Car other ) {
//		// TODO Auto-generated method stub
//		
//	//return this.speed-other.speed;
//	//return other.price-this.price;
//		return this.color.compareTo(other.color);
//	}

}
