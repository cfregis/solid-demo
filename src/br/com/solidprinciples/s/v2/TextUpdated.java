package br.com.solidprinciples.s.v2;

public class TextUpdated {

	private String text;

	private String author;

	private int length;


	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	/*methods that change the text*/
	public void allLettersToUpperCase() { 
		this.text = this.text.toUpperCase();
	}
	public void findSubTextAndDelete(String s) { 
		this.text = this.text.replace(s, "");
	}	
}