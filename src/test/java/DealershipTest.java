import org.junit.Before;
import org.junit.Test;
import vehicle_management.parts.Battery;
import vehicle_management.parts.Engine;
import vehicle_management.parts.Tyre;
import vehicle_management.vehicle_types.Electric;
import vehicle_management.vehicle_types.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Customer customer;
    private Dealership dealership;
    private Vehicle vehicle;
    private Vehicle vehicle2;
    private Engine engine;
    private Battery battery;
    private ArrayList<Vehicle> stock;
    private ArrayList<Vehicle> garage;


    @Before
    public void before(){
        vehicle = new Electric("Model X", "Tesla", "Red", 4, engine, Tyre.MICHELIN, 300000.0, 5, battery);
        vehicle2 = new Electric("Model S", "Tesla", "Green", 4, engine, Tyre.DUNLOP, 100000.0, 7, battery);
        dealership = new Dealership(600000.0, stock);
        customer = new Customer(600000.0, garage);
    }

    @Test
    public void canGetStockCount(){
        assertEquals(0, dealership.stockCount());
    }

    @Test
    public void canAddVehicle(){
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.stockCount());
    }

    @Test
    public void canBuyVehicle(){
        dealership.buyVehicle(vehicle);
        assertEquals(1, dealership.stockCount());
        assertEquals(300000.0, dealership.getTill(), 0.01);
    }

    @Test
    public void canSellToCustomer(){
        dealership.addVehicle(vehicle2);
        dealership.addVehicle(vehicle);
        dealership.sellVehicle(vehicle, customer);
        assertEquals(1, dealership.stockCount());
        assertEquals(900000, dealership.getTill(), 0.01);
    }

    @Test
    public void canRepairVehicle(){
        vehicle.deductDamage();
        assertEquals(285000.0, vehicle.getPrice(), 0.01);
        dealership.repairVehicle(vehicle, 10000.0);
        assertEquals(295000.0, vehicle.getPrice(), 0.01);
    }
}
