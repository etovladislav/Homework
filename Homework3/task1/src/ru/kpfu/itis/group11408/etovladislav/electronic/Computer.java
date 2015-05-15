package ru.kpfu.itis.group11408.etovladislav.electronic;


public class Computer extends Electronic {

	public int memory;

	public Computer(double cost, int year, double grade, double weight,
			int memory, String name) {
		super(cost, year, grade, weight, name);
	}

	@Override
	public double calculateRait() {
		if (this.memory < 512) {
			super.raiting = 1000 / cost + year + grade + weight - this.memory
					* 5;
			return raiting;
		}
		if (this.memory > 511 && this.memory <= 1024) {
			super.raiting = 10000 / cost + year + grade + weight + this.memory
					- 256;
			return raiting;
		}
		super.raiting = 1000 / cost + year + grade + weight + this.memory;
		return raiting;

	}
}
