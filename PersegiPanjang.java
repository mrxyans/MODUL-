package modul8;

public class PersegiPanjang extends BangunDatar implements Keliling {
    public int panjang;
    public int lebar;

    @Override
    public double hitungLuas(){
        return this.panjang * this.lebar;
    }
    @Override
    public double hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
    }
    @Override
    public void tampilHasil(){
        System.out.println("Persegi Panjang");
        System.out.println("----------");
        System.out.println("Luasnya" + this.hitungLuas());
        System.out.println("Kelilingnya" + this.hitungKeliling());
    }
}
