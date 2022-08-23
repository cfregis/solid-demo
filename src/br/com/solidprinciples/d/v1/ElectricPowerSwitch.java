package br.com.solidprinciples.d.v1;

public class ElectricPowerSwitch {
    private LightBulb lightBulb;
    private boolean on;
    
    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }
    
    public boolean isOn() {
        return this.on;
    }
    
    public void press(){
        boolean checkOn = isOn();
        if (checkOn) {
            lightBulb.turnOff();
            this.on = false;
        } else {
            lightBulb.turnOn();
            this.on = true;
        }
    }
}
