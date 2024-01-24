package modul8;

public class Lingkaran extends BangunDatar implements Keliling {
    public int JariJari;

    @Override
    public double hitungLuas(){
        return Math.PI * this.JariJari * this.JariJari;
    }
    @Override
    public double hitungKeliling(){
        return 2 * Math.PI * this.JariJari;
    }
    @Override
    public void tampilHasil(){
        System.out.println("Lingkaran");
        System.out.println("---------");
        System.out.println("Luasnya = " + this.hitungLuas());
        System.out.println("Kelilingnya = " + this.hitungKeliling());
    }
}
