import java.util.Scanner;
public class mad_libs_game{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the noun");
        String noun=scanner.nextLine();
        System.out.println("enter the adjective");
        String adjective=scanner.nextLine();
        System.out.println("enter the verb");
        String verb=scanner.nextLine();

        System.out.println(
             "During the school festival, the children decided to play "+verb+
             " in the garden while rehearsing for their stage play "+noun+
             " The teacher reminded them that the main play "+noun+
             " should not be delayed,so they needed to act seriously. One student laughed and said,“It is easy for us to play "+verb+
             " because the script is simple, and the story has a very playful "+adjective+
           "tone. The audience later admired how natural the performance was, praising the students for turning a simple"
           +noun+"into an exciting show,proving that when you play "+verb+" with energy, even a short play "+noun+" feels grand."
             );
  



    }
}
