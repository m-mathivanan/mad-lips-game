
import java.util.Random;
import java.util.Scanner;
 
public class guessing_game {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Guess game (number) ");
        System.out.print("Enter the number betweeen 1 to 100 : ");
        int a,attempts=1;
        int number=input.nextInt();
        Random random=new Random();
        int target=random.nextInt(1,100);
        do { 
            System.out.println("Incorrect quess try again..,");

            if(number>target){
                System.out.println("Too high");
            }else if (number<target){
                System.out.println("Too Low");
            }
            attempts++;
            System.out.println("enter the quess again");
            number= input.nextInt();
        } while (target!=number);
                        System.out.println("You won");
                        System.out.println("attempts :"+attempts);
        
    }
}
