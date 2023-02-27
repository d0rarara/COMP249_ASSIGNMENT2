package Part1.Package4;

import Part1.Package1.WheeledTransportation;

/**
 * This class represents a monowheel
 * 
 * @author  Dorcas
 */
public class Monowheel extends WheeledTransportation {
    private double maxWeight;

    /**
     * Default constructor for objects of class Monowheel
     * 
     */
    public Monowheel() {
        super();
        maxWeight = 0.0;
    }

    /**
     * Constructor for objects of class Monowheel
     * 
     * @param numWheels The number of wheels on the monowheel
     * @param maxSpeed The maximum speed of the monowheel
     * @param maxWeight The maximum weight the monowheel can carry
     */
    public Monowheel(int numWheels, double maxSpeed, double maxWeight) {
        super(numWheels, maxSpeed);
        this.maxWeight = maxWeight;
    }

    /**
     * Copy constructor for objects of class Monowheel
     * 
     * @param other The object to be copied
     */
    public Monowheel(Monowheel other) {
        super(other);
        maxWeight = other.maxWeight;
    }

    /**
     * Sets the maximum weight the monowheel can carry
     * 
     * @param newMaxWeight The new maximum weight the monowheel can carry
     */
    public void setMaxWeight(double newMaxWeight) {
        maxWeight = newMaxWeight;
    }

    /**
     * Gets the maximum weight the monowheel can carry
     * 
     * @return The maximum weight the monowheel can carry
     */
    public double getMaxWeight() {
        return maxWeight;
    }

    /**
     * Returns a string representation of the object
     * 
     * @return A string representation of the object
     */
    public String toString() {
        return "This monowheel has " + getNumWheels() + " wheels, a maximum speed of " + getMaxSpeed() + " km/h, and a maximum weight of " + maxWeight + " kg.";
    }

    /**
     * Determines whether or not two objects are equal
     * 
     * @param o The object to be compared
     * @return True if the objects are equal, false otherwise
     */
    public boolean equals(Object o) {
        if(o==null || !(o instanceof Monowheel)){
            return false;
        } else {
            Monowheel other = (Monowheel) o;
            return getNumWheels() == other.getNumWheels() && getMaxSpeed() == other.getMaxSpeed() && maxWeight == other.maxWeight;
        }
    }
    
}
