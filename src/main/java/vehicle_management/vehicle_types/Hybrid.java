package vehicle_management.vehicle_types;

import vehicle_management.behaviours.IStart;
import vehicle_management.parts.Battery;
import vehicle_management.parts.Engine;
import vehicle_management.parts.FuelTank;
import vehicle_management.parts.Tyre;

public class Hybrid extends Vehicle implements IStart {

    private Battery battery;
    private FuelTank fuelTank;

    public Hybrid(String model, String make, String colour, int doors, Engine engine, Tyre tyre, double price, Battery battery, FuelTank fuelTank) {
        super(model, make, colour, doors, engine, tyre, price);
        this.battery = battery;
        this.fuelTank = fuelTank;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String startEngine(){
        return "Vroom bzzt.";
    }
}
