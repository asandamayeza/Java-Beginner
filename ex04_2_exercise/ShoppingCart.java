package ex04_2_exercise;

public class ShoppingCart {

    public static void main (String[] args){

        double price = 12.50;
        double tax = 5.10;
        int quantity = 5;
        double total;

        String message = "customer wants to puchase" + quantity + " items" ;
        System.out.println(message);

        total = quantity * price * tax;

        System.out.println("The total cost is " + "R" + total );
    }


}
