import java.util.Scanner;
public class quess_game_instring {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("I am a fruit. i am red and people often make juice from me. what am i?");
        System.out.print("enter the word : ");
        String word=input.nextLine().toLowerCase();
        String target="apple";
        int attempts=1;
        do { 
            if (word.equals(target)) {
                break;                
            }           
            else if(word.contains("app")){
                System.out.println("you are too close to answer");
            }else if(word.contains("a")){
                System.out.println("you guess single letter");
            }else{
                System.out.println("worng guess try again");
            }
            attempts++; 
            System.out.print("enter the word : ");
            word=input.nextLine();
        } while (!word.equals(target));
        System.out.println("u get right answer");
        System.out.println("attempts : "+attempts);
    }
}
