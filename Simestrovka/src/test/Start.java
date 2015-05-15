package test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Start {
	private Database[] question;
	private Answer a = new Answer();

	public void start() {
		ParseXml parse = new ParseXml();
		try {
			question = parse.parse();
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		random();
		printInstruction();
		askQuestions();
		printStatistics();

	}

	private void askQuestions() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Вопрос №" + (i + 1));
			System.out.println(question[i].getQuestion());
			System.out.print("Ваш ответ : ");
			a.check(scanLine(),question[i].getAnswer(), i);
			
		}
	}

	private void printStatistics() {
		Statistics[] statistics = a.getStatisticks();

		for (int i = 0; i < 5; i++) {
			if(statistics[i] == null) break;
			System.out.println(statistics[i].getIndex());
			System.out
					.println(question[statistics[i].getIndex()].getQuestion());
			System.out.println("Ваш ответ: " + statistics[i].getAnswerUser());
			System.out.println("Правильный ответ : "
					+ question[statistics[i].getIndex()].getAnswer());
		}


	}

	public void printInstruction() {
		System.out.println("Инструкция бла бла бла");
		System.out.println("Are you ready? Press any key");
		scanLine();
		clearScreen();
	}

	public String scanLine() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public int scanNumber() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public void random() {
		
		Collections.shuffle(Arrays.asList(question));
	}
	

	public void clearScreen() {
		for (int i = 0; i < 30; i++)
			System.out.println();
	}
}
