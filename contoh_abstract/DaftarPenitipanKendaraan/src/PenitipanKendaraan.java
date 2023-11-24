abstract class PenitipanKendaraan {
    public String namapemilik;
    public String NIK;
    public String noHP;
    public String asal;
    public String stnk;

    public void CaraPenitipan(){
        System.out.println("Cara penitipan kendaraan :");
    }

    public void CaraPenitipan(String metode){
        System.out.println("Cara penitipan kendaraan menggunakan metode: " + metode);
    }

    public abstract void SyaratPenitipan();
}
