import Plane.Plane;
import org.junit.Before;
import org.junit.Test;
import Plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747, 279);
    }

    @Test
    public void hasType(){
        assertEquals(PlaneType.BOEING747,  plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(279, plane.getCapacity());
    }
}
