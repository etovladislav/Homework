package ru.kpfu.itis.group11408.etovladislav.electronic;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Electronic[] a = new Electronic[3];
		a[0] = new Phone(5000, 2015, 5, 500, "Nokia Lumia");
		a[1] = new Phone(3000, 2013, 3, 300, "Iphone 6");
		a[2] = new TV(27000, 2012, 5, 1000, 20, "Samsung SMART TV");
		Arrays.sort(a);
		for (int i = 2; i >= 0; i--) {
			System.out.println(a[i].getName());
		}
	}
}
