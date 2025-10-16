import java.util.Scanner;

public class Latihan1 {

    static void diskon(Scanner scanner) {
        System.out.print("Masukkan total belanja: ");
        double total = scanner.nextDouble();
        double diskon;

        if (total > 100000) {
            diskon = 0.10;
        } else if (total >= 50000) {
            diskon = 0.05;
        } else {
            diskon = 0.0;
        }

        double potongan = total * diskon;
        double bayar = total - potongan;

        System.out.printf("Diskon: %.0f%%%n", diskon * 100);
        System.out.printf("Total bayar setelah diskon: Rp%,.2f%n", bayar);
    }

    static void suhu(Scanner scanner) {
        System.out.print("Masukan suhu (Celcius): ");
        double c = scanner.nextDouble();

        System.out.println("Pilih konversi:");
        System.out.println("1. Kelvin");
        System.out.println("2. Reamur");
        System.out.println("3. Fahrenheit");
        System.out.print("Pilihan (1/2/3): ");
        int pilih = scanner.nextInt();

        double hasil = 0;
        String satuan = "";

        switch (pilih) {
            case 1:
                hasil = c + 273.15;
                satuan = "Kelvin";
                break;
            case 2:
                hasil = (4.0 / 5.0) * c;
                satuan = "Reamur";
                break;
            case 3:
                hasil = (9.0 / 5.0) * c + 32;
                satuan = "Fahrenheit";
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        System.out.printf("Hasil konversi: %.2f %s%n", hasil, satuan);
    }

    static void urutkanDuaBilangan(Scanner scanner) {
        System.out.print("Masukan bilangan pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukan bilangan kedua: ");
        int b = scanner.nextInt();
        
        int data1 = Math.min(a, b);
        int data2 = Math.max(a, b);

        System.out.printf("Data terurut: %d, %d%n", data1, data2);
    }

    static void maxTiga(Scanner scanner) {
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Masukkan bilangan ke-%d: ", i + 1);
            nums[i] = scanner.nextInt();
        }

        int max = Math.max(nums[0], Math.max(nums[1], nums[2]));
        System.out.println("Nilai maksimum adalah: " + max);
    }

    static boolean genapGanjil(Scanner scanner) {
        System.out.print("Masukkan bilangan: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Nilai negatif, program dihentikan.");
            return false;
        }

        if (n % 2 == 0) {
            System.out.println(n + " adalah bilangan genap.");
        } else {
            System.out.println(n + " adalah bilangan ganjil.");
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU PROGRAM ===");
            System.out.println("1. Hitung Diskon Belanja");
            System.out.println("2. Konversi Suhu");
            System.out.println("3. Urutkan 2 Bilangan");
            System.out.println("4. Nilai Maksimum dari 3 Bilangan");
            System.out.println("5. Cek Genap/Ganjil (keluar jika negatif)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    diskon(scanner);
                    break;
                case 2:
                    suhu(scanner);
                    break;
                case 3:
                    urutkanDuaBilangan(scanner);
                    break;
                case 4:
                    maxTiga(scanner);
                    break;
                case 5:
                    genapGanjil(scanner);
                    break;
                case 0:
                    System.out.println("Program selesai");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
        scanner.close();
    }
}
