import java.util.Scanner;
import java.util.Random;

public class DiningHall {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] dinArry = new String[5];
        //putting the dining halls into an array
        dinArry[0] = "Bolton";
        dinArry[1] = "Snelling";
        dinArry[2] = "The Niche";
        dinArry[3] = "The Village Summit";
        dinArry[4] = "Ogelthorpe";

        Random random = new Random();
        //initial user input
        System.out.print("Please enter an integer: ");
        while (!keyboard.hasNextInt()) {
            System.out.println("Thats not a number!");
            System.out.print("Please enter an integer: ");
            keyboard.next();            
        }
        int initNum = keyboard.nextInt();
            int randomNum = random.nextInt(4); 
        System.out.println("Your random dining hall: " + dinArry[randomNum]);
        
        if (dinArry[randomNum].equals("Bolton")) {
            System.out.print("Your options are: Lemongrass Kitchen, Tanyard Grill, Tanyard Deli, or Taqueria.");
        } else if (dinArry[randomNum].equals("Snelling")) {
            System.out.println("Your options are: Sanford Grill, The Bowl, Sanford Sandwiches, or Giorgio's Pizza");
        } else if (dinArry[randomNum].equals("The Niche")) {
            System.out.println("Your options are: The Grill, The Hearth, The Market, or the Salad Bar");
        } else if (dinArry[randomNum].equals("The Village Summit")) {
            System.out.println("Your options are: Blue Steel Grill, Egg Works, Headliners, or The Upper East Side Deli");
        } else {
            System.out.println("Your options are: Hole in the Wall Girll, O'Hacienda, Oishii, or Delicously Southern");
        }

        keyboard.close();
    }


}
