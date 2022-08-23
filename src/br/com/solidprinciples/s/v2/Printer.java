package br.com.solidprinciples.s.v2;

public class Printer {

	private TextUpdated text;
	
    Printer(TextUpdated t) {
       this.text = t;
    }
    void printText() {

    	System.out.println(text.getText());
    	System.out.println(text.getAuthor());
    	System.out.println(text.getLength());
    
    }
	public TextUpdated getText() {
		return text;
	}
	public void setText(TextUpdated text) {
		this.text = text;
	}
    
}
