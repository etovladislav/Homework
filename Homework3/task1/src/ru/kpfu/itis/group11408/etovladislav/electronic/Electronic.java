package ru.kpfu.itis.group11408.etovladislav.electronic;


public class Electronic implements Comparable {

	protected double cost;
	protected int year;
	protected double grade;
	protected double weight;
	protected double raiting;
	protected String name;

	public String getName() {
		return this.name;
	}

	public Electronic(double cost, int year, double grade, double weight,
			String name) {
		this.cost = cost;
		this.year = year;
		this.grade = grade;
		this.weight = weight;
		this.name = name;

	}

	protected double calculateRait() {
		return raiting;
	}

	public int compareTo(Object obj) {
		Electronic tmp = (Electronic) obj;
		if (calculateRait() < tmp.calculateRait()) {
			return -1;
		} else if (calculateRait() > tmp.calculateRait()) {
			return 1;
		}
		return 0;
	}
}
