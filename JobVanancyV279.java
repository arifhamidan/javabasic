import java.util.Scanner;

public class JobVanancyV279 {
    public static void main(String[] args) {
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin, posisi, hasil;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2, reqAdmin3, reqKoor4, reqSpv1, reqSpv2;

        Scanner input = new Scanner(System.in);

        hasil = "";
        System.out.println("Selamat datang di PT. Secret sekali 79");
        System.out.println("===================");

        //output text untuk kebutuhan data input user
        System.out.println("silahkan input data anda : \n");

        System.out.println("Nama : ");
        nama = input.next();

        
        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman (Tahun) : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan (1 - 10) : ");
        penampilan = input.nextDouble();

        System.out.println("Posisi yang dilamar (SPV/ADMIN/Koordinator) : ");
        posisi = input.next();

        if(posisi.equalsIgnoreCase("Koordinator")){
            reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur> 21 && umur<=30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3") && pengalaman >=2);
            reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur> 30 && lulusan.equalsIgnoreCase("SMK")  && pengalaman >=5;            hasil = "selamat,";
            if(reqKoor1 || reqKoor2){
                hasil = "selamat " + nama + " \n anda memenuhi kualifikasi sebagai " + posisi + ". dan akan masuk ke tahap selanjutnya" ;
            }else{
                hasil  = " Maaf, " + nama + " \n anda belum memenuhi kualifikasi untuk posisi " + posisi + ". dan belum bisa melanjutkan ketahap selanjutnya ";
                
            }
        }else if(posisi.equalsIgnoreCase("Admin")){
            reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >=20 && umur <=25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >=1);
            reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >=25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 || pengalaman >=3;
            reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur >=20 && umur <=30 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1"))&& pengalaman >=2;

            if(reqAdmin1 || reqAdmin2 || reqAdmin3 ){
                
                hasil = "selamat " + nama + " \n anda memenuhi kualifikasi sebagai " + posisi + ". dan akan masuk ke tahap selanjutnya" ;
            }else{
                hasil  = " Maaf, " + nama + " \n anda belum memenuhi kualifikasi untuk posisi " + posisi + ". dan belum bisa melanjutkan ketahap selanjutnya ";
            }
        }else if(posisi.equalsIgnoreCase("SPV")){
            reqSpv1 = umur >=25 && umur <=30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;
            reqSpv2 = umur >=25 && umur <=35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4;          
            
            if(reqSpv1 || reqSpv2){
                
                hasil = "selamat " + nama + " \n anda memenuhi kualifikasi sebagai " + posisi + ". dan akan masuk ke tahap selanjutnya" ;
            }else{
                hasil  = " Maaf, " + nama + " \n anda belum memenuhi kualifikasi untuk posisi " + posisi + ". dan belum bisa melanjutkan ketahap selanjutnya ";
            }
        }
 
        System.out.println();
        System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret sekali ");
        System.out.println("berikut hasil dari rekruitmen  untuk posisi : " +posisi );
        System.out.println(hasil);

    }   
}
