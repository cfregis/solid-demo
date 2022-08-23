package br.com.solidprinciples.i.v2;

public class ISPMain2 {

	public static void main(String[] args) {
		Toy toyHouse=ToyBuilder.buildToyHouse();
		System.out.println(toyHouse);

		Toy toyCar=ToyBuilder.buildToyCar();;
		System.out.println(toyCar);
		
		Toy toyPlane=ToyBuilder.buildToyPlane();
		System.out.println(toyPlane);
	}

}
