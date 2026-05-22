public class DataKosongNull {
    private String namaLengkap;

    public DataKosongNull(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    public void formatNamaPengguna() {
        if (this.namaLengkap != null) {
            this.namaLengkap = this.namaLengkap.toUpperCase();
            System.out.println("Nama (Formatted): " + this.namaLengkap);
        } else {
            this.namaLengkap = "PENGGUNA BARU";
            System.out.println("Nama (Fallback): " + this.namaLengkap);
        }
        
    }
}