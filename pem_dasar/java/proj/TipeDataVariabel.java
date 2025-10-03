import java.util.Scanner;

public class TipeDataVariabel {
    static Scanner data = new Scanner(System.in);
    public static void main(String[] args) {
        String nama; 
        // nama = "Isaiah Tino";
        int umur, tahunLahir;
        // tahunLahir = 2007;
        // umur = 2025 - tahunLahir;
        double ipk;
        char kelas;
        boolean mhsAktif;

        System.out.print("Masukkan Nama: ");
        nama = data.nextLine();
        System.out.print("Masukkan tahun lahir: ");
        tahunLahir = data.nextInt();
        data.nextLine();
        System.out.print("Masukkan IPK: ");
        ipk = data.nextDouble();
        data.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = data.next().charAt(0);
        data.nextLine();
        System.out.print("Mahasiswa aktif?: ");
        mhsAktif = data.nextBoolean();
        data.nextLine();

        umur = 2025 - tahunLahir;

        System.out.println("Halo, nama saya " + nama + ". ");
        System.out.println("Saya lahir pada tahun " + tahunLahir + " dan sekarang berumur " + umur + ". ");
        System.out.println("Saya adalah mahasiswa kelas " + kelas + " dengan IPK " + ipk);
        System.out.println("Mahasiswa aktif? " + mhsAktif);

        // System.out.println("Nama saya " + nama);
        // System.out.println("Tahun lahir " + tahunLahir);
        // System.out.println("Umur saya " + umur + " tahun");
        // System.out.println("IPK: " + ipk);
        // System.out.println("Kelas: " + kelas);
        // System.out.println("Status keaktifan: " + mhsAktif);
        // System.out.println("Dua tahun lagi umur saya " + (umur + 2) + " tahun");

        // int tigaTahunLalu = umur - 3;
        // System.out.println("Tiga tahun lalu umur saya " + tigaTahunLalu + " tahun");
        
    }
}
