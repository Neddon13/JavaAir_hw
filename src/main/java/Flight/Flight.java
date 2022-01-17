package Flight;

import Person.Passenger;
import Person.Staff.CabinCrew;
import Person.Staff.Pilot;
import Plane.Plane;

import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrews;
    private Passenger[] passengers;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight(ArrayList<Pilot> pilots,
                  ArrayList<CabinCrew> cabinCrews,
                  Plane plane,
                  String flightNum,
                  String destination,
                  String departureAirport,
                  Date departureTime) {
        this.pilots = pilots;
        this.cabinCrews = cabinCrews;
        this.passengers = new Passenger[plane.getCapacity()];
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrew> cabinCrews, Passenger[] passengers, Plane plane, String flightNum, String destination, String departureAirport, Date departureTime) {
        this.pilots = pilots;
        this.cabinCrews = cabinCrews;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getNumOfPilots() {
        return this.pilots.size();
    }

    public int getNumOfCabinCrew() {
        return this.cabinCrews.size();
    }
}
