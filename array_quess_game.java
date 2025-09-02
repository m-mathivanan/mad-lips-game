import java.util.Scanner;
public class array_quess_game {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         int[] quess={2,3,3};
         int count=0;
        String[] question={
            "What is the size of int in Java?",
            "Which method is the entry point of a Java program?",
            "Which of the following is true about Java?"};
        String[][] answer={
            {"1) 2 bytes\n", 
            "2) 4 bytes\n" ,
            "3) 8 bytes\n" ,
            "4) Depends on OS"},
            {"1) start()",
             "2) init()",
             "3) main()",
             "4) run()"
            },{
                "1) Java supports multiple inheritance using classes",
                "2) Java is platform dependent",
                "3) Java uses JIT (Just-In-Time) compiler",
                "4) Java does not support OOP concepts"
            }
        };
        System.out.println("------------------------------------");
        System.out.println("|    Welcome to the quess game     |");
        System.out.println("------------------------------------");

        for(int i=0;i<question.length;i++){
            System.out.println(question[i]);
            System.out.println("option :");
            for(int j=0;j<answer[i].length;j++){
                System.out.println(answer[i][j]);
            }
            System.out.println("enter the quess :");
            int b=input.nextInt();
            if(b==quess[i]){
                System.out.println("Your answer is correct..,");
                count++;
            }else{
                System.out.println("incorrect answer..,");
            }
        }
        System.out.println("Your score :"+count);
    }
    
}
