package ru.kpfu.itis.group11408.etovladislav.electronic;

public class TV extends Electronic {
	private int diag;

	public TV(double cost, int year, double grade, double weight, int diag,
			String name) {
		super(cost, year, grade, weight, name);
		this.diag = diag;
	}

	@Override
	public double calculateRait() {
		if (this.diag < 30) {
			super.raiting = 1000 / cost + year + grade + weight - diag * 100;
			return raiting;
		}

		if (diag > 29 && diag < 100) {
			super.raiting = 1000 / cost + year + grade + weight - diag * 50;
			return raiting;
		}

		super.raiting = 1000 / cost + year + grade + weight + diag * 100;
		return raiting;

	}
}
