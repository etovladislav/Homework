package ru.kpfu.itis.group11408.etovladislav.Search;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
 
public class DeepSearch {
 
	public void listPath(String pathname, int depth, String mask) throws IOException {
		
		File path = new File(pathname).getAbsoluteFile();

		
		if (!path.isDirectory()) {
			throw new IllegalArgumentException(
					"Cannot list content of " + path.getPath() +
					": Not a directory");
		}
		
		if (depth < 0) {
			
			throw new IllegalArgumentException(
					"List deep cannot be less than zero");
		}
 

		LinkedList<Entry> linkedList = new LinkedList<Entry>();
		Entry e = new Entry(0, path);
		do {
			int nextDepth = e.depth + 1;
			path = e.file;
			if (path.isDirectory()) {
				
				File[] files = path.listFiles();
				if (files != null) for (File item : files) {
					
					if (nextDepth <= depth && item.isDirectory()) {
						
						linkedList.add(new Entry(nextDepth, item));
					}
					
					if (mask == null || item.getName().toLowerCase().contains(mask.toLowerCase()))
						System.out.print(item.getAbsolutePath() + "\n");
				}
			}
			
		e = linkedList.pollLast();
			
		} while (e!=null);
	}
	
	private class Entry {
		
		private int depth;
		private File file;
		
		public Entry(int depth, File file) {
			
			this.depth = depth;
			this.file = file;
		}
	}

}