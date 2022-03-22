import vehicle_management.vehicle_types.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> garage;

    public Customer(double money, ArrayList<Vehicle> garage) {
        this.money = money;
        this.garage = new ArrayList<>();
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

    public int getGarageSize() {
        return this.garage.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.garage.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        if(money >= vehicle.getPrice()){
            this.garage.add(vehicle);
            money -= vehicle.getPrice();
        }
    }
}
