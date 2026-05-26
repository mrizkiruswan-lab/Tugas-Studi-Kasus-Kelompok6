public class RekeningBank {
    private double saldo;

    public RekeningBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    public void tarikUang(double jumlah)
            throws InsufficientBalanceException {
        if (jumlah > saldo) {
            throw new InsufficientBalanceException(
                "Saldo tidak cukup! Saldo: Rp " + saldo
                + ", Tarik: Rp " + jumlah
            );
        }
        saldo -= jumlah;
        System.out.println("Berhasil menarik Rp " + jumlah);
        System.out.println("Sisa saldo: Rp " + saldo);
    }

    public static void main(String[] args) {
        RekeningBank rekening = new RekeningBank(200000);

        try {
            rekening.tarikUang(500000); // melebihi saldo
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaksi gagal: " + e.getMessage());
        }
    }
}