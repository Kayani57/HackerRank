package HackerRank;
import java.util.*;
import java.security.*;

interface Food {
    public String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {

    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if(order.equals("cake")) {
            return new Cake();
        } else {
            return new Pizza();
        }
    }
}

class Solution {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        // Creating the factory
        FoodFactory foodFactory = new FoodFactory();

        // Prompting user for input
        System.out.println("Enter your order (cake/pizza):");
        String order = sc.nextLine();

        // Factory instantiates an object based on user input
        Food food = foodFactory.getFood(order);

        System.out.println("The factory returned "+food.getClass());
        System.out.println(food.getType());

        sc.close(); // Closing scanner
    }
}
