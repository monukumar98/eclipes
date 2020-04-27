package Generics;

import java.util.Comparator;

public class Demo {
	public static void main(String[] args) {
		Integer arr[] = { 34, 67, 83, 1, 36, 65 };
		String str[] = { "djh", "bdjjh", "dgqwvhq", "gqwhcqj", "monu" };
		System.out.printf("mony\tkumar");
		Display(arr);
		Display(str);
		Car cars[] = new Car[5];
		cars[0] = new Car(1000, 20, "Black");
		cars[1] = new Car(200, 10, "White");
		cars[2] = new Car(345, 3, "Yellow");
		cars[3] = new Car(8907, 6, "Red");
		cars[4] = new Car(34, 89, "Grey");
	//	Object obj = new Object();
		bubbleSort(cars, new CarspeedComparater());
		bubbleSort(cars, new CarpriceComparater());
//		bubbleSort(cars, new CarColorComparator());
		Display(cars);
	}

//	public static void Display(int arr[]) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//	}
//	// fun overloading
//	public static void Display(String arr[]) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//	}
	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - counter - 1; j++) {

				if (arr[j].compareTo(arr[j + 1])>0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}
	public static <T> void bubbleSort(T [] arr,Comparator<T> comp) {

		for (int counter = 0; counter < arr.length - 1; counter++) {

			for (int j = 0; j < arr.length - counter - 1; j++) {

				if (comp.compare(arr[j],arr[j+1])>0) {

					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}

	}

}
