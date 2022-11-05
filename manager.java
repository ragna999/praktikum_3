public class manager extends pegawai {
    private Object bonus = null;
    double Tunjangan;

    public void setTunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
    }

    public double getTunjangan(){
        return this.Tunjangan;
    }
    
    public void cetakinfo(){
        super.cetakinfo();
    }

    public void cetakTunjangan(){
        Tunjangan = 4000000;
        System.out.println("Tunjangan : Rp. " + this.Tunjangan);
    }
    public void cetakbonus(){
        bonus = 7000000;
        System.out.println("bonus : Rp." + this.bonus);
    }
}
