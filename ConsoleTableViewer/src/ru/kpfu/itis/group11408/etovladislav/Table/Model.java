package ru.kpfu.itis.group11408.etovladislav.Table;

import java.util.Comparator;
import java.util.Random;

public class Model implements ModelProvider<Animals>{
	
	@Override
	public Animals[] getElements(int n) {
		Random random = new Random();
		Animals[] arr = new Animals[n];
		for(int i = 0; i<n; i++){
			arr[i] = new Animals("Крокодил <3",(random.nextInt(15)+1),random.nextInt(100)+15);
		}
		return arr;
	}

	@Override
	public Comparator<Animals> getComparator() {
		return new Comparator<Animals>() {
			@Override
			public int compare(Animals o1, Animals o2) {
				if (o1.getAge() > o2.getAge())
					return 1;
				else if (o1.getAge() < o2.getAge())
					return -1;
				else
					return 0;
			}
		};
	}

}
