interface myInterface{
    public int jumlahIkan();
    public int jumlahKura2();
}
class HewanAir implements myInterface{
    public int jumlahIkan(int Mas, int Louhan, int Sapu2){
        return Mas+Louhan+Sapu2;
    }
    public int jumlahKura2(int Muda, int Tua){
        return Muda+Tua;
    }
    public static void main(String[] args){
        HewanAir obj = new HewanAir();
        System.out.println("Ini jumlah Hewan Air");
        System.out.println("Ikan: " + obj.jumlahIkan(10, 5, 15));
        System.out.println("Kura-kura: " + obj.jumlahKura2(20, 10));
    }
}