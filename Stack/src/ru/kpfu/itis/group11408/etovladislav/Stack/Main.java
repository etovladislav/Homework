package ru.kpfu.itis.group11408.etovladislav.Stack;

import java.util.Scanner;

import ru.kpfu.itis.group11408.etovladislav.Stack.exceptions.Not—orrectlyPlacedException;

public class Main {

	public static void main(String[] args) {
		try {
			Stack stack = new Stack();
			String s = "{{}(}";

			for (int index = 0; index < s.length(); index++) {
				if (isOpenBrackets(s.charAt(index))) {
					stack.push(s.charAt(index));
				}
				if (isCloseBrackets(s.charAt(index)) && stack.isEmpty()) {
					stack.theEnd(s.charAt(index), index + 1);
				}
				if (isCloseBrackets(s.charAt(index))) {
					if (isPairBrackets(stack.peek(), s.charAt(index))) {
						stack.pop();
					} else {
						stack.theEnd(s.charAt(index), index + 1);
					}
				}
			}
			if (stack.isEmpty()) {
				System.out.println("¬ÒÂ ‚ÂÌÓ.");
			} else {
				throw new Not—orrectlyPlacedException(
						"Not correctly placed brackets");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean isOpenBrackets(char a) {
		return (a == '{' | a == '(' | a == '[') ? true : false;
	}

	private static boolean isCloseBrackets(char a) {
		return (a == '}' | a == ')' | a == ']') ? true : false;
	}

	private static boolean isPairBrackets(char open, char close) {
		if (open == '{' && close == '}')
			return true;
		if (open == '(' && close == ')')
			return true;
		if (open == '[' && close == ']')
			return true;
		return false;
	}
}