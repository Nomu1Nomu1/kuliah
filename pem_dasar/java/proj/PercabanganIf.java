import java.util.Scanner;

public class PercabanganIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();
        System.out.println("Nilai Mhs: " + nilai);

        if (nilai <= 0) {
            System.out.println("Status mahasiswa tidak aktif");
        }

        String kelulusan;
        if (nilai >= 60) {
            System.out.println("Anda lulus");
            kelulusan = "Lulus";
        } else {
            System.out.println("Anda tidak lulus");
            kelulusan = "Tidak lulus";
        }

        System.out.println("Status kelulusan anda: " + kelulusan);

        char konversi;

        // if (nilai < 60) {
        //     konversi = 'C';
        // } else {
        //     if (nilai < 75) {
        //         konversi = 'B';
        //     } else {
        //         konversi = 'A';
        //     }
        // }

        if (nilai >= 85) {
            konversi = 'A';
        } else if (nilai >= 70) {
            konversi = 'B';
        } else if (nilai >= 60) {
            konversi = 'C';
        } else if(nilai >= 50){
            konversi = 'D';
        } else {
            konversi = 'E';
        }

        System.out.println("Nilai konversi: " + konversi);

        String statusNilai;

        // if (nilai >= 0 && nilai <= 100) {
        //     statusNilai = "Valid";
        // } else {
        //     statusNilai = "Tidak Valid";
        // }
        if (nilai < 0 || nilai > 100) {
            statusNilai = "Tidak Valid";
        } else {
            statusNilai = "Valid";
        }

        System.out.println("Status nilai: " + statusNilai);
    }
}
