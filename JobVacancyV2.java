import java.util.Scanner;

public class JobVacancyV2{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, gender, graduate,position, status ;
        int age, experience ;
        double apperance ;

        status = "";
        System.out.println("JOB VACANCY Version 2");
        
        System.out.println("Nama : ");
        name = input.next();

        System.out.println("Umur : ");
        age = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        gender = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        graduate = input.next();

        System.out.println("Pengalaman (tahun) :");
        experience = input.nextInt();

        System.out.println("penampilan : (1-10) :");
        apperance = input.nextDouble();


        System.out.println("Posisi yang dilamar : (SPV/ADMIN/KOORDINATOR) : ");
        position = input.next();

        if(position.equalsIgnoreCase("KOORDINATOR")){
            if((age>=21 && age<=30) && graduate.equalsIgnoreCase("SMK")|| graduate.equalsIgnoreCase("D3") && experience >=2){
                status = "Selamat, anda";
            }else{
                status = "Maaf saya anda belum memenuhi kualifikasi untuk posisi " + position; 
            }
        }else if(position.equalsIgnoreCase("ADMIN")){
            if(gender.equalsIgnoreCase("WANITA") && age >=20 && age <=25 && graduate.equalsIgnoreCase("D3") && apperance >=8){
                status = "Selamat anda memenuhi kualifikasi untuk posisi " + position;

            }else{
                status = "Maaf sayang anda belum memenuhi kualifikasi untuk posisi " + position;
            }
        }else if(position.equalsIgnoreCase("SPV")){
            if(gender.equalsIgnoreCase("PRIA") || gender.equalsIgnoreCase("WANITA")){
                status = "Selamat anda memenuhi kualifikasi untuk posisi " + position;
            }else{
                status = "Maaf sayang anda belum memenuhi kualifikasi untuk posisi " + position + " semangat mengejar mimpimu yaa pasti dapat yang lebih baik";
            }
        }

        
        
        System.out.println();
        System.out.println(name + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret sekali ");
        System.out.println("berikut hasil dari rekruitmen : ");
        System.out.println(status);


    }
}