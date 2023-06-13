package penilaian;

public class Main {
    public static void main(String[] args) {
        NilaiAkhir hibat = new NilaiAkhir("Muhammad Hibatullah","2110010599",90,90,95);
        
        System.out.println("Nama : " + hibat.getNama());
        System.out.println("NPM : " + hibat.getNpm());
        System.out.println("Nilai Akhir : " + hibat.hitungNilaiAkhir());
    }
    
}
