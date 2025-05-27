package lesson05;

public class variables {

    public static void main (String[] args) {
//
//        int attendees = 4;
//        boolean largeVenue;
//
//        //if statement
//        if (attendees >= 5){
//            largeVenue = true;
//        } else {
//            largeVenue = false;
//        }
//
//        String message = "attendees is " + attendees + " ,so is large venue needed ? " + largeVenue;
//
//        System.out.println(message);

        //same outcome with less code
        //largeVenue = (attendees >= 5);


       String[] names = {"Asanda", "Nomonde", "Khwezi"};
        int[] ages = {25, 24, 7};

        int myAge = ages[0];
        int yourAge = ages[1];

        System.out.println("My age is " + myAge);

        names[2] = "Swazi";
        System.out.println(names[0] + " " + names[1] + " " + names[2]);

        for (String name : names) {
            System.out.println("My name is " + name);
        }

        //using break with loops

        int passmark = 12;
        boolean passed = false;
        int[] scores=  {6, 8, 9, 12, 35, 10};
        for (int unitScore : scores) {
            if (unitScore >= 12) {
                passed = true;
                break;

            }
        }
        System.out.println("At least one passed ?" + passed);
    }
}
