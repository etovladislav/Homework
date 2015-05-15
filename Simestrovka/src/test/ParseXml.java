package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseXml {

	public Database[] parse() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder();
		Document doc = documentBuilder.parse(new File("xml.xml"));

		NodeList nodeList = doc.getElementsByTagName("question");
		String question;
		String answer;
		String author;
		Database[] questions = new Database[nodeList.getLength()];
		for (int i = 0; i < nodeList.getLength(); i++) {
			Element element = (Element) nodeList.item(i);
			question = element.getElementsByTagName("Question").item(0)
					.getTextContent();
			answer = element.getElementsByTagName("Answer").item(0)
					.getTextContent();
			author = element.getElementsByTagName("Authors").item(0)
					.getTextContent();
			questions[i] = new Database(question, answer, author);
		}
		return questions;
	}
}
