package Person;

public class Passenger extends Person {

    private int numOfBags;

    public Passenger(String name, int _numOfBags) {
        super(name);
        this.numOfBags = _numOfBags;
    }

    public int getNumOfBags() {
        return numOfBags;
    }
}
