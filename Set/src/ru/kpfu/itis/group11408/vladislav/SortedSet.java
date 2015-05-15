package ru.kpfu.itis.group11408.vladislav;

public interface SortedSet<T> extends Iterable<T> {
	void add(T element);

	void clear();

	boolean contains(Object o);

	boolean isEmpty();

	void remove(Object o);

	int size();

	Object[] toArray();
}
