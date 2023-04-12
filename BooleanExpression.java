import java.util.Scanner;

public class BooleanExpression {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean a, b, c, d, e, f;
        double  x, y;

        System.out.println("Give me two numbers. First :");
        x = keyboard.nextDouble();
        System.out.print("Second :");
        y = keyboard.nextDouble();

        a = (x < y);
        b = (x <= y);
        c = (x == y);
        d = (x != y);
        e = (x > y);
        f = (x >= y);

        System.out.println(x + " is Less than " + y + ":" + a);
        System.out.println(x + " is less than / equal to " + y + ":" + b);
        System.out.println(x + "is equal to " + y + ":" + c);
        System.out.println(x + " is not equal to " + y + ":" + d);
        System.out.println(x + " is greater than " + y + ":" +e);
        System.out.println(x + " is greater than / equal to " + y + ":" + f);
        System.out.println();

        System.out.println(!(x < y) + "  " + !(x >= y) );
        System.out.println( !(x <= y) + " " + !(x > y));
        System.out.println(!(x==y) + " " + !(x!=y));
        System.out.println(! (x != y) + " " + (x==y));
        System.out.println(! (x > y) + " " + (x <=y));
        System.out.println(!(x >= y) + " " + (x < y));


    }
}
