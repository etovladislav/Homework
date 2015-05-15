package ru.kpfu.itis.group11408.etovladislav.minmax;

public class MinMax {
	public static void main(String[] args) {
		int[] a = { 3, 1, 3, 4, 76, 7, 8, 9 };
		int n = a.length;

		MinMax task = new MinMax();

		int[] res = task.minMax(a, 0, n - 1);

		System.out.println(res[0] + " " + res[1]);
	}

	int[] minMax(int[] a, int i, int j) {
		if (j - i == 1){
			return new int[] { Math.min(a[i], a[j]), Math.max(a[i], a[j]) };
		}
		int[] first = minMax(a, i, (i + j) / 2);
		int[] second = minMax(a, (i + j) / 2 + 1, j);
		return new int[] { Math.min(first[0], second[0]),
				Math.max(first[1], second[1]) };
	}
}