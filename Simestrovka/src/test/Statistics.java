package test;

public class Statistics {
	private String answerUser;
	private int index;
	public Statistics(String answerUser, int index) {
		this.answerUser = answerUser;
		this.index = index;
	}
	public String getAnswerUser() {
		return answerUser;
	}
	public int getIndex() {
		return index;
	}
}
