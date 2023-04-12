import java.util.Scanner;

public class Luping {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);

        int n;
        String message;

        System.out.println("Enter a message and i'll display it five times.");
        System.out.print("Message : ");
        message = input.nextLine();
        
        for(n = 0; n < 5; n++) {
            System.out.println(n +". "+ message);
        }
        
        System.out.println("\n Now i'll show it tentime and count by 5s.");

        for(n =5 ; n > 0; n-=1) {
            System.out.println(n +". "+ message);
        }



    }
}
