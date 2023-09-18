package Segitiga;

import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        double alas, tinggi, sisi, luas, keliling;

        System.out.println("Masukkan Nilai Alas");
        alas=input.nextDouble();
        System.out.println("Masukkan Nilai Tinggi");
        tinggi=input.nextDouble();
        System.out.println("Masukkan Nilai Sisi");
        sisi=input.nextDouble();
        
        luas = 0.5 * alas * tinggi;
        keliling = sisi * 3;

        System.out.println("\nHasil Luas Adalah = " +luas);
        System.out.println("Hasil Keliling Adalah = " +keliling);
    }
}