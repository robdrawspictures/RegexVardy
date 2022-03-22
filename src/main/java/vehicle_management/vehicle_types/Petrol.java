package vehicle_management.vehicle_types;

import vehicle_management.behaviours.IStart;
import vehicle_management.parts.Engine;
import vehicle_management.parts.FuelTank;
import vehicle_management.parts.Tyre;

public class Petrol extends Vehicle implements IStart {

    private FuelTank fuelTank;

    public Petrol(String model, String make, String colour, int doors, Engine engine, Tyre tyre, double price, FuelTank fuelTank) {
        super(model, make, colour, doors, engine, tyre, price);
        this.fuelTank = fuelTank;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public String startEngine(){
        return "Vroom vroom.";
    }
}
