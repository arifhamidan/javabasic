package Looping;

public class For {
    public static void main(String[] args) {
        
        for(int bil= 1; bil<=10; bil++) {
            System.out.println("Looping ke-"+bil);
        }

        // nested loop

        // for ( char huruf= "d"; huruf <= "h"; huruf ++){

        // }


        //looping for each (untuk menampilkan isi array)
            // 
            int angka[] = {3,1,42,12,15};

            //menggunakan perulangan for each (untuk menampilkan isi dari array angka)
            for (int iterasi : angka) {
                System.out.print(iterasi +", ");
            }

    }
}
