public class pegawai {
    String nama;
    double Gajipokok;

    public void setnama(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return this.nama;
    }
    public void setGajipokok(double Gajipokok){
        this.Gajipokok = Gajipokok;
    }
    public double getGajipokok(){
        return this.Gajipokok;
    }
    public void cetakinfo(){
        System.out.println("nama :" + this.nama);
        System.out.println("Gaji pokok : Rp." + this.Gajipokok);

    }
}
