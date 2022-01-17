package Plane;

public class Plane {

    PlaneType planeType;
    private int capacity;

    public Plane(PlaneType planeType, int capacity) {
        this.planeType = planeType;
        this.capacity = capacity;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
