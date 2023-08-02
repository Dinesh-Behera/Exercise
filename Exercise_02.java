  // Question
       // Rock , Paper Scissor game in Java. ( 0 for Rock , 1 for paper , 2 for Scissor)
          // Condition for win -
               // 1. Rock win if choose Scissor
               // 2. Scissor win if choose Paper
               // 3. Paper win if choose Rock

import java.util.Scanner;
import java.util.Random;
public class Exercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock , Enter 1 for Paper , Enter 2 for Scissor ");
        int UserInput;
        UserInput = sc.nextInt();
        System.out.println("You Enter : " + UserInput);

        Random ra = new Random();
        int ComputerInput;
        ComputerInput = ra.nextInt(3);
//        System.out.println("Computer Enter " + ComputerInput);

        if (UserInput == ComputerInput){
            System.out.println("Draw..! Play again");
        }
        else if (UserInput == 0 && ComputerInput == 2 || UserInput == 2 && ComputerInput == 1
                || UserInput == 1 && ComputerInput == 0) {
            System.out.println("You win");
        }
        else {
            System.out.println(" OOPS...! You lost");
        }
        System.out.println("Computer Choice : " + ComputerInput);
    }
}
