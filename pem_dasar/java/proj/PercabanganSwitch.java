import java.util.Scanner;

public class PercabanganSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            int pilih;
            System.out.println("Pilih Menu: ");
            System.out.println("1. Bakso");
            System.out.println("2. Soto");
            System.out.println("3. Gado-Gado");
            System.out.print("Masukkan pilihan anda: ");
            pilih = scanner.nextInt();
            String namaMenu = "Tidak memilih";
            int harga = 0;    
    
            switch (pilih) {
                case 1:
                    namaMenu = "Bakso";
                    harga = 10000;
                    break;
                case 2:
                    namaMenu = "Soto";
                    harga = 5000;
                    break;
                case 3:
                    namaMenu = "Gado-gado";
                    harga = 7000;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
            System.out.println("Nama menu " + namaMenu + " dengan harga " + harga);
        }

    }
}
