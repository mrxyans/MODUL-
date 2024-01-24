package modul8;

public class Main {
    public static void main (String[] args){
        Lingkaran A = new Lingkaran();
        A.JariJari = 19;
        A.tampilHasil();
        
        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 10;
        B.lebar = 5;
        B.tampilHasil();
        
        Segitiga C = new Segitiga();
        C.alas =12;
        C.tinggi = 8;
        C.tampilHasil();

        Persegi D = new Persegi();
        D.sisi = 2;
        D.tampilHasil();
    }
}
