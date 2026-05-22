import java.util.Scanner;

public class KalkulatorPembagian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            // Input pembilang
            System.out.print("Masukkan angka pembilang : ");
            int pembilang = input.nextInt();

            // Input penyebut
            System.out.print("Masukkan angka penyebut  : ");
            int penyebut = input.nextInt();

            // Proses pembagian
            int hasil = pembilang / penyebut;

            // Output hasil
            System.out.println("Hasil pembagian = " + hasil);

        } catch (ArithmeticException e) {
            // Menangani error pembagian dengan nol
            System.out.println("Error: Penyebut tidak boleh 0!");
            System.out.println("Pesan Exception: " + e);

        } catch (Exception e) {
            // Menangani input selain angka
            System.out.println("Input harus berupa angka!");
        }

        input.close();
    }
}