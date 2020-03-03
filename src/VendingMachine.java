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

    /**
     * Creates an empty Vending Machine
     */
    public VendingMachine(){
        this.bank = 0.0;
        this.stock = new ArrayList<>();
    }

}
