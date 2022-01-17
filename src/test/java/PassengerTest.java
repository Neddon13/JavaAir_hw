import Person.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Ross", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Ross", passenger1.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(3, passenger1.getNumOfBags());
    }
}
