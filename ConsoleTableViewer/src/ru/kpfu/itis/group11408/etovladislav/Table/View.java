package ru.kpfu.itis.group11408.etovladislav.Table;

public class View implements ViewPraider<Animals>{

	@Override
	public int getColoumnCount() {
		return 0;
	}

	@Override
	public String getLabel(Animals obj, int n) {
		String label = null;
		if(n==1)
			label = obj.getName();
		if(n==2)
			label =Integer.toString(obj.getAge());
		if(n==3)
			label =Integer.toString(obj.getWeight());
			
		return label;
	}

	@Override
	public String[] getHeader() {
		return new String[]{"Name","Age","Weight"};
	}



}
