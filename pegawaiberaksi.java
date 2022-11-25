public class pegawaiberaksi {
    public static void main (String[]args){
  // Membuat objek dan beri nilai
  pegawai john = new pegawai("imam", 3800000);
  manager suy= new manager ("ade", 4000000, 7000000);
  programer heri= new programer ("sutisna", 1000000);

  // Memanggil atribut
  john.cetakInfo();
  suy.cetakInfo();
  heri.cetakInfo();
    }
    
}
