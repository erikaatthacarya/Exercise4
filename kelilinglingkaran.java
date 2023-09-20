import java.util.Scanner;

public class kelilinglingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phi = 3.14; 
        double r;
        double keliling;

        System.out.println("Program Menghitung Keliling Lingkaran");

        System.out.println("Masukkan jari-jari: ");
        r = input.nextDouble();
        
        keliling = 2 * phi * r;

        System.out.println("Keliling lingkaran: " + keliling);
    }
}