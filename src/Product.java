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

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int i){
        quantity += i;
    }

    @Override
    public String toString(){
        return "";
    }
}
