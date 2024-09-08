import java.util.*;
import java.util.Random;
public class game {

    public static void main(String[] args) {
        System.out.println("\nWELCOME TO LUCKY NUMBER HUNT\n");
        Random rn = new Random();

        int randomNum = rn.nextInt(100);
        //System.out.println(randomNum); // Checking the Random number

        Scanner sc = new Scanner(System.in);
        System.out.println("The Random Number is Generated & It's time to Check Your Luck\nEnter Your Number:- ");
        int num1 = sc.nextInt();

        if(num1<randomNum){
            System.out.println("It is too Small.");
        }else if(num1>randomNum){
            System.out.println("It is too Big");
        }else if (num1==randomNum){
            System.out.println("Yahooo! You Guessed Right");
        }else {
            System.out.println("Invalid Choice");
        }

        }
    }