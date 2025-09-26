import java.util.Scanner;

public class InputScanner {
    static Scanner data = new Scanner (System.in);
    public static void main(String[] args) {
        int umur;
        double tinggi;
        String nama;
        char jk;
        boolean aktif;

        System.out.print("Masukkan umur anda: ");
        umur = data.nextInt();
        data.nextLine();
        System.out.print("Masukkan nama anda: ");
        nama = data.nextLine();
        System.out.print("Masukkan tinggi badan anda (meter): ");
        tinggi = data.nextDouble();
        data.nextLine();
        System.out.print("Masukkan jenis kelamin (L/P): ");
        jk = data.next().charAt(0);
        data.nextLine();
        System.out.print("Aktif ? : ");
        aktif = data.nextBoolean();
        data.nextLine();
        System.out.println(nama + " mempunyai umur " + umur + " tinggi " + tinggi);
        System.out.println("Jenis kelamin " + jk + " Status aktif " + aktif);
    }
}
