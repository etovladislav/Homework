package test;

public class Database {
	private String question;
	private String answer;
	private String author;

	public Database(String question, String answer, String author) {
		this.question = question;
		this.answer = answer;
		this.author = author;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

	public String getAuthor() {
		return author;
	}

}
