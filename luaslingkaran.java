import java.util.Scanner;

public class luaslingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double phi = 3.14;
        double r;
        double luas;

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        
        luas = phi * jariJari * jariJari;

        System.out.println("Hasil Luas adalah\n " + luas);
    }
}