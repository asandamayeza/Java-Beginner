package ex05_1_exercise;

public class shoppingCart {

    public static void main (String[] args) {

        String custName = "Asanda",
                itemDesc = "Shirt";


        double price = 12.50;
        double tax = 5.10;
        int quantity = 1;
        double total;
        String message = custName+ " wants to purchase " + quantity + " " + itemDesc ;


        total = quantity * price * tax;


        boolean outOfStock = false;

       if (quantity > 1){
           message = message + "s";

        }

       if (outOfStock){
           System.out.println(itemDesc + " out of stock");
       }
       else{
           System.out.println(message);
           System.out.println("Your total is" + " R" + total);
       }
    }
}
