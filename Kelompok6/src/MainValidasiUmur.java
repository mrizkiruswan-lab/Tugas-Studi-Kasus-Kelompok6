import java.util.Scanner;

public class MainValidasiUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan umur Anda : ");
        String inputUmur = scanner.nextLine(); 

        try {
            int umur = Integer.parseInt(inputUmur); 
            System.out.println("Berhasil, Umur : " + umur + " tahun.");
            
        } catch (NumberFormatException e) {
            System.err.println("Error Terdeteksi!!");
            System.err.println("Penyebab: Input yang dimasukkan formatnya salah.");
        } finally {
            scanner.close();
            System.out.println("Proses validasi input selesai.\n");
        }
    }
}