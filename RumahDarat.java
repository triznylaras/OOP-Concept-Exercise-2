abstract class HewanDarat{
    public abstract int jumlahKucing(int Persia, int Himalaya, int Kampung);
    public abstract int jumlahKelinci(int Lembang, int Bogor);

    public void disp(){
        System.out.println("Ini jumlah Hewan Darat");
    }
}
public class RumahDarat extends HewanDarat{
    public int jumlahKucing(int Persia, int Himalaya, int Kampung){
        return Persia+Himalaya+Kampung;
    }
    public int jumlahKelinci(int Lembang, int Bogor){
        return Lembang+Bogor;
    }
    public static void main(String[] args){
        RumahDarat obj = new RumahDarat();
        obj.disp();
        System.out.println("Kucing: " + obj.jumlahKucing(10, 5, 15));
        System.out.println("Kelinci: " + obj.jumlahKelinci(20, 10));
    }
}