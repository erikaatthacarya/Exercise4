import java.util.Scanner;

public class kelilingsegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        double alas, tinggi, sisi, keliling;

        System.out.println("Masukkan Nilai Alas");
        alas=input.nextDouble();
        System.out.println("Masukkan Nilai Tinggi");
        tinggi=input.nextDouble();
        System.out.println("Masukkan Nilai Sisi");
        sisi=input.nextDouble();
        
        keliling = sisi * 3;

        System.out.println("Hasil Keliling Adalah = " +keliling);
    }
}