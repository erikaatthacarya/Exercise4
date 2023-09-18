package PersegiPanjang;

import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int panjang, lebar, luas, keliling;

        System.out.println("Masukkan Nilai Panjang");
        panjang=input.nextInt();
        System.out.println("\nMasukkan Nilai Lebar");
        lebar=input.nextInt();

        luas= panjang * lebar;
        keliling= 2 * panjang + lebar;

        System.out.println("\nHasil Luas Adalah = " +luas);
        System.out.println("Hasil Keliling Adalah = " +keliling);
    }
}
