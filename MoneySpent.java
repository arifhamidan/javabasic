import java.util.Scanner;

public class MoneySpent {
    public static void main(String[] args) {
        String name;
        int moneySpent;
        double average;
        int total, totalDay = 7;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculate Your Money !!! \n");
        
        System.out.println("Hey, what is your name ?");
        name = input.nextLine();

        System.out.println("how much money did you spend at the club on monday");
        moneySpent = input.nextInt();

        total = moneySpent;
        
        System.out.println("How much did you spend at the club on Tuesday");
        moneySpent = input.nextInt();

        total = total + moneySpent;
        
        System.out.println("How much did you spend at the club on Wednesday");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("how much did you spend at the club on Thursday");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("How much did you spend at the club on Friday");
        moneySpent = input.nextInt(); 

        total = total + moneySpent;

        System.out.println("how much did you spend at the club on Saturday");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        System.out.println("how much did you spend at the club on Sunday");
        moneySpent = input.nextInt();

        total = total + moneySpent;

        average = (double) total / totalDay;

        System.out.println("The calculation results :");

        System.out.println("Hii, Jonson");
        System.out.println("Your total expenditures at the club this week is $  " + total);
        System.out.println("With an average daily expenditure of $ " + average);



    }
}
