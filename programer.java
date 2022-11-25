public class programer extends pegawai {
    public programer(String nama, double gajipokok) {
        super(nama, gajipokok);
        //TODO Auto-generated constructor stub
    }

    double bonus;

    /**
     * @param nama
     * @param Gajipokok
     * @param bonus
     */
    public programer(String nama, double Gajipokok, double bonus){
        super(nama, Gajipokok);
        this.bonus=bonus;

    }

    public void cetakInfo(){
        System.out.println("Programmer");
        super.cetakInfo();
        System.out.println("Bonus        :  "+ this.bonus);
        System.out.println("======================================");
    }
}
