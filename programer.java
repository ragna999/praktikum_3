public class programer extends pegawai {
    private Object Tunjangan = null;
    double bonus;

    public void setbonus(double bonus){
        this.bonus = bonus; 
    }

    public double getbonus(){
        return this.bonus;
    }
    public void cetakinfo (){
        super.cetakinfo();
    }

    public void cetakTunjangan(){
        Tunjangan = 3500000;
        System.out.println("Tunjangan : Rp. " + this.Tunjangan);
    }
    
    public void cetakbonus(){
        bonus = 4000000.00;
        System.out.println("bonus : Rp." + this.bonus);
    }
}
