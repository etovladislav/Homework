package ru.kpfu.itis.group11408.vladislav;
import java.util.Scanner;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MySet<String> set = new MySet<>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			set.add(scan.nextLine());
		}
		boolean a = true;
		while (a) {
			System.out.println(set.iterator().next());
			if (!set.iterator().hasNext())
				a = false;
		}
	}

}
