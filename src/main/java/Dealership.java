import vehicle_management.vehicle_types.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> stock;

    public Dealership(double till, ArrayList<Vehicle> stock) {
        this.till = till;
        this.stock = new ArrayList<>();
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

    public int stockCount() {
        return stock.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.stock.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.stock.remove(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        if(till >= vehicle.getPrice()){
            this.stock.add(vehicle);
            till -= vehicle.getPrice();
        }
    }

    public void sellVehicle(Vehicle vehicle, Customer customer) {
        if(customer.getMoney() >= vehicle.getPrice()){
            customer.setMoney(customer.getMoney() - vehicle.getPrice());
            customer.addVehicle(vehicle);
            removeVehicle(vehicle);
            this.till += vehicle.getPrice();
        }

    }

    public void repairVehicle(Vehicle vehicle, Double repairCost) {
        this.till -= repairCost;
        double currentValue = vehicle.getPrice();
        double increase = repairCost;
        double newValue = currentValue + increase;
        vehicle.setPrice(newValue);
    }
}
