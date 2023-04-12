import java.util.Scanner;

public class JobVacancies
 {
    public static void main(String[] args) {
    
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        
        Scanner input = new Scanner(System.in);

        //buat output text yang dibutuhkan

        System.out.println("Selamat datang di PT. Secret banget 79");
        System.out.println("========================");
        System.out.println("Silahkan input data anda");
        System.out.println("Nama :");
        nama = input.next();

        System.out.println("Umur :");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) :");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan : ");
        penampilan = input.nextInt();

        //pengecekan data untuk persyaratan koordinator
        /*
         * 
         * 1. persyaratan koordinator : 
         * 
         * Pria 
         * Umur min 21 th & maks 30
         * lulusan smk/d3
         * 
         * atau
         * 
         * pria 30 tahun keatas
         * lulusan s1
         * memiliki pengalaman min 5 tahun
         */

         // persyaratan pertama 
         reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >=21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >=2;

         reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur >30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5;

         // hasil dari koordinator
         isPassingKoor = reqKoor1 || reqKoor2;

         // pengecekan data untuk persyaratan admin
         /* 2. Persyaratan Admin
          * Wanita
          Umur min 20 tahun & Maks 25tahun
          lulusan D3
          Memiliki penampilan yang menarik atau pengalaman min 1tahun

          atau 

          Wanita 
          Umur diatas 25tahun
          lulusan s1
          Memiliki penampilan yang menarik
          memiliki pengalaman min 3 tahun

          */

          //persyaratan admin 1
          reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >=20 && umur <=25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >=1);

          reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >=3;

          //hasil dari admin
          isPassingAdmin = reqAdmin1 || reqAdmin2;

          //membuat output text hasil
          System.out.println();

          System.out.println(nama + " Terimakasih sudah mengikuti lowongan kerja di PT. Secret Banget \n");
          System.out.println("Berikut adalah hasil dari rekruitment untuk koordinator dan admin :");
          System.out.println("Hasil kelulusan untuk koordinator :" + isPassingKoor);
          System.out.println("Hasil kelulusan untuk admin : " + isPassingAdmin);

    }
}
