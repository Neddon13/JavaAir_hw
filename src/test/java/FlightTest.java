import Flight.Flight;
import Person.Staff.CabinCrew;
import Person.Staff.Pilot;
import Person.Staff.Rank;
import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;

public class FlightTest {

    private Flight flight;

    @Before
    public void before(){
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(new Pilot("Chris", Rank.CAPTAIN, "CJS9932"));
        pilots.add(new Pilot("Hannah", Rank.FIRST_OFFICER, "HSS6765"));
        ArrayList<CabinCrew> cabinCrews = new ArrayList<>();
        cabinCrews.add(new CabinCrew("Diana", Rank.FLIGHT_ATTENDANT));
        cabinCrews.add(new CabinCrew("Tom", Rank.FLIGHT_ATTENDANT));
        Plane plane = new Plane(PlaneType.BOEING747, 279);
        flight = new Flight(pilots, cabinCrews, plane, "NS7654", "Rhodes", "EDI", new Date(2022, 05, 02));
    }

    @Test
    public void hasAtLeastOnePilot(){
        assertTrue(flight.getNumOfPilots() >= 1);
    }

    @Test
    public void hasCabinCrewMembers() {
        assertEquals(2, flight.getNumOfCabinCrew());
    }
}
