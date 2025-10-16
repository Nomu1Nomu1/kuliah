import java.util.Scanner;

public class Latihan2 {
    static void hitungGaji(Scanner sc) {
        System.out.print("Masukkan golongan (1-3): ");
        int gol = sc.nextInt();
        double gajiPokok;

        switch (gol) {
            case 1 -> gajiPokok = 1_000_000;
            case 2 -> gajiPokok = 2_000_000;
            case 3 -> gajiPokok = 3_000_000;
            default -> {
                System.out.println("Invalid");
                return;
            }
        }

        double pajak = (gol == 3) ? 0.02 * gajiPokok : 0.0;
        double totalGaji = gajiPokok - pajak;

        System.out.printf("Gaji pokok : Rp%,.2f%n", gajiPokok);
        if (gol == 3) {
            System.out.printf("Pajak 2%% : Rp%,.2f%n", pajak);
        }
        System.out.printf("Total gaji diterima : Rp%,.2f%n", totalGaji);
    }

    static void nilaiMahasiswa(Scanner sc) {
        System.out.print("Masukkan nilai mahasiswa (0-100): ");
        double nilai = sc.nextDouble();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid. Tidak dapat menentukan kelulusan.");
            return;
        }

        String kelulusan = (nilai < 60) ? "Gagal" : "Lulus";
        String kriteria;

        if (nilai < 60) {
            kriteria = "-";
        } else if (nilai <= 69) {
            kriteria = "Cukup";
        } else if (nilai <= 79) {
            kriteria = "Baik";
        } else {
            kriteria = "Sangat Baik";
        }

        System.out.println("Status: " + kelulusan);
        if (!kriteria.equals("-")) {
            System.out.println("Kriteria: " + kriteria);
        }
    }

    static void persamaanKuadrat(Scanner sc) {
        System.out.println("Masukkan koefisien persamaan ax^2 + bx + c = 0");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;
        System.out.println("Diskriminan (D) = " + D);

        if (D > 0) {
            System.out.println("Akar-akar nyata dan berbeda.");
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.printf("x1 = %.2f, x2 = %.2f%n", x1, x2);
        } else if (D == 0) {
            System.out.println("Akar-akar nyata dan sama.");
            double x = -b / (2 * a);
            System.out.printf("x1 = x2 = %.2f%n", x);
        } else {
            System.out.println("Akar-akar khayal (tidak nyata).");
            if (a > 0) {
                System.out.println("Persamaan bersifat definit positif.");
            } else {
                System.out.println("Persamaan bersifat definit negatif.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU PROGRAM ===");
            System.out.println("1. Hitung Gaji Berdasarkan Golongan");
            System.out.println("2. Nilai & Kelulusan Mahasiswa");
            System.out.println("3. Analisis Persamaan Kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            System.out.println();

            switch (pilih) {
                case 1 -> hitungGaji(sc);
                case 2 -> nilaiMahasiswa(sc);
                case 3 -> persamaanKuadrat(sc);
                case 0 -> {
                    System.out.println("Program selesai.");
                    running = false;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }

        sc.close();
    }
}
