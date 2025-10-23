import java.util.Scanner;

public class PerulanganFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        int jumlah;
        System.out.print("Masukan jumlah perulangan: ");
        jumlah = scanner.nextInt();
        for (int i = 1; i < jumlah; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        for (int i = jumlah; i >= 1; i--) {
            System.out.println("Perulangan ke-" + i);
        }

        int Un; int Sn = 0;
        for (int i = 1; i <= jumlah; i++) {
            Un = 2 * 1;
            Sn = Sn + Un;
            System.out.println("bwa" + i + " adalah " + Un);
        }
        System.out.println("bwa" + Sn);
    }
}
