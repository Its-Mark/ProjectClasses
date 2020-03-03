/**
 * Project Classes
 * @author Mark Garcia 018019103
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
 */
public class Coin {
    private String type;
    private int value;
    
    public Coin(){
        this.type = "";
        this.value = -1;
    }
    public Coin(String t, int v) {
    	this.type = t;
    	this.value = v;
    }
    
    public int getValue() {
    	return value;
    }
    
    public String getType() {
        String coinType = "";
        if(value == 1){coinType = "Penny";}
        else if (value == 5) {coinType = "Nickel";}
        else if (value == 10) {coinType = "Dime";}
        else if (value == 25) {coinType = "Quarter";}
        return coinType;
    }
    
    public String toString() {
        StringBuffer coin = new StringBuffer();
        if(type == "Penny"){ coin.append("Penny");}
        else if (type == "Nickel"){ coin.append("Nickel");}
        else if (type == "Dime"){coin.append("Dime");}
        else if (type == "Quarter"){coin.append("Quarter");}
        else {coin.append(type);}
        coin.append(" @ ");
        if(value == 1){coin.append("0.01");}
        else if (value == 5) {coin.append("0.05");}
        else if (value == 10) {coin.append("0.10");}
        else if (value == 25) {coin.append("0.25");}

        return coin.toString();
    }

}
