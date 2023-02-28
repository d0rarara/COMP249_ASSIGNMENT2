// Dorcas Kumbu Buthidi 40224424
// COMP249
// Assignment 2
// Part 1
// Due Date: March 4, 2023 

package Part1.Package2;

import Part1.Package1.WheeledTransportation;

/**
 * This class represents a train
 * 
 * @author  Dorcas
 */
public class Train extends WheeledTransportation {
    protected int numVehicles;
    protected String startStation;
    protected String endStation;

    /**
     * Default constructor for objects of class Train
     * 
     */
    public Train() {
        super();
        numVehicles = 0;
        startStation = "";
        endStation = "";
    }

    /**
     * Constructor for objects of class Train
     * 
     * @param numWheels The number of wheels on the train
     * @param maxSpeed The maximum speed of the train
     * @param numVehicles The number of vehicles on the train
     * @param startStation The station where the train starts
     * @param endStation The station where the train ends
     */
    public Train(int numWheels, double maxSpeed, int numVehicles, String startStation, String endStation) {
        super(numWheels, maxSpeed);
        this.numVehicles = numVehicles;
        this.startStation = startStation;
        this.endStation = endStation;
    }

    /**
     * Copy constructor for objects of class Train
     * 
     * @param other The object to be copied
     */
    public Train(Train other) {
        super(other);
        numVehicles = other.numVehicles;
        startStation = other.startStation;
        endStation = other.endStation;
    }

    /**
     * Sets the number of vehicles on the train
     * 
     * @param newNumVehicles The new number of vehicles on the train
     */
    public void setNumVehicles(int newNumVehicles) {
        numVehicles = newNumVehicles;
    }

    /**
     * Gets the number of vehicles on the train
     * 
     * @return The number of vehicles on the train
     */
    public int getNumVehicles() {
        return numVehicles;
    }

    /**
     * Sets the station where the train starts
     * 
     * @param newStartStation The new station where the train starts
     */
    public void setStartStation(String newStartStation) {
        startStation = newStartStation;
    }

    /**
     * Gets the station where the train starts
     * 
     * @return The station where the train starts
     */
    public String getStartStation() {
        return startStation;
    }

    /**
     * Sets the station where the train ends
     * 
     * @param newEndStation The new station where the train ends
     */
    public void setEndStation(String newEndStation) {
        endStation = newEndStation;
    }

    /**
     * Gets the station where the train ends
     * 
     * @return The station where the train ends
     */
    public String getEndStation() {
        return endStation;
    }

    /**
     * Returns a string representation of the train
     * 
     * @return A string representation of the train
     */
    public String toString() {
        if(numVehicles == 0){
            return "\nSince no train has been selected, the number of wheels, the maximum speed, and the number of venhicles \nare set to 0. Travelling does not occur.";
        }
        return "\nThis train has " + numWheels + " wheels, a maximum speed of " + maxSpeed + " km/h, " + numVehicles + " vehicles, and travels from " + startStation + " \nto " + endStation + ".";
    }


    /**
     * Checks if two trains are equal
     * 
     * @param o The object to be compared
     * @return True if the two trains are equal, false otherwise
     */
    public boolean equals(Object o) {
        if(o==null || !(o instanceof Train)){
            return false;
        } else {
            Train other = (Train) o;
            return super.equals(other) && numVehicles == other.numVehicles && startStation.equals(other.startStation) && endStation.equals(other.endStation);
        }
    }

    
}
