import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlah;
        System.out.print("Masukan jumlah perulangan: ");
        jumlah = scanner.nextInt();
        int i = 1;
        while (i < jumlah) {
            System.out.println("Perulangan ke-" + i);
            i++;
        }

        i = jumlah;
        while (i >= 1) {
            System.out.println("Perulangan ke-" + i);
            i--;
        }

        char konfirmasi = 'y';
        i = 0;
        while (konfirmasi == 'y' || konfirmasi == 'Y') {
            System.out.println("Perulangan ke-" + i);
            i++;
            System.out.print("Apakah mau diulang lagi ? (y/t)");
            konfirmasi = scanner.next().charAt(0);
        }

        // i = 1;
        // do {
        //     System.out.println("Perulangan ke-" + i);
        //     i++;
        //     System.out.print("Apakah mau diulang lagi ? (y/t)");
        //     konfirmasi = scanner.next().charAt(0);
        // } while (konfirmasi == 'y' || konfirmasi == 'Y');
    }
}
