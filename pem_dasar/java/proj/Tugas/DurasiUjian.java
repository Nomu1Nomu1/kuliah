import java.util.Scanner;

public class DurasiUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam mulai: ");
        int jamMulai = input.nextInt();
        System.out.print("Masukkan menit mulai: ");
        int menitMulai = input.nextInt();
        System.out.print("Masukkan detik mulai: ");
        int detikMulai = input.nextInt();

        System.out.print("Masukkan jam berakhir: ");
        int jamBerakhir = input.nextInt();
        System.out.print("Masukkan menit berakhir: ");
        int menitBerakhir = input.nextInt();
        System.out.print("Masukkan detik berakhir: ");
        int detikBerakhir = input.nextInt();

        int totalMulai = jamMulai * 3600 + menitMulai * 60 + detikMulai;
        int totalBerakhir = jamBerakhir * 3600 + menitBerakhir * 60 + detikBerakhir;

        int durasi = totalBerakhir - totalMulai;

        int jam = durasi / 3600;
        int sisa = durasi % 3600;
        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("Durasi ujian: " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}
