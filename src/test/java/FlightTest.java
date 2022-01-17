import Flight.Flight;
import Person.Passenger;
import Person.Staff.CabinCrew;
import Person.Staff.Pilot;
import Person.Staff.Rank;
import Plane.Plane;
import Plane.PlaneType;
import com.sun.org.apache.xml.internal.resolver.readers.OASISXMLCatalogReader;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;

public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before(){
        pilot1 = new Pilot("Chris", Rank.CAPTAIN, "CJS9932");
        pilot2 = new Pilot("Hannah", Rank.FIRST_OFFICER, "HSS6765");
        cabinCrew1 = new CabinCrew("Jess", Rank.FLIGHT_ATTENDANT);
        cabinCrew2 = new CabinCrew("Adam", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Bob", 3);
        passenger2 = new Passenger("Josh", 1);
        passenger3 = new Passenger("Joan", 2);
        passenger4 = new Passenger("Tom", 2);
        Plane plane = new Plane(PlaneType.BOEING747, 279);
        flight = new Flight(plane, "NS7654", "Rhodes", "EDI", new Date(2022, 05, 02));
    }

    @Test
    public void hasAtLeastOnePilot(){
        assertTrue(flight.getNumOfPilots() >= 1);
    }

    @Test
    public void hasCabinCrewMembers() {
        assertEquals(2, flight.getNumOfCabinCrew());
    }

    @Test
    public void hasEmptyListOfPassengers(){
        assertEquals(0, flight.getNumOfPassengers());
    }


}
