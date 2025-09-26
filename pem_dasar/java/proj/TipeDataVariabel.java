public class TipeDataVariabel {
    public static void main(String[] args) {
        String nama; 
        nama = "Isaiah Tino"; 
        int umur, tahunLahir;
        tahunLahir = 2007;
        umur = 2025 - tahunLahir;
        double ipk = 3.5;
        char kelas = 'A';
        boolean mhsAktif = true;

        System.out.println("Nama saya " + nama);
        System.out.println("Tahun lahir " + tahunLahir);
        System.out.println("Umur saya " + umur + " tahun");
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
        System.out.println("Status keaktifan: " + mhsAktif);
        System.out.println("Dua tahun lagi umur saya " + (umur + 2) + " tahun");

        int tigaTahunLalu = umur - 3;
        System.out.println("Tiga tahun lalu umur saya " + tigaTahunLalu + " tahun");
    }
}
