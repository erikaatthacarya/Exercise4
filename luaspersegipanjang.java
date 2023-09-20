import java.util.Scanner;
 
public class luaspersegipanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;

        System.out.println("Program Menghitung Luas Persegi Panjang");

        System.out.println("Masukkan Panjang: ");
        panjang = input.nextInt();
        System.out.println("Masukkan Lebar: ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas Persegi: " + luas);
    }
}