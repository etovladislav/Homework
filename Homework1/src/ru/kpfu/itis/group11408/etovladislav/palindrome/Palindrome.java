package ru.kpfu.itis.group11408.etovladislav.palindrome;
import java.util.Scanner;

public class Palindrome {

	private boolean result = true;

	public String toString() {
		if (result)
			return "This word is a palindrome.";
		return "This word is not a palindrome.";
	}

	public void checkWord(char[] a, int left, int right) {
		if ((a.length % 2 == 1) && (left != right) || (a.length % 2 == 0)
				&& (left - right != 1)) {
			if (a[left] == a[right]) {
				checkWord(a, left + 1, right - 1);
			} else {
				result = false;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word: ");
		char[] a = scan.nextLine().toCharArray();
		scan.close();

		int left = 0;
		int right = a.length - 1;

		Palindrome p = new Palindrome();
		p.checkWord(a, left, right);
		System.out.println(p.toString());
	}
}
