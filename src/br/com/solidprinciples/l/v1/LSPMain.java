package br.com.solidprinciples.l.v1;

public class LSPMain {

	public static void main(String[] args) {
		TrasportationDevice b =  new Bicycle();
		b.setName("bike");
		TrasportationDevice c =  new Car();
		c.setName("car");
		System.out.println(b.getName());
		System.out.println(b.getSpeed());
		
		System.out.println(c.getName());
		System.out.println(c.getSpeed());
	}
}
