package com.ling.shoppingCart;

import com.ling.datastructure.EnhancedShoppingApplication;

import java.util.*;


public class ToyShoppingCart {
    Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        ArrayList<String> shoppingCart = new ArrayList<>();


        ArrayList<String> products = new ArrayList<>();
        products.add("EDU,Education Prime Set,384.95,10");
        products.add("CHRI,Christmas Tree,44.99,7");
        products.add("FREI,Freight Train,199.99,6");
        products.add("STUN,Stunt Arena,159.99,3");
        products.add("HAND,Material Handler,149.99,2");
        products.add("CAST,Castle Expansion Set,129.99,7");

        HashMap<String, String> productDescription = new HashMap<>();
        HashMap<String, Double> productPrices = new HashMap<>();
        HashMap<String, Integer> productInventory = new HashMap<>();
        for(String product : products) {
            String[] words = product.split(",");
            String productCode = words[0];
            String description = words[1];
            Double price = Double.valueOf(words[2]);
            Integer inventory = Integer.valueOf(words[3]);
            productDescription.put(productCode,description);
            productPrices.put(productCode, price);
            productInventory.put(productCode, inventory);
        }


        EnhancedShoppingApplication methods = new EnhancedShoppingApplication();
        ArrayList<Double> prices = new ArrayList<Double>();

        ToyShoppingCart shopping = new ToyShoppingCart();
        System.out.println("Available toys " + productDescription.keySet());
        shopping.printInstructions();
        Scanner userInput = new Scanner(System.in);
        boolean quit = false;
        int count = 0;

        while(!quit){
            System.out.println("Enter your choice: ");
            int choice = userInput.nextInt();
            userInput.nextLine();
            String item;
            Integer inventory;

            switch(choice) {
                case 0:
                    shopping.printInstructions();
                    break;

                case 1:
                    item = shopping.getItem();
                    if(productInventory.containsKey(item) && productInventory.get(item) >= 1) {
                        shoppingCart.add(item);
                    } else {
                        System.out.println("Item is not available.");
                    }
                    inventory = productInventory.get(item);
                    productInventory.put(item, inventory - 1);
                    prices.add(productPrices.get(item));
                    shopping.printShoppingCart(shoppingCart);
                    break;
                case 2:
                    item = shopping.getItem();
                    inventory = productInventory.get(item);
                    shoppingCart.remove(item);
                    productInventory.put(item, inventory + 1);
                    System.out.println("Item is removed successfully!");
                    shopping.printShoppingCart(shoppingCart);
                    break;
                case 3:
                    quit = true;
                    System.out.println("The items that you bought: " + shoppingCart);
                    double sum = 0;
                    for(Double price : prices) {
                        sum = sum + price;
                    }
                    System.out.println("Your final bill is: " + sum);
                    Set<String> toys = productInventory.keySet();
                    for(String toy : toys) {
                        System.out.println(toy + ": " + productDescription.get(toy) + ", price is $"+ productPrices.get(toy) + " and inventory is " + productInventory.get(toy));
                    }
                    break;

                default:
                    System.out.println("Your input is invalid");

            }
        }


    }



    public void printInstructions(){
        System.out.println("Press 0 - to print choice option");
        System.out.println("Press 1 - to add item to your shopping cart");
        System.out.println("Press 2 - to remove an item from your shopping cart");
        System.out.println("Press 3 - to check out");
    }


    public void printShoppingCart(ArrayList<String> shoppingCart){
        HashMap<String, Integer> shoppingCartHashMap = new HashMap<>();
        for(String item : shoppingCart) {
            if (shoppingCartHashMap.containsKey(item)) {
                shoppingCartHashMap.put(item, shoppingCartHashMap.get(item) + 1);
            } else {
                shoppingCartHashMap.put(item, 1);
            }
        }

        System.out.println("Your current shopping cart: " + shoppingCartHashMap);
    }

    public String getItem(){
        System.out.println("Please type in the item name: ");
        String item = userInput.nextLine();
        return item;
    }


}
