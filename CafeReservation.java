import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, gender, dayReservation, result;
        int age, apperance, money;

        result="";

        System.out.println("Welcome to Reservation Cafe 99");
        System.out.println("Please insert your name :");
        name = input.next();

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println("What is your Gender (male or female)");
        gender = input.next();

        System.out.println("How attractive are you ? (1 to 10)");
        apperance = input.nextInt();

        System.out.println("How much money do you have ?");
        money = input.nextInt();

        System.out.println("What day do you want to make a Reservation ?");
        dayReservation = input.next();

        if (dayReservation.equalsIgnoreCase("Monday")){
            if(age >=20 && age <=30 && money >=500){
                result = "Reservation successfuly. you can order on monday. young night.";
            }else{
             result = "Sorry, you can't order on monday.because it is for young night.";
            }
        }else if(dayReservation.equalsIgnoreCase("Tuesday")){
            if(age >=31 && age <=50 && money >=250){
                result = "Reservation successfuly. you can order on Tuesday. oldest night.";
            }else{
             result = "Sorry, you can't order on Tuesday.because it is for oldest night.";
            }
        }else if(dayReservation.equalsIgnoreCase("Wednesday")){
            if(gender.equalsIgnoreCase("Female") && age >=20 && age <=35 && apperance >=8 && money >=300){
                result = "Reservation successfuly. you can order on Wednesday. Ladies night.";
            }else{
             result = "Sorry, you can't order on Wednesday.because it is for Ladies night.";
            }
        
        }else if(dayReservation.equalsIgnoreCase("Thursday")){
            if(gender.equalsIgnoreCase("Female") && age >=21 && age <=30 && apperance >=8 && money >=300){
                result = "Reservation successfuly. you can order on Thursday. Party night for single.";
            }else if(gender.equalsIgnoreCase("Male") && age >=21 && age <=30 && apperance >=8 && money >=300){
                result = "Reservation successfuly. you can order on Thursday. Party night for single.";
            }else{
             result = "Sorry, you can't order on Thursday.because it is Party night for single.";
            }
        
        }else if(dayReservation.equalsIgnoreCase("Friday")){
            if(gender.equalsIgnoreCase("Female") && age >=31 && age <=45 && money >=1000){
                result = "Reservation successfuly. you can order on Friday. Women Night.";
            }else if(gender.equalsIgnoreCase("Male") && age >=21 && age <=25 && apperance >=8 ){
                result = "Reservation successfuly. you can order on Friday. Women night.";
            }else{
             result = "Sorry, you can't order on Friday. because it is Women Night.";
            }
        
        }else if(dayReservation.equalsIgnoreCase("Saturday") || dayReservation.equalsIgnoreCase("Sunday")){
            if( age >=18 && age <=60 && money >=100){
                result = "Reservation successfuly. you can order on Weekend days. Weekend Freedom.";
           }else{
             result = "Sorry, you can't order on Weekend days !!. because it is for weekend freedom.";
            }
        }

        System.out.println();
        System.out.println("Hi, " + name + "Thank you for using our Applications");
        System.out.println("Following Results for your Reservation : ");
        System.out.println(result);

    }
}
