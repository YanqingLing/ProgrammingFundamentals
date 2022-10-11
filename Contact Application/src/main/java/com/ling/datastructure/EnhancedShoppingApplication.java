package com.ling.datastructure;

import java.util.*;

public class EnhancedShoppingApplication {


    ArrayList<Double> prices = new ArrayList<Double>();
    Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String decision = null;

        ArrayList<String> products = new ArrayList<>();
        products.add("EDU,Education Prime Set,384.95,10");
        products.add("CHRI,Christmas Tree,44.99,7");
        products.add("FREI,Freight Train,199.99,6");
        products.add("STUN,Stunt Arena,159.99,3");
        products.add("HAND,Material Handler,149.99,2");
        products.add("CAST,Castle Expansion Set,129.99,7");


        EnhancedShoppingApplication methods = new EnhancedShoppingApplication();
        HashMap<String, String> productDescription = methods.productDescriptionMap(products);
        HashMap<String, Double> productPrices = methods.productPricesMap(products);
        HashMap<String, Integer> productInventory = methods.inventoryMap(products);
        ArrayList<Double> prices = new ArrayList<Double>();



        //print out available toys
        System.out.println("Available toys " + productDescription.keySet());

      do {
            System.out.println("Please make your choice by typing in the toy's name: ");
            String selection = userInput.nextLine();
            if(productInventory.containsKey(selection) && productInventory.get(selection) >= 1) {
                prices.add(productPrices.get(selection));

            } else {

                System.out.println("Item is not available.");
            }

            Integer inventory = productInventory.get(selection);
            productInventory.put(selection, inventory - 1);
            System.out.println("Do you want to continue shopping? Please enter Yes or No");
            decision = userInput.nextLine();


       }  while(!decision.equalsIgnoreCase("No"));

        double sum = 0;
        for(Double price : prices) {
            sum = sum + price;
        }
        System.out.println("Your final bill is: " + sum);



    }

    public HashMap<String, String> productDescriptionMap (ArrayList<String> products) {
        HashMap<String, String> productDescription = new HashMap<>();
        for(String product : products) {
            String[] words = product.split(",");
            productDescription.put(words[0],words[1]);

        }
        return productDescription;
    }

    public HashMap<String, Double> productPricesMap (ArrayList<String> products) {
        HashMap<String, Double> productPrices = new HashMap<>();
        for (String product : products) {
            String[] words = product.split(",");
            productPrices.put(words[0], Double.valueOf(words[2]));
        }
        return productPrices;
    }

    public HashMap<String, Integer> inventoryMap (ArrayList<String> products) {
        HashMap<String, Integer> productInventory = new HashMap<>();
        for (String product : products) {
            String[] words = product.split(",");
            productInventory.put(words[0], Integer.valueOf(words[3]));
        }
        return productInventory;

    }








    







}









