import java.util.Scanner;

public class Latihan2 {
    public static void alg1(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menghitung N Faktorial ===");
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        long faktorial = 1;
        System.out.print(n + "! = ");
        
        for (int i = n; i >= 1; i--) {
            faktorial *= i;
            System.out.print(i);
            if (i > 1) System.out.print(" x ");
        }
        
        System.out.println(" = " + faktorial + "\n");
    }
    public static void alg2(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menghitung X Pangkat Y ===");
        System.out.print("Masukkan nilai X (bilangan pokok): ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai Y (pangkat): ");
        int y = input.nextInt();
        
        long hasil = 1;
        System.out.print(x + "^" + y + " = ");
        
        for (int i = 1; i <= y; i++) {
            hasil *= x;
            System.out.print(x);
            if (i < y) System.out.print(" x ");
        }
        
        System.out.println(" = " + hasil + "\n");
    }
    public static void alg3(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Jumlah Deret Geometri ===");
        System.out.print("Masukkan suku pertama (a): ");
        double a = input.nextDouble();
        System.out.print("Masukkan rasio (r): ");
        double r = input.nextDouble();
        System.out.print("Masukkan jumlah suku (n): ");
        int n = input.nextInt();
        
        double jumlah = 0;
        System.out.print("Deret: ");
        
        for (int i = 1; i <= n; i++) {
            double rPangkat = 1;
            for (int j = 1; j < i; j++) {
                rPangkat *= r;
            }
            
            double un = a * rPangkat;
            jumlah += un;
            
            System.out.print(un);
            if (i < n) System.out.print(" + ");
        }
        
        System.out.println(" = " + jumlah + "\n");
    }
    public static void alg4(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menghitung KPK ===");
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        
        int a = bil1;
        int b = bil2;
        int temp;
        
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        int x = a;
        
        int kpk = (bil1 * bil2) / x;
        
        System.out.println("KPK(" + bil1 + ", " + bil2 + ") = " + kpk);
        System.out.println("Rumus: KPK = (" + bil1 + " x " + bil2 + ") ÷ " + x + " = " + kpk + "\n");
    }
    public static void alg5(){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menghitung FPB (Algoritma Euclid) ===");
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        
        int a = bil1;
        int b = bil2;
        int temp;
        
        System.out.println("\nProses perhitungan:");
        System.out.println("a = " + a + ", b = " + b);
        
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
            System.out.println("a = " + a + ", b = " + b);
        }
        
        System.out.println("\nFPB(" + bil1 + ", " + bil2 + ") = " + a + "\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("1. Menghitung N Faktorial (n!)");
            System.out.println("2. Menghitung X Pangkat Y (X^Y)");
            System.out.println("3. Jumlah Deret Geometri");
            System.out.println("4. Menghitung KPK dari 2 bilangan");
            System.out.println("5. Menghitung FPB dari 2 bilangan");
            System.out.println("0. Keluar");
            System.out.print("\nPilih menu (0-5): ");
            pilihan = input.nextInt();
            System.out.println();
            
            switch (pilihan) {
                case 1: alg1(); break;
                case 2: alg2(); break;
                case 3: alg3(); break;
                case 4: alg4(); break;
                case 5: alg5(); break;
                case 0: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid!\n");
            }
        } while (pilihan != 0);
        
        input.close();
    }
}
