package br.com.solidprinciples.i.v2;

public class ToyHouse implements Toy {
	
	private double price;
    
	private String color;
    
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void setColor(String color) {
        this.color=color;
    }
    @Override
    public String toString(){
        return "ToyHouse: Toy house- Price: "+price+" Color: "+color;
    }
}    