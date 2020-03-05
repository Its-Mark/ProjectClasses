/**
 * Project Classes
 * @author Mark Garcia 018019103
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
 */

public class Coin {
    private String type;
    private double value;

    /**
     * default coin constructor
     */
    public Coin(){
        this.type = "";
        this.value = -1;
    }

    /**
     * Parameterized coin constructor
     * @param t = type of coin in form of a string
     * @param v = value of coin in form of a double
     */
    public Coin(String t, double v) {
    	this.type = t;
    	this.value = v;
    }

    /**
     * gives the coins value
     * @return the value of the coin in cents
     */
    public double getValue() {
    	return value;
    }

    /**
     * gives the type of coin
     * @return the type of coin
     */
    public String getType() {
    	return type;
    }

    @Override
    public String toString() {
    	return getType() + " @ " + getValue();
    }

}
