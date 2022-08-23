package br.com.solidprinciples.s.v2;

public class SRPMain2 {

	public static void main(String[] args) {
		System.out.println("INICIANDO:");
		TextUpdated t =  new TextUpdated();
		t.setText("demo text!");
		t.setAuthor("Bob");
		t.setLength(10);
		
		Printer p = new Printer(t);
		p.printText();
		
		t.allLettersToUpperCase();

		p.printText();
	}

}
