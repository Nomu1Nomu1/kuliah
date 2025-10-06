import java.util.Scanner;;

public class SisiMiringSegitigaSiku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));

        System.out.println("Panjang sisi segitiga siku-siku: " + sisiMiring);
    }
}
