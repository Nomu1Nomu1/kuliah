import java.util.Scanner;

public class RataRataBerbobot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Matematika: ");
        double nilaiMat = input.nextDouble();
        System.out.print("Masukkan nilai Algoritma: ");
        double nilaiAlgo = input.nextDouble();

        int sksMat = 2;
        int sksAlgo = 3;

        double rataBerbobot = ((nilaiMat * sksMat) + (nilaiAlgo * sksAlgo) / (sksMat + sksAlgo));

        System.out.println("Rata-rata berbobor Math dan Algoritma: " + rataBerbobot);
    }
}
