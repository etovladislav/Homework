package ru.kpfu.itis.group11408.etovladislav.Table;

public interface ViewPraider<T> {
	public int getColoumnCount();
	public String getLabel(T obj, int coloumn);
	public String[] getHeader();
}
