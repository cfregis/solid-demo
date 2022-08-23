package br.com.solidprinciples.l.v1;

public class TrasportationDevice {
	
	String name;
	double speed;

	Engine engine;

	void startEngine() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}


}
