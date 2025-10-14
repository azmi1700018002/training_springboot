class Mesin {
    public void nyalakanMesin() {
        System.out.println("Mesin dinyalakan");
    }
}

// mesin listrik
class MesinListrik{
    public void nyalakanMesin() {
        System.out.println("Mesin listrik dinyalakan");
    }
}

class Mobil {
    // buat mesin
    private Mesin mesin = new Mesin();

    // jalankan mobil
    public void jalan(){
        mesin.nyalakanMesin();
        System.out.println("Mobil berjalan");
    }
}

public class TanpaDI {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.jalan();
    }
}