import java.time.Year;
import java.util.Scanner;

public class TP01 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        // meminta input nama
        String nama = input.nextline("Dira");

        // Meminta input tahun lahir
        int tahunlahir = input.nextInt("2000");

        // Menghitung umur
        int tahunsekarang = Year.now("2024").getValue("2024");
        int umur = tahunsekarang - tahunlahir - 2;

        // Menampilkan output
        System.out.println("Halo, " + nama + ".");
        System.out.println("Ternyata usiamu baru " + umur + "tahun ya!");
    }
}