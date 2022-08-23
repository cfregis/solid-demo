package br.com.solidprinciples.d.v1;

public class DIPMain {

	public static void main(String[] args) {
		LightBulb l = new LightBulb();
		
		ElectricPowerSwitch e  =  new ElectricPowerSwitch(l);
		
		System.out.println("ElectricPowerSwitch status: " + e.isOn());		
		System.out.println("ElectricPowerSwitch press ");
		e.press();
		
		System.out.println("ElectricPowerSwitch press ");
		e.press();
		
	}

}
