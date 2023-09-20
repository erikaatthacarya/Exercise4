import java.util.Scanner;

public class kelilingpersegipanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, keliling;

        System.out.println("Program Menghitung Keliling Persegi Panjang");

        System.out.println("Masukkan Panjang: ");
        panjang = input.nextInt();
        System.out.println("Masukkan Lebar: ");
        lebar = input.nextInt();

        keliling = 2 * (panjang + lebar);

        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}