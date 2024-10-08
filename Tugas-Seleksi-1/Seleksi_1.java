/* 
Buat program untuk meng-input nilai IPK mahasiswa dan berikan penilaian:
3,5 – 4,0 	Sangat Memuaskan
3,0 – 3,4 	Memuaskan
2,5 – 2,9 	Baik Sekali
2,0 – 2,4 	Baik
0,0 – 2,0  	Kurang 
*/

import java.util.*;
public class Seleksi_1 {

    private static final Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {
        
        System.out.println("Selamat datang! Program ini akan memberikan penilaian mengenai performa IPK Anda!");
        System.out.print("Masukkan IPK Anda (e.g 3,54): ");
        double IPK = scan.nextDouble();


        if (3.5 <= IPK){
            System.out.println("IPK Anda Sangat Memuaskan!");
        }
        else if (3.0 <= IPK && IPK <= 3.49){
            System.out.println("IPK Anda Memuaskan!");
        }
        else if(2.5 <= IPK && IPK <= 2.99){
            System.out.println("IPK Anda Baik Sekali!");
        }
        else if(2.0 <= IPK && IPK <=2.49){
            System.out.println("IPK Anda Baik!");
        }
        else{
            System.out.println("IPK Anda Kurang!");
        }
    }
}
