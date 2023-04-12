import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int umur;

        System.out.println("Berapa umur kamu sayang ?");
        umur = input.nextInt();

        if(umur >=18){
            System.out.println("kamu dapat membuat surat izin mengemudi (SIM)");
        }else{
            System.out.println("Belom cukup umur :x ");
        }
    }
}
