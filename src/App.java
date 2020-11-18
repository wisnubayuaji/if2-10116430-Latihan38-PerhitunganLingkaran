/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
public class App {
    public static void main(String[] args) throws Exception {
        String d;
        double diameter; //operand
        Scanner scn = new Scanner(System.in);
        Lingkaran circle = new Lingkaran();
        
        System.out.println("===Perhitungan Lingkaran===");
        
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scn.nextLine();
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        
        System.out.println("===Hasil Perhitungan Lingkaran===");
        diameter = Double.parseDouble(d); 
        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",circle.jari2Lingkaran(diameter));
        System.out.printf("Luas Lingkaran = %.2f cm %n",circle.luasLingkaran(circle.jari2Lingkaran(diameter)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",circle.kelilingLingkaran(circle.jari2Lingkaran(diameter)));
    }
}
