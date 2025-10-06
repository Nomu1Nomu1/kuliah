import java.util.Scanner;

public class SegitigaSamaKaki {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        double sisiMiring = Math.sqrt(Math.pow(alas/2, 2) + Math.pow(tinggi, 2));

        double luas = 0.5 * alas * tinggi;
        double keliling = alas + 2 * sisiMiring;

        System.out.println("Luas segitiga sama kaki: " + luas);
        System.out.println("Keliling segitiga sama kaki: " + keliling);

    }
}