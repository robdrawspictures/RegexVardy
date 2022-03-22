import org.junit.Before;
import org.junit.Test;
import vehicle_management.parts.Battery;
import vehicle_management.parts.Engine;
import vehicle_management.parts.Tyre;
import vehicle_management.vehicle_types.Electric;
import vehicle_management.vehicle_types.Vehicle;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private Vehicle vehicle1;
    private Vehicle vehicle2;
    private Engine engine;
    private Battery battery;


    @Before
    public void before(){
        vehicle1 = new Electric("Model X", "Tesla", "Red", 4, engine, Tyre.MICHELIN, 300000.0, 5, battery);
        vehicle2 = new Electric("Model S", "Tesla", "Green", 4, engine, Tyre.DUNLOP, 100000.0, 7, battery);
    }

    @Test
    public void canDiscount(){
        vehicle1.deductDamage();
        assertEquals(285000, vehicle1.getPrice(), 0.01);
    }
}
