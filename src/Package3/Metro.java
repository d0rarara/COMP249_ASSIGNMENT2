package Package3;

import Package2.Train;

/**
 * This class represents a metro
 * 
 * @author  Dorcas
 */
public class Metro extends Train {
    private int totStops;

    /**
     * Default constructor for objects of class Metro
     */
    public Metro() {
        super();
        totStops = 0;
    }

    /**
     * Constructor for objects of class Metro
     * 
     * @param numWheels The number of wheels on the metro
     * @param maxSpeed The maximum speed of the metro
     * @param numVehicles The number of vehicles on the metro
     * @param startStation The station where the metro starts
     * @param endStation The station where the metro ends
     * @param totStops The total number of stops the metro makes
     */
    public Metro(int numWheels, double maxSpeed, int numVehicles, String startStation, String endStation, int totStops) {
        super(numWheels, maxSpeed, numVehicles, startStation, endStation);
        this.totStops = totStops;
    }

    /**
     * Copy constructor for objects of class Metro
     * 
     * @param other The object to be copied
     */
    public Metro(Metro other) {
        super(other);
        totStops = other.totStops;
    }

    /**
     * Sets the total number of stops the metro makes
     * 
     * @param newTotStops The new total number of stops the metro makes
     */
    public void setTotStops(int newTotStops) {
        totStops = newTotStops;
    }

    /**
     * Gets the total number of stops the metro makes
     * 
     * @return The total number of stops the metro makes
     */
    public int getTotStops() {
        return totStops;
    }

    /**
     * Gets the number of stops the metro makes per vehicle
     * 
     * @return The number of stops the metro makes per vehicle
     */
    public String toString() {
        return "This metro has " + getNumWheels() + " wheels, a maximum speed of " + getMaxSpeed() + " km/h, " + getNumVehicles() + " vehicles, travels from " + getStartStation() + " to " + getEndStation() + ", and has " + totStops + " stops.";
    }

    /**
     * Returns a string representation of the object
     * 
     * @return A string representation of the object
     */
    public boolean equals(Object o) {
        if(o==null || !(o instanceof Metro)){
            return false;
        } else {
            Metro other = (Metro) o;
            return super.equals(other) && totStops == other.totStops;
        }
    }
}
