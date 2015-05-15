package ru.kpfu.itis.group11408.etovladislav.Table;

public class Main {

	public static void main(String[] args) {
		
		 ConsoleTableViewer console = new ConsoleTableViewer(new Model(), new View(), 3);
		 console.show();
	}

}
