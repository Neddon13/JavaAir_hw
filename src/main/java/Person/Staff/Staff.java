package Person.Staff;

import Person.Person;

public abstract class Staff extends Person {

    private Rank rank;

    public Staff(String name, Rank _rank) {
        super(name);
        this.rank = _rank;
    }

    public Rank getRank() {
        return rank;
    }
}
