public class PencarianDataPeringkat {
    public static void main(String[] args) {
        try {
            String [] d = new String [5] ;
            d [0] = "Zakia";
            d [1] = "Elisabeth";
            d [2] = "Sultan";
            d [3] = "Paulus";
            d [4] = "Ruswan";
            //simulator
            int i = 8;
            int indexCari = i -1;
            System.out.println("Nama pada peringkat ke-" + i + " adalah " + d [indexCari]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nama tidak ditemukan!" + e.getMessage());
        }
    }
}

