package br.com.solidprinciples.i.v1;

public class ToyHouse implements Toy {
    double price;
    String color;
    
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void setColor(String color) {
        this.color=color;
    }
    
    @Override
    public void move(){
    	System.out.println("Moving");
    }
    @Override
    public void fly(){
    	System.out.println("Flying");
    }    
}
