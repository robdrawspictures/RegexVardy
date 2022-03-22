package vehicle_management.vehicle_types;

import vehicle_management.parts.Engine;
import vehicle_management.parts.Tyre;

abstract public class Vehicle {

    private String model;
    private String make;
    private String colour;
    private int doors;
    private Engine engine;
    private Tyre tyre;
    private double price;
    private double damage;

    public Vehicle(String model, String make, String colour, int doors, Engine engine, Tyre tyre, double price, double damage) {
        this.model = model;
        this.make = make;
        this.colour = colour;
        this.doors = doors;
        this.engine = engine;
        this.tyre = tyre;
        this.price = price;
        this.damage = damage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void deductDamage(){
        double discount = (damage / 100) * price;
        double newPrice = price - discount;
        setPrice(newPrice);
    }
}
