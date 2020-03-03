/**
 * Project Classes
 * @author Mark Garcia 018019103
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
 */
import java.util.ArrayList;

public class VendingMachine{
    private double bank;
    private ArrayList<Product> stock;
    private final int MAX_STOCK = 15;

    /**
     * Creates an empty Vending Machine
     */
    public VendingMachine(){
        this.bank = 0.0;
        this.stock = new ArrayList<>();
    }

    /**
     * Adds a product to the vending machine
     * @param p = product to be added
     */
    public void addProduct(Product p){
        stock.add(p);
    }

    /**
     * increasing inventory of product in vending machine
     * @param i = index of product in array list
     * @param a = amount to be added
     */
    public void increaseStock(int i, int a){
        stock.get(i).increaseQuantity(a);
    }
}
