import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.next();
        int tahunlahir = input.nextInt();
        int umur = 2024 - tahunlahir;

        System.out.println("Halo " + nama + "!");
        System.out.println("ternyata usiamu baru" + umur + "tahun ya!");
    }
}