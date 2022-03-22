package vehicle_management.vehicle_types;

import vehicle_management.behaviours.IStart;
import vehicle_management.parts.Battery;
import vehicle_management.parts.Engine;
import vehicle_management.parts.Tyre;

public class Electric extends Vehicle implements IStart {

    private Battery battery;

    public Electric(String model, String make, String colour, int doors, Engine engine, Tyre tyre, double price, Battery battery) {
        super(model, make, colour, doors, engine, tyre, price);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public String startEngine(){
        return "Bzzt bzzt.";
    }
}
