// Dorcas Kumbu Buthidi 40224424
// COMP249
// Assignment 2
// Part 1
// Due Date: March 4, 2023 

package Part1.Package5;

/**
 * The Aircraft class represents an aircraft
 * 
 * @author  Dorcas
 */
public class Aircraft {
    private double price;
    private double maxElev;

    /**
     * Default constructor for objects of class Aircraft
     * 
     */
    public Aircraft() {
        price = 0.0;
        maxElev = 0.0;
    }

    /**
     * Constructor for objects of class Aircraft
     * 
     * @param price The price of the aircraft
     * @param maxElev The maximum elevation of the aircraft
     */
    public Aircraft(double price, double maxElev) {
        this.price = price;
        this.maxElev = maxElev;
    }

    /**
     * Copy constructor for objects of class Aircraft
     * 
     * @param other The object to be copied
     */
    public Aircraft(Aircraft other) {
        price = other.price;
        maxElev = other.maxElev;
    }

    /**
     * Sets the price of the aircraft
     * 
     * @param newPrice The new price of the aircraft
     */
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    /**
     * Gets the price of the aircraft
     * 
     * @return The price of the aircraft
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the maximum elevation of the aircraft
     * 
     * @param newMaxElev The new maximum elevation of the aircraft
     */
    public void setMaxElev(double newMaxElev) {
        maxElev = newMaxElev;
    }

    /**
     * Gets the maximum elevation of the aircraft
     * 
     * @return The maximum elevation of the aircraft
     */
    public double getMaxElev() {
        return maxElev;
    }

    /**
     * Returns a string representation of the object
     * 
     * @return A string representation of the object
     */
    public String toString() {
        if(price == 0){
            return "\nSince no aircraft has been selected, the price and the maximum elevation are set to 0.";
        }
        return "\nThis aircraft costs $" + price + " and has a maximum elevation of " + maxElev + " m.";
    }

    /**
     * Returns true if the objects are equal
     * 
     * @param o The object to be compared
     * @return True if the objects are equal
     */
    public boolean equals(Object o) {
        if(o==null || !(o instanceof Aircraft)){
            return false;
        } else {
            Aircraft other = (Aircraft) o;
            return price == other.price && maxElev == other.maxElev;
        }
    }
}
