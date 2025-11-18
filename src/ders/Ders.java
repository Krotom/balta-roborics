package ders;

public class Ders {
    private final String dersAdi;
    private final String ogretmen;
    private final String odev;
    private final int yaziliNotu;
    private final int sozluNotu;

    public Ders(String dersAdi, String ogretmen, String odev, int yaziliNotu, int sozluNotu) {
        this.dersAdi = dersAdi;
        this.ogretmen = ogretmen;
        this.odev = odev;
        this.yaziliNotu = yaziliNotu;
        this.sozluNotu = sozluNotu;
    }

    public double getOrtalama() {
        return (yaziliNotu + sozluNotu) / 2.0;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (Ortalama: %.1f, Odev: %s)", dersAdi, ogretmen, getOrtalama(), odev);
    }
}
