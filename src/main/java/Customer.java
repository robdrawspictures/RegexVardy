import vehicle_management.vehicle_types.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> garage;

    public Customer(double money, ArrayList<Vehicle> garage) {
        this.money = money;
        this.garage = garage;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getGarage() {
        return garage;
    }

    public void setGarage(ArrayList<Vehicle> garage) {
        this.garage = garage;
    }
}
