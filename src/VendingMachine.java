/**
 * Project Classes
 * @author Mark Garcia 018019103
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
 */
import java.util.ArrayList;

public class VendingMachine{
    private ArrayList<Coin> customerMoney;
    private ArrayList<Coin> bank;
    private ArrayList<Product> stock;

    /**
     * Creates Vending machine with Cookies, Crackers, Candy, Water, and Juice; 10 of each
     */
    public VendingMachine(){
        this.customerMoney = new ArrayList<>();
        this.bank = new ArrayList<>();
        this.stock = new ArrayList<>();
        stock.add(new Product("Cookie", .50, 10));
        stock.add(new Product("Crackers", .25, 10));
        stock.add(new Product("Candy", .45, 10));
        stock.add(new Product("Water", 1.0, 10));
        stock.add(new Product("Juice", 1.5, 10));
    }

    /**
     * Customer chooses to add a certain coin.
     * This will be read by user in the tester class
     * @param c = coin to be added
     */
    public void addCustomerMoney(Coin c){
        customerMoney.add(c);
    }

    /**
     * Adds up the value of every coin in the bank array list
     * @return total money in the bank of vending machine
     */
    public double getBankMoney(){
        double total = 0.0;
        for(Coin c : bank){
            total += c.getValue();
        }
        return total;
    }

    /**
     * Adds up the value of every coin in the customerMoney array list
     * @return total money in the bank of the customer
     */
    public double getCustomerMoney(){
        double total = 0.0;
        for(Coin c : customerMoney){
            total += c.getValue();
        }
        return total;
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

    /**
     * Checks to see if item is in the inventory of the vending machine.
     * If item quantity is greater than 0 then it is sold.
     * If item quantity is equal to 0 then the money is returned.
     * @param i = index of product in array list
     */
    public void sellItem(int i){
        Product p = stock.get(i);
        if(p.getQuantity() > 0) {
            if(getCustomerMoney() > p.getCost()) {
                p.decreaseQuantity(1);
                for (Coin c : customerMoney) {
                    bank.add(c);
                }
                customerMoney = new ArrayList<>();
                System.out.println("1 " + p.getName() + " was bought.");
            } else {
                System.out.println("Insufficient Funds...");
            }
        } else {
            System.out.println(stock.get(i).getName() + " is out of stock...");
        }
    }

    /**
     * Creates a string containing all the products in the machine.
     * @return s = a string combined of every product in the vending machine.
     */
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < stock.size(); i++){
            s += "Number: " + i + "\n" + stock.get(i).toString() + "\n";
        }
        return s;
    }
}
