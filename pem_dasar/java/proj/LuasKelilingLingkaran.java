import java.util.Scanner;

public class LuasKelilingLingkaran {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // double phi = 3.14;
        double phi = (double) 22/7;
        double r, keliling, luas;

        System.out.println("Menghitung Lingkaran");
        System.out.print("Masukkan jari jari lingkaran: ");
        r = scanner.nextDouble();

        keliling = 2 * phi * r;
        luas = phi * r * r;

        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}
