static class Ders {
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

void main() {
    Ders ders1 = new Ders(
            "Matematik",
            "Ahmet Yılmaz",
            "Sayfa 45-50 alıştırmalar",
            85,
            90
    );

    Ders ders2 = new Ders(
            "Fizik",
            "Ayşe Demir",
            "Deney raporu hazırla",
            78,
            82
    );

    Ders ders3 = new Ders(
            "Kimya",
            "Mehmet Kaya",
            "Periyodik tablo çalış",
            92,
            88
    );

    Ders ders4 = new Ders(
            "Türkçe",
            "Fatma Şahin",
            "Kitap özeti yaz",
            80,
            85
    );

    Ders ders5 = new Ders(
            "İngilizce",
            "Can Öztürk",
            "Unit 5 kelimeler",
            95,
            93
    );

    System.out.println("=== Ders Listesi ===\n");
    System.out.println("1. " + ders1);
    System.out.println("2. " + ders2);
    System.out.println("3. " + ders3);
    System.out.println("4. " + ders4);
    System.out.println("5. " + ders5);

    System.out.println("\n=== Detaylı Bilgi ===");
    System.out.println(ders1.getDetaylar());

    Ders[] tumDersler = {ders1, ders2, ders3, ders4, ders5};

    System.out.println("\n=== Ortalaması 85'in Üzerinde Olan Dersler ===");
    for (Ders ders : tumDersler) {
        if (ders.getOrtalama() >= 85) {
            System.out.println("- " + ders);
        }
    }

    Ders enYuksekDers = tumDersler[0];
    for (Ders ders : tumDersler) {
        if (ders.getOrtalama() > enYuksekDers.getOrtalama()) {
            enYuksekDers = ders;
        }
    }

    System.out.println("\n=== En Yüksek Ortalamalı Ders ===");
    System.out.println(enYuksekDers + " (Yazılı: " + enYuksekDers.getYaziliNotu() + ", Sözlü: " + enYuksekDers.getSozluNotu() + ")");
}
