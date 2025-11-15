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

    public int getYaziliNotu() {
        return yaziliNotu;
    }

    public int getSozluNotu() {
        return sozluNotu;
    }

    public double getOrtalama() {
        return (yaziliNotu + sozluNotu) / 2.0;
    }

    public String getDetaylar() {
        return String.format("""
                Ders Bilgileri:
                - Ders Adı: %s
                - Öğretmen: %s
                - Ödev: %s
                - Yazılı Notu: %d
                - Sözlü Notu: %d
                - Ortalama: %.1f
                """, dersAdi, ogretmen, odev, yaziliNotu, sozluNotu, getOrtalama());
    }

    @Override
    public String toString() {
        return String.format("%s - %s (Ortalama: %.1f)", dersAdi, ogretmen, getOrtalama());
    }
}
