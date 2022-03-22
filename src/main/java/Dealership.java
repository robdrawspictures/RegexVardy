import vehicle_management.vehicle_types.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> stock;

    public Dealership(double till, ArrayList<Vehicle> stock) {
        this.till = till;
        this.stock = stock;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Vehicle> stock) {
        this.stock = stock;
    }
}
