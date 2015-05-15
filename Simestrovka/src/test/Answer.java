package test;

import java.util.ArrayList;

public class Answer {
	private String answerUser;
	private String answerProg;
	private Statistics[] statistics = new Statistics[5];
	private int index;
	private int count = 0;


	private String deleteChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ',') || (s.charAt(i) == '!')
					|| (s.charAt(i) == '.')) {
				s = new StringBuffer(s).replace(i, i + 1, " ").toString();
			}
		}
		return s;
	}
	
	public Statistics[] getStatisticks(){
		return statistics;
	}
	private String[] cutString(String str) {
		ArrayList<String> result = new ArrayList<>();
		int i = 0;
		while (i < str.length()) {
			String s = "";
			while ((i < str.length()) && (str.charAt(i) != ' ')) {
				s = s + str.charAt(i);
				i++;
			}
			if (s != "")
				result.add(s);
			i++;
		}
		return result.toArray(new String[result.size()]);
	}

	private boolean eq(String[] arUs, String[] arPr) {
		for (int i = 0; i < arUs.length; i++) {
			int f = 0;
			for (int j = 0; j < arPr.length; j++) {
				if (Math.abs(arUs[i].length() - arPr[j].length()) < 2) {

					int disparity = Math.abs(arUs[i].length()
							- arPr[j].length());
					int length;

					if (arUs[i].length() < arPr[j].length()) {
						length = arUs[i].length();
					} else {
						length = arPr[j].length();
					}

					for (int l = 0; l < length; l++) {
						if (arUs[i].charAt(l) != arPr[j].charAt(l)) {
							disparity++;
						}
					}
					if (disparity < 2) {
						f = 1;
					}
				}
			}
			if (f == 0)
				statistics[count] = new Statistics(answerUser, this.index);
				count++;
				return false;
		}
		return true;
	}

	public boolean check(String answerUser, String answerProg, int index) {
		this.answerProg = answerProg;
		this.answerUser = answerUser;
		this.index = index;
		answerUser = deleteChar(answerUser);
		answerProg = deleteChar(answerProg);
		answerUser.toUpperCase();
		answerProg.toUpperCase();
		return eq(cutString(answerUser), cutString(answerProg));
	}
}