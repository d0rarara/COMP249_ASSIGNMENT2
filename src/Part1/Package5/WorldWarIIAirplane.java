// Dorcas Kumbu Buthidi 40224424
// COMP249
// Assignment 2
// Part 1
// Due Date: March 4, 2023 

package Part1.Package5;

/**
 * The WorldWarIIAirplane class represents a World War II airplane
 * 
 * @author  Dorcas
 */
public class WorldWarIIAirplane extends Aircraft{
    private boolean twin;

    /**
     * Default constructor for objects of class WorldWarIIAirplane
     * 
     */
    public WorldWarIIAirplane() {
        super();
        twin = false;
    }

    /**
     * Constructor for objects of class WorldWarIIAirplane
     * 
     * @param price The price of the aircraft
     * @param maxElev The maximum elevation of the aircraft
     * @param twin Whether the aircraft is twin-engine or not
     */
    public WorldWarIIAirplane(double price, double maxElev, boolean twin) {
        super(price, maxElev);
        this.twin = twin;
    }

    /**
     * Copy constructor for objects of class WorldWarIIAirplane
     * 
     * @param other The object to be copied
     */
    public WorldWarIIAirplane(WorldWarIIAirplane other) {
        super(other);
        twin = other.twin;
    }

    /**
     * Sets whether the aircraft is twin-engine or not
     * 
     * @param newTwin
     */
    public void setTwin(boolean newTwin) {
        twin = newTwin;
    }

    /**
     * Gets whether the aircraft is twin-engine or not
     * 
     * @return Whether the aircraft is twin-engine or not
     */
    public boolean getTwin() {
        return twin;
    }

    /**
     * Returns a string representation of the object
     * 
     * @return A string representation of the object
     */
    public String toString() {
        if(getPrice() == 0 || getMaxElev() == 0){
            return "\nSince no World War II airplane has been selected, the price and the maximum elevation are set to 0. \nNo info available for engine type.";

        }
        return "\nThis World War II airplane costs $" + getPrice() + ", has a maximum elevation of " + getMaxElev() + " m, and is " + (twin ? "twin-engine" : "single-engine") + ".";
    }

    /**
     * Returns whether the object is equal to another object
     * 
     * @param o The object to be compared
     * @return Whether the object is equal to another object
     */
    public boolean equals(Object o) {
        if(o==null || !(o instanceof WorldWarIIAirplane)){
            return false;
        } else {
            WorldWarIIAirplane other = (WorldWarIIAirplane) o;
            return getPrice() == other.getPrice() && getMaxElev() == other.getMaxElev() && twin == other.twin;
        }
    }
}
