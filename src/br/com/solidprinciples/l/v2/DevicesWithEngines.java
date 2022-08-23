package br.com.solidprinciples.l.v2;

public class DevicesWithEngines  extends TrasportationDevice {

	Engine engine;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	void startEngine() {}
}
