// Dorcas Kumbu Buthidi 40224424
// COMP249
// Assignment 2
// Part 1
// Due Date: March 4, 2023 

package Part1.Package1;

/**
 * This class represents wheeled transportation
 * 
 * @author  Dorcas
 */
public class WheeledTransportation {
    protected int numWheels;
    protected double maxSpeed;

    /**
     * Default constructor for objects of class WheeledTransportation
     * 
     */
    public WheeledTransportation(){
        numWheels = 0;
        maxSpeed = 0.0;
    }

    /**
     * Constructor for objects of class WheeledTransportation
     * 
     * @param numWheels The number of wheels on the wheeled transportation
     * @param maxSpeed The maximum speed of the wheeled transportation
     */
    public WheeledTransportation(int numWheels, double maxSpeed) {
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Copy constructor for objects of class WheeledTransportation
     * 
     * @param other The object to be copied
     */
    public WheeledTransportation(WheeledTransportation other) {
        numWheels = other.numWheels;
        maxSpeed = other.maxSpeed;
    }

    /**
     * Sets the number of wheels on the wheeled transportation
     * 
     * @param newNumWheels The new number of wheels on the wheeled transportation
     */
    public void setNumWheels(int newNumWheels) {
        numWheels = newNumWheels;
    }

    /**
     * Gets the number of wheels on the wheeled transportation
     * 
     * @return The number of wheels on the wheeled transportation
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * Sets the maximum speed of the wheeled transportation
     * 
     * @param newMaxSpeed The new maximum speed of the wheeled transportation
     */
    public void setMaxSpeed(double newMaxSpeed) {
        maxSpeed = newMaxSpeed;
    }

    /**
     * Gets the maximum speed of the wheeled transportation
     * 
     * @return The maximum speed of the wheeled transportation
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Returns a string representation of the object
     * 
     * @return A string representation of the object
     */
    public String toString() {
        if(numWheels == 0 || maxSpeed == 0){
            return "\nSince no wheeled transportation has been selected, the number of wheels and the maximum speed have been \nset to " + numWheels + " and " + maxSpeed + ".";
        }
        return "\nThis wheeled transportation has " + numWheels + " wheels and a maximum speed of " + maxSpeed + " km/h.";
    }

    /**
     * Returns true if the objects are equal, false otherwise
     * 
     * @param o The object to be compared
     * @return True if the objects are equal, false otherwise
     */
    public boolean equals(Object o) {
        if(o==null || !(o instanceof WheeledTransportation)){
            return false;
        } else {
            WheeledTransportation other = (WheeledTransportation) o;
            return numWheels == other.numWheels && maxSpeed == other.maxSpeed;
        }
    }
}
