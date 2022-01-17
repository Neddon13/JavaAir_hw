import Person.Staff.Pilot;
import Person.Staff.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Frank", Rank.CAPTAIN, "SULLY9827");
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasPilotLicence(){
        assertEquals("SULLY9827", pilot.getPilotLicence());
    }
}
