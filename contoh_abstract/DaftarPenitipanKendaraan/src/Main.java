public class Main {
    public static void main(String[] args) {
        PenitipanMobil mobil = new PenitipanMobil();
        PenitipanMotor motor = new PenitipanMotor();
        PenitipanSepeda sepeda = new PenitipanSepeda();

        System.out.println("-----PENITIPAN MOBIL-----");
        mobil.CaraPenitipan();
        mobil.CaraPenitipan("Metode A"); 

        mobil.SyaratPenitipan();

        System.out.println("-----PENITIPAN MOTOR-----");
        motor.CaraPenitipan();
        motor.CaraPenitipan("Metode B"); 

        motor.SyaratPenitipan();

        System.out.println("-----PENITIPAN SEPEDA-----");
        sepeda.CaraPenitipan();
        sepeda.CaraPenitipan("Metode C"); 

        sepeda.SyaratPenitipan();
    }
}
