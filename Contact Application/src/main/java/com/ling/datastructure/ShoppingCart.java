package com.ling.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        HashMap<String, Double> legoSet = new HashMap<String, Double>();
        ArrayList<Double> prices = new ArrayList<Double>();
        Scanner userInput = new Scanner(System.in);
        String selection;
        String decision;
        legoSet.put("Education Prime Set", 384.95);
        legoSet.put("Christmas Tree", 44.99);
        legoSet.put("Freight Train", 199.99);
        legoSet.put("Stunt Arena", 159.99);
        legoSet.put("Material Handler", 149.99);
        legoSet.put("Castle Expansion Set", 129.99);

        //Present the available lego toys to the user
        System.out.println("Available lego " + legoSet.keySet());
        //Prompt the user to provide their selection one at a time and make sure their selection is available in the store
        do{
            System.out.println("Please make your selection by typing in the lego name: ");
            selection = userInput.nextLine();
            if(legoSet.containsKey(selection)) {
                prices.add(legoSet.get(selection));
            } else {

                System.out.println("Item is not available.");
            }
            legoSet.remove(selection);
            System.out.println("Do you want to continue shopping? Please enter Yes or No");
            decision = userInput.nextLine();

        } while(!decision.equalsIgnoreCase("No"));

        double sum = 0;
        for(Double price : prices) {
            sum = sum + price;
        }
        System.out.println("Your final bill is: " + sum);
    }
        //System.out.println(legoSet.get(selection));
}
