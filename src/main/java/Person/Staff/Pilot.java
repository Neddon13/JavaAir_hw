package Person.Staff;

public class Pilot extends Staff {

    private String pilotLicence;

    public Pilot(String name, Rank _rank, String pilotLicence) {
        super(name, _rank);
        this.pilotLicence = pilotLicence;
    }

    public String getPilotLicence() {
        return pilotLicence;
    }
}
