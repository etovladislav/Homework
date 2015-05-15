package ru.kpfu.itis.group11408;
public interface Queue<T> {
	void offer(T t) throws Exception;

	T peek() throws Exception;

	T poll() throws Exception;

	boolean isEmpty();

	int size();

}