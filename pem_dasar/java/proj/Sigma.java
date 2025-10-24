import java.util.Scanner;

public class Sigma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        int i = 0;
        int totalJumlah = 0;
        int totalJumlahKali = 1;
        char konfirmasi = 'y';

        while (konfirmasi == 'y' || konfirmasi == 'Y') {
            i++;
            System.out.print("Input bilangan ke-" + i + " : ");
            bil = input.nextInt();
            totalJumlah += bil;
            totalJumlahKali *= bil;
            System.out.print("Apakah mau diulang lagi ? (y/t)");
            konfirmasi = input.next().charAt(0);
        }
        System.out.println("Total penjumalahan bilangan: " + totalJumlah);
        System.out.println("Total perkalian bilangan: " + totalJumlahKali);
    }
}
