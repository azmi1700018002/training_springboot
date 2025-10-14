class Mesin {
    public void nyalakanMesin() {
        System.out.println("Mesin dinyalakan");
    }
}

class MesinListrik extends Mesin {
    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin listrik dinyalakan");
    }
}

// class mobil dengna DI
class Mobil {
    private Mesin mesin;

    // injeksi lewat konstruktor
    public Mobil(Mesin mesin) {
        this.mesin = mesin;
}

    public void jalan() {
        mesin.nyalakanMesin();
        System.out.println("Mobil berjalan");
    }
}

public class DenganDI {
    public static void main(String[] args) {
        // bikin mesin
        MesinBensin mesinBensin = new MesinBensin();
        MesinListrik mesinListrik = new MesinListrik();

        // buat mobil
        Mobil mobil1 = new Mobil(mesinBensin);
        Mobil mobil2 = new Mobil(mesinListrik);

        // jalankan
        mobil1.jalan();
        mobil2.jalan();
    }
}
