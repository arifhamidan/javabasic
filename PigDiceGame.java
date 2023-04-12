import java.util.Scanner;
public class PigDiceGame {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int roll, ptot, ctot, turnTotal;
        String choice ="";

        ptot=0;
        ctot=0;

        do{
            if(ptot < 100){
                turnTotal = 0;
                System.out.println("Computers has " + ctot + " Points"  );
                do{
                    roll = 1 + (int) (Math.random()*6);
                    System.out.println("\t Computer rolled a "+ roll + ".");
                    if(roll ==1){
                        System.out.println("\t That ends it turn.");
                        turnTotal = 0;
                    }else{
                        turnTotal +=roll;
                        System.out.println("\t Computer has "+ turnTotal + ".");
                        System.out.print("points so far this round.\n");
                        if(turnTotal < 10){
                            System.out.println("\t Computer will roll again");
                        }
                    }
                }while(roll != 1 && turnTotal <10);
                ctot += turnTotal;
                System.out.println("\t Computer end the round with");
                System.out.println(ctot + " points.\n");
            }
            turnTotal = 0;
            System.out.println("You have "+ ptot + " points.");
            do{
                roll = 1 + (int)(Math.random()*6);
                System.out.println("\t You Rolled a "+ roll + ".");
                if(roll ==1){
                    System.out.println("\t That ends your turn.");
                    turnTotal = 0;

                }else{
                    turnTotal += roll;
                    System.out.println("\t You have "+turnTotal + " points.");
                    System.out.println("so far this round. \n");
                    System.out.println("\t Would you like to \"roll\" again");
                    System.out.println("or \"hold\"?");
                    choice = input.next();
                }

            }while(roll != 1 && choice.equals("roll"));
            ptot+=turnTotal;
            System.out.println("\t You end the round with "+ptot+" points.\n");
        }while(ptot < 50 && ctot < 50);

        if(ptot > ctot){
            System.out.println("Humaniyt wins !!!");
        }else{
            System.out.println("The Computer wins.!!!");
        }
    }
}
