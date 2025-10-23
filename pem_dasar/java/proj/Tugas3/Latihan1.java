import java.util.Scanner;

public class Latihan1 {
    public static void alg1() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menampilkan Angka Diantara 2 Nilai ===");
        System.out.print("Masukkan nilai pertama: ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        int nilai2 = input.nextInt();

        System.out.print("Output: ");
        for (int i = nilai1; i < nilai2; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void alg2() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Mencetak Karakter Sampai 'x' atau 'X' ===");
        System.out.println("Masukkan karakter (ketik 'x' atau 'X' untuk keluar):");

        char karakter;
        do {
            karakter = input.next().charAt(0);
            System.out.println(karakter);
        } while (karakter != 'x' && karakter != 'X');

        System.out.println("Program selesai\n");
    }

    public static void alg3() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Penjumlahan Deret N Bilangan Asli ===");
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        int jumlah = 0;
        System.out.print("Perhitungan: ");
        for (int i = 1; i <= n; i++) {
            jumlah += i;
            System.out.print(i);
            if (i < n) System.out.print(" + ");
        }
        System.out.println(" = " + jumlah + "\n");
    }

    public static void alg4() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Rata-rata dari N Bilangan ===");
        System.out.print("Masukkan jumlah bilangan (n): ");
        int n = input.nextInt();

        double jumlah = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double bilangan = input.nextDouble();
            jumlah += bilangan;
        }

        double rataRata = jumlah / n;
        System.out.println("Rata-rata: " + rataRata + "\n");
    }

    public static void alg5() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Rata-rata dengan Konfirmasi ===");

        double jumlah = 0;
        int counter = 0;
        String lanjut;

        do {
            System.out.print("Masukkan bilangan: ");
            double bilangan = input.nextDouble();
            jumlah += bilangan;
            counter++;

            System.out.print("Input lagi? (y/n): ");
            lanjut = input.next();
        } while (lanjut.equalsIgnoreCase("y"));

        double rataRata = jumlah / counter;
        System.out.println("Rata-rata dari " + counter + " bilangan: " + rataRata + "\n");
    }

    public static void alg6() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Penjumlahan Deret Aritmatika ===");
        System.out.print("Masukkan suku pertama (a): ");
        int a = input.nextInt();
        System.out.print("Masukkan beda (b): ");
        int b = input.nextInt();
        System.out.print("Masukkan jumlah suku (n): ");
        int n = input.nextInt();

        int jumlah = 0;
        System.out.print("Deret: ");
        for (int i = 1; i <= n; i++) {
            int un = a + (i - 1) * b;
            jumlah += un;
            System.out.print(un);
            if (i < n)
                System.out.print(" + ");
        }
        System.out.println(" = " + jumlah + "\n");
    }

    public static void alg7() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Perkalian N Bilangan ===");
        System.out.print("Masukkan jumlah bilangan (n): ");
        int n = input.nextInt();

        int hasil = 1;
        System.out.print("Perhitungan: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = input.nextInt();
            hasil *= bilangan;

            if (i == 1) {
                System.out.print(bilangan);
            } else {
                System.out.print(" * " + bilangan);
            }
        }
        System.out.println(" = " + hasil + "\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║      MENU ALGORITMA DASAR JAVA         ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println("1. Menampilkan angka diantara 2 nilai");
            System.out.println("2. Mencetak karakter sampai 'x' atau 'X'");
            System.out.println("3. Penjumlahan deret N bilangan asli");
            System.out.println("4. Rata-rata dari N bilangan");
            System.out.println("5. Rata-rata dengan konfirmasi");
            System.out.println("6. Penjumlahan deret aritmatika");
            System.out.println("7. Perkalian N bilangan");
            System.out.println("0. Keluar");
            System.out.print("\nPilih menu (0-7): ");
            pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    alg1();
                    break;
                case 2:
                    alg2();
                    break;
                case 3:
                    alg3();
                    break;
                case 4:
                    alg4();
                    break;
                case 5:
                    alg5();
                    break;
                case 6:
                    alg6();
                    break;
                case 7:
                    alg7();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }
        } while (pilihan != 0);
        input.close();
    }
}
