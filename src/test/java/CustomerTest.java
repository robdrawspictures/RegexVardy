import org.junit.Before;
import org.junit.Test;
import vehicle_management.parts.Battery;
import vehicle_management.parts.Engine;
import vehicle_management.parts.Tyre;
import vehicle_management.vehicle_types.Electric;
import vehicle_management.vehicle_types.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Vehicle vehicle;
    private Engine engine;
    private Battery battery;
    private ArrayList<Vehicle> garage;


    @Before
    public void before(){
        vehicle = new Electric("Model X", "Tesla", "Red", 4, engine, Tyre.MICHELIN, 300000.0, 5, battery);
        customer = new Customer(600000.0, garage);
    }

    @Test
    public void canGetCollectionSize(){
        assertEquals(0, customer.getGarageSize());
    }

    @Test
    public void canAddToCollection(){
        customer.addVehicle(vehicle);
        assertEquals(1, customer.getGarageSize());
    }

    @Test
    public void canBuyVehicle(){
        customer.buyVehicle(vehicle);
        assertEquals(1, customer.getGarageSize());
        assertEquals(300000.0, customer.getMoney(), 0.01);
    }
}
