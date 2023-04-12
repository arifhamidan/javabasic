import java.util.Scanner;

public class ForgetFulMachine {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What city is the capital of France ?");
        keyboard.next();

        System.out.println("what is 6 multiplied by ??");
        keyboard.nextInt();

        System.out.println("Enter a number between 0.0 and 0.17");
        keyboard.nextDouble();
        
        System.out.println("is there anything else you would like to say?");
        keyboard.next();
    }
}
