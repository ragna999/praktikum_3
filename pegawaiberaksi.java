public class pegawaiberaksi {
    public static void main (String[]args){

        manager manager = new manager ();
        manager.nama = "rizky";
        manager.Gajipokok = 7000000;
        manager.cetakinfo();
        manager.cetakTunjangan();
        manager.cetakbonus();
        System.out.println("---------------------");
        programer programer = new programer();
        programer.nama = "ade" ;
        programer.Gajipokok = 6000000;
        programer.cetakinfo();
        programer.cetakbonus();
        programer.cetakTunjangan();
    }
    
}
