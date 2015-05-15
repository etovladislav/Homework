package ru.kpfu.itis.group11408;


public class MyQueue<T> implements Queue<T> {
	private  int size = 20;
	private Object[] queue = new Object[size];
	private int start = 0;
	private int end= 0;
	private int queueLength = 0;

	public void offer(T t) throws Exception {
		queue[end++] = t;
		queueLength++;
		if (end == size) {
			end = 0;
		}
		if (queueLength >= size) {
			throw new Exception("Очередь заполненаю");
		}
	}

	@SuppressWarnings("unchecked")
	public T peek() throws Exception {
		if (!isEmpty()) {
			return (T) queue[start];
		} else
			throw new Exception("Очередь пуста.");
	}

	public T poll() throws Exception {
		if (!isEmpty()) {
			@SuppressWarnings("unchecked")
			T element = (T) queue[start++];
			queueLength--;
			if (start == size) {
				start = 0;
			}
			return element;
		} else
			throw new Exception("Очередь пуста.");
	}

	public boolean isEmpty() {
		return queueLength == 0;
	}

	public int size() {
		return queueLength;
	}
}