package ru.kpfu.itis.group11408.etovladislav.Table;
import java.util.Comparator;
public interface ModelProvider<T> {
	public T[] getElements(int n);
	public Comparator<T> getComparator();

}
