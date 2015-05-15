package ru.kpfu.itis.group11408.etovladislav.Search;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Search {
	private static String pattern;
	public Search(String pattern) {
			this.pattern = pattern;
	}
	 public static void walkin(File dir) throws IOException{
	        File listFile[] = dir.listFiles();
	        if (!dir.isDirectory()) {
				throw new IllegalArgumentException("Cannot list content of " + dir.getPath() +
						": Not a directory");
			}
			if (!dir.exists()) {
				throw new FileNotFoundException("Cannot access " + dir.getPath()
						+ ": No such file");
			}
	        if (listFile != null) {
	            for (int i=0; i<listFile.length; i++) {
	                if (listFile[i].isDirectory()) {
	                    walkin(listFile[i]);
	                } else {
	                    if (listFile[i].getName().toLowerCase().contains(pattern.toLowerCase())) {
	                        System.out.println(listFile[i].getPath());
	                    }
	                }
	                
	            }
	        }
	    }
}
