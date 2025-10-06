import java.util.Scanner;

public class TukarData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Setelah ditukar: a = " + a + ", b = " + b);
    }    
}
