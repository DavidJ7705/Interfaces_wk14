package ie.atu;

import java.util.Scanner;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
    // array list for MenuItem objects
        MenuItem[] menuItems=new MenuItem[]{
                //menu items
                new Burger ("Cheeseburger",3.50,"Beef patty, ketchup,cheese,buns "),
                //new Burger ("Whopper",9.50,"Beef patty, Burger King Sauce,cheese,buns "),
                //new Burger ("Classic Burger",2.99,"Patty, ketchup,cheese,onions,lettuce, buns "),

                new Pizza("Margherita",10.50,"Tomato Sauce, mozzarella, basil "),
                //new Pizza("Pepperoni Pizza",6.50,"Tomato Sauce,Pepperoni, mozzarella, basil "),
                //new Pizza("Hawaiian Pizza",14.50,"Tomato Sauce,Chicken, Pineapple, mozzarella, basil "),

                //new Salad("Caesar salad",7.99,"Lettuce, Croutons, caesar sauce "),
                //new Salad("Chicken salad",6.50,"Tomato,onion, olive oil, chilli peppers"),
                new Salad("Fruit salad",3.99,"Kiwi, Pineapple, pineapple, mixed berries "),
        };

    //Displaying details
        for(MenuItem menuItem: menuItems){
            //printing out the name, description and ingredients for each item
            System.out.println("\nName: "+ menuItem.getName());
            System.out.println("Description: "+ menuItem.getDescription());
            System.out.println("Price: "+ menuItem.getPrice());
        }

    //Calculate and disp. total cost of order
        double totalCost = 0;
        for(MenuItem menuItem : menuItems){
            //Total cost of menu item prices in an order
            totalCost+=menuItem.getPrice();
        }
        System.out.println(String.format("Total Cost: €%.2f", totalCost));
    }
}