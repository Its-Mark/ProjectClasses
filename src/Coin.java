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
    
    public Coin(){
        this.type = "";
        this.value = -1;
    }
    public Coin(String t, double v) {
    	this.type = t;
    	this.value = v;
    }
    
    public double getValue() {
    	return value;
    }
    
    public String getType() {
    	return type;
    }
    
    public String toString() {
    	return getType() + " @ " + getValue();
    }

}
