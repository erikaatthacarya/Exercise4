package Lingkaran;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double jari_jari, luas, keliling;
        double π = 3.14;

        System.out.println("Masukkan Nilai Jari-Jari");
        jari_jari=input.nextDouble();
        
        luas = π * jari_jari * jari_jari;
        keliling = 2 * π * jari_jari;

        System.out.println("\nHasil Luas Adalah = " +luas);
        System.out.println("Hasil Keliling Adalah = " +keliling);
    }
}