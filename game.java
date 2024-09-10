import java.util.*;
import java.util.Random;
public class game {

    public static void main(String[] args) {
        Random rn = new Random();
        int randomNum = rn.nextInt(100);
        System.out.println(randomNum); // Checking the Random number

        Scanner sc = new Scanner(System.in);
        System.out.println("\nWELCOME TO LUCKY NUMBER HUNT");
        System.out.println("Condition:-1. Choose your Number between 0 and 100\n");
        System.out.print("Enter Your Name: ");
            String name = sc.nextLine();

        System.out.println("\nHii "+ name +" Wlcome to the game.");
            System.out.print("\nThe Random Number is Generated & It's time to Check Your Luck\nEnter Your Number:- ");

                while (true) {
                    int num = sc.nextInt();
                        if(randomNum==num){
                            System.out.println("Yahoo! Congratulation, You win.");
                            break;
                        }else if (randomNum>num){
                            System.out.println("To Small.");
                        }else if(randomNum<num){
                            System.out.println("Too Big.");
                        }
                    
                }

        sc.close();
        }
    }