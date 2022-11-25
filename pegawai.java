public class pegawai {
    String nama;
    double Gajipokok;


    public pegawai(String nama, double gajipokok){
        this.nama = nama;
        this.Gajipokok = gajipokok;
    }

    public void cetakInfo(){
        System.out.println("=======================================");
        System.out.println("Nama         : " + this.nama);
        System.out.println("Gaji POkok   : " + this.Gajipokok);
    }
}
