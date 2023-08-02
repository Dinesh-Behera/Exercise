// Question -
         // Calculate percentage of a given student in CBSE board exam.His marks from 5 subjects must be taken as input from the user.(Total marks 100)
import java.util.Scanner;

public class solution_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the CBSE percentage maker");
        System.out.print("Enter the total marks of the subject : ");
        int total_marks = sc.nextInt();
        System.out.print("Enter the marks of sub_1 : ");
        int sub_1 = sc.nextInt();
        System.out.print("Enter the marks of sub_2 : ");
        int sub_2 = sc.nextInt();
        System.out.print("Enter the marks of sub_3 : ");
        int sub_3 = sc.nextInt();
        System.out.print("Enter the marks of sub_4 : ");
        int sub_4 = sc.nextInt();
        System.out.print("Enter the marks of sub_5 : ");
        int sub_5 = sc.nextInt();
        int total = sub_1 + sub_2 + sub_3 + sub_4 +sub_5;
        float percentage = total / (total_marks * 5.0f)*100;
        System.out.println("your total percentage is " + percentage + " %");
        System.out.println("Thank you");
    }
}
