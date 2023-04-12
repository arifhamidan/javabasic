import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, days;
        String monthName;

        System.out.println("Which month ? (1-12) ");
        month = input.nextInt();

        switch(month) {
            case 1: 
               monthName = "Jan";
            break;
            case 2:
            monthName="Feb";
            break;
            default:monthName="Error, Anda tidak memasukan nilai dengan benar";
        }

        switch(month){
            
        }
    }
}