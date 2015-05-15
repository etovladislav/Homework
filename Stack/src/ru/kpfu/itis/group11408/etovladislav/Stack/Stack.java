package ru.kpfu.itis.group11408.etovladislav.Stack;

import java.util.EmptyStackException;

import ru.kpfu.itis.group11408.etovladislav.Stack.exceptions.FullStackException;
import ru.kpfu.itis.group11408.etovladislav.Stack.exceptions.Not—orrectlyPlacedException;

public class Stack<E> {
	private final int size = 20;
	private int top = -1;
	private E[] elements = (E[]) new Object[size];

	public void push(E pushValue) throws FullStackException {
		if (top == size - 1)
			throw new FullStackException(String.format(
					"Stack is full, cannot push ", pushValue));

		elements[++top] = pushValue;
	}

	public E pop() {
		if (isEmpty())
			throw new EmptyStackException();

		return elements[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void theEnd(char c, int index) throws Not—orrectlyPlacedException {
		throw new Not—orrectlyPlacedException(
				String.format("Not correctly placed brackets " + c + " "
						+ index + " position in the string"));
	}

	public Character peek() throws Not—orrectlyPlacedException {
		if (isEmpty())
			throw new Not—orrectlyPlacedException(
					"Not correctly placed brackets");
		return (Character) elements[top];
	}

	public boolean validate(char c[]) {
		return false;

	}
}