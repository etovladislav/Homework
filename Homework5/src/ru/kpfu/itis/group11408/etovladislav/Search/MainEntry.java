package ru.kpfu.itis.group11408.etovladislav.Search;
import java.io.File;
 
public class MainEntry{
    public static void main(String[] args) {
    	CliHandler cliHandler = new CliHandler();

    	try {
    	    cliHandler.parse(args);
    	} catch (Exception e) {
    	    cliHandler.printCliHelp();
    	}
    }

}