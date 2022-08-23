package br.com.solidprinciples.s.v1;

public class SRPMain {

	public static void main(String[] args) {
		System.out.println("INICIANDO:");
		Text t = new Text();
		t.setText("demo text!");
		t.setAuthor("Bob");
		t.setLength(10);
		
		t.printText();
		

		t.allLettersToUpperCase();

		t.printText();
	}

}
