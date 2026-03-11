
import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Quiz");

        System.out.println("What is Java?");
        System.out.println("1. Programming Language");
        System.out.println("2. Database");
        System.out.println("3. Operating System");

        int answer = sc.nextInt();

        if(answer == 1)
        {
            System.out.println("Correct Answer");
        }
        else
        {
            System.out.println("Wrong Answer");
        }
    }
}