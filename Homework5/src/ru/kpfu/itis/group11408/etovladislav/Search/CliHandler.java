package ru.kpfu.itis.group11408.etovladislav.Search;

import org.apache.commons.cli.*;

import java.io.*;

public class CliHandler {
	private static final String REC_SEARCH = "rec";
	private static final String VIEW_DIRECTORY = "view";
	private static final String DEEP_SEARCH = "deep";

	private Options options;
	private CommandLine line;

	public CliHandler() {

		options = new Options();
		OptionGroup optionGroup = new OptionGroup();

		OptionBuilder.withLongOpt(REC_SEARCH);
		OptionBuilder
				.withDescription("If you set - the search is recursive");
		optionGroup.addOption(OptionBuilder
				.create("r"));
		OptionBuilder
				.withLongOpt(DEEP_SEARCH)
				.hasArgs(1)
				.withDescription(
						"Specify how deep search for the file")
				.withArgName("NUMBER").hasArg();
		optionGroup.addOption(OptionBuilder.create("d"));
		options.addOptionGroup(optionGroup);
/*
		options.addOption(OptionBuilder
				.withLongOpt(VIEW_DIRECTORY)
				.withDescription(
						"Do I need to include in the search folder with a suitable name")
				.create("v"));*/
		options.addOption(OptionBuilder.withLongOpt("help")
				.withDescription("Помощь").create("h"));
	}

	public void parse(String[] args) throws Exception, MissingArgumentException {

		try {
			CommandLineParser parser = new PosixParser();
			line = parser.parse(options, args);
			String a[] = line.getArgs();

		} catch (ParseException exp) {
			System.err.println(exp.getMessage());
		}
		if (line.hasOption("help")) {
			throw new Exception("Print help and exit");
		}
		if (line.hasOption(REC_SEARCH)) {

			try {
				String a[] = line.getArgs();
				Search search = a.length == 1 ? new Search(a[0]) : new Search(
						a[1]);
				File dir = a.length == 1 ? new File("C://") : new File(a[0]);
				search.walkin(dir);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		if (line.hasOption(DEEP_SEARCH)) {
			try {
				String a[] = line.getArgs();
				int i = Integer.parseInt(line.getOptionValue(DEEP_SEARCH));
				DeepSearch search = new DeepSearch();
				if (a.length == 1)
					search.listPath("C://", i, a[0]);
				search.listPath(a[0], i, a[1]);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	private Integer getIntOption(String optionName) {
		Integer val = 0;
		if (!line.hasOption(optionName)) {
			try {
				val = Integer.parseInt(line.getOptionValue(optionName));
				val = val > 0 ? val : -val;
			} catch (NumberFormatException e) {
			}
			return val;
		} else {
			return val;
		}
	}

	public void printCliHelp() {
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("Search files", options);
	}
}
