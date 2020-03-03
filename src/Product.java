/**
 * Project Classes
 * @author Mark Garcia 018019103
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
 */
public class Product {
    private String name;
    private double cost;
    private int quantity;

    public Product(String n, double c, int q){
        this.name = n;
        this.cost = c;
        this.quantity = q;
    }

    /**
     * Get name of product
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get cost of product
     * @return cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * Get quantity of product
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Increase quantity of product
     * @param i value to be added
     */
    public void increaseQuantity(int i){
        quantity += i;
    }

    @Override
    public String toString(){
        return this.name + " @ $" + this.cost + "\nQuantity: " + this.quantity;
    }
}
