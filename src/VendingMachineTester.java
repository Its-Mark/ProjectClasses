/**
 * Project Classes
 * @author Mark Garcia 018019103
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
 */
import java.util.Scanner;
import java.util.ArrayList;

public class VendingMachineTester {
    public static void main(String[] args){
        VendingMachine vm = new VendingMachine();
        ArrayList<Coin> availableCoins = new ArrayList<>();
        availableCoins.add(new Coin("Nickel",0.05));
        availableCoins.add(new Coin("Dime",0.10));
        availableCoins.add(new Coin("Quarter",0.25));
        availableCoins.add(new Coin("Dollar",1.0));
        Scanner in = new Scanner(System.in); //menu choice
        Scanner cin = new Scanner(System.in); //coin choice
        Scanner pin = new Scanner(System.in); //product choice
        Scanner ain = new Scanner(System.in); //amount-to-add choice
        boolean stillThere = true;
        String choice;
        int coinChoice;
        int prodChoice;
        int amChoice;
        while(stillThere){
            System.out.println("1. Show Products \n2. Insert Coin \n3. Add Product \n4. Buy Item \n5. Show Money Inserted \n6. Quit");
            choice = in.nextLine();
            if(choice.equals("1")){
                System.out.println(vm);
                //end of choice 1
            } else if(choice.equals("2")){
                String coins = "";
                for(int i = 0; i < availableCoins.size(); i++){ //for loop to display all the available coins and giving them a number to choose
                    coins += i+1 + ": " + availableCoins.get(i).toString() + "\n";
                }
                System.out.println(coins);
                coinChoice = cin.nextInt();
                if(coinChoice == 1){
                    vm.addCustomerMoney(availableCoins.get(0));
                } else if (coinChoice == 2){
                    vm.addCustomerMoney(availableCoins.get(1));
                } else if (coinChoice == 3){
                    vm.addCustomerMoney(availableCoins.get(2));
                } else if (coinChoice == 4){
                    vm.addCustomerMoney(availableCoins.get(3));
                } else {
                    System.out.println("Invalid coin entry.");
                }
                //end of choice 2
            } else if(choice.equals("3")){
                prodChoice = in.nextInt();
                System.out.println("Enter amount to add:");
                amChoice = in.nextInt();
                vm.increaseStock(prodChoice,amChoice);
                //end of choice 3
            } else if(choice.equals("4")){
                prodChoice = in.nextInt();
                vm.sellItem(prodChoice);
                //end of choice 4
            } else if(choice.equals("5")) {
                System.out.println(vm.getCustomerMoney());
                //end of choice 5
            } else if(choice.equals("6")){
                stillThere = false;
                //breaks while loop end of choice 6
            }
        }
    }
}
