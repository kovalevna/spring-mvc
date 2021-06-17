package web.model;

public class Car {
    public Car(String name, String colour, int mileage) {
        this.name = name;
        this.colour = colour;
        this.mileage = mileage;
    }
    private final String name;
    private final String colour;
    private final int mileage;

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getMileage() {
        return mileage;
    }
    @Override
    public String toString() {
        return name + " " + colour + " " + mileage;
    }
}
