package ru.kpfu.itis.group11408.etovladislav.Table;
import java.util.Arrays;
public class ConsoleTableViewer{
	private ModelProvider<Animals> obj1;
	private ViewPraider<Animals> obj2;
	private int coloumn;
	Animals[] array;
	public ConsoleTableViewer(ModelProvider<Animals> obj1, ViewPraider<Animals> obj2, int coloumn){
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.coloumn = coloumn;
		array = new Animals[obj1.getElements(coloumn).length];
		array = obj1.getElements(coloumn);
		Arrays.sort(array, obj1.getComparator());
	}
	
	public void show(){
		 for (int i = 0; i < obj2.getHeader().length; i++) {
	            System.out.printf("%9s", obj2.getHeader()[i]);
	        }
	        System.out.println();
	        for (int i = 0; i < array.length; i++) {

	            System.out.printf("%9s", obj2.getLabel(array[i], 1));
	            System.out.printf("%9s", obj2.getLabel(array[i], 2));
	            System.out.printf("%9s", obj2.getLabel(array[i], 3));
	            System.out.println();
	        }
	    }
	}

