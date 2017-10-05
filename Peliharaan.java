import java.util.*;

class petShop{
    private int jumlahHewan;
    private String jenisHewan1;
    private String jenisHewan2;
    private int jumlahKandang;
    
    public int getjumlahHewan(){
        return jumlahHewan;
    }
    public String getjenisHewan1(){
        return jenisHewan1;
    }
    public String getjenisHewan2(){
        return jenisHewan2;
    }
    public int getjumlahKandang(){
        return jumlahKandang;
    }
    public void setjumlahHewan(int newValue){
        jumlahHewan = newValue;
    }
    public void setjenisHewan1(String newValue){
        jenisHewan1 = newValue;
    }
    public void setjenisHewan2(String newValue){
        jenisHewan2 = newValue;
    }
    public void setjumlahKandang(int newValue){
        jumlahKandang = newValue;
    }
}
public class Peliharaan{
    public static void main(String[] args){
        petShop obj = new petShop();
        obj.setjumlahHewan(100);
        obj.setjenisHewan1("Hewan Darat");
        obj.setjenisHewan2("Hewan Air");
        obj.setjumlahKandang(150);
        System.out.println("Jumlah Hewan : " + obj.getjumlahHewan());
        System.out.println("Jenis Hewan : " + obj.getjenisHewan1() + " , " + obj.getjenisHewan2());
        System.out.println("Jumlah Kandang : " + obj.getjumlahKandang());
    }
}