package modul8;

public class Persegi extends BangunDatar{
    public int sisi;

    @Override
    public double hitungLuas(){
        return this.sisi * this. sisi;
    }
    @Override
    public void tampilHasil(){
        System.out.println("Persegi");
        System.out.println("-------");
        System.out.println("Luasnya = " + this.hitungLuas());
    }
}
