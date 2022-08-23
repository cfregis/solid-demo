package br.com.solidprinciples.i.v1;

public class ISPMain {

	public static void main(String[] args) {
		Toy toyHouse = new ToyHouse();
        toyHouse.setPrice(15.00);
        toyHouse.setColor("green");
        toyHouse.move();
        toyHouse.fly();
        
	}

}
