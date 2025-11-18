package ders;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private final String gunAdi;
    private final List<Ders> dersler;

    public Day(String gunAdi) {
        this.gunAdi = gunAdi;
        this.dersler = new ArrayList<>();
    }

    public void dersEkle(Ders ders) {
        if (dersler.size() < 8) {
            dersler.add(ders);
        } else {
            System.out.println("Bir günde maksimum 8 ders olabilir!");
        }
    }

    public String getGunAdi() {
        return gunAdi;
    }

    public List<Ders> getDersler() {
        return new ArrayList<>(dersler);
    }

    public int getDersSayisi() {
        return dersler.size();
    }

    public double getGunlukOrtalama() {
        if (dersler.isEmpty()) {
            return 0.0;
        }
        double toplam = 0;
        for (Ders ders : dersler) {
            toplam += ders.getOrtalama();
        }
        return toplam / dersler.size();
    }

    public void dersleriGoster() {
        System.out.println("\n=== " + gunAdi + " ===");
        System.out.println("Ders Sayısı: " + dersler.size());
        System.out.println("Günlük Ortalama: " + String.format("%.1f", getGunlukOrtalama()));
        System.out.println("\nDersler:");
        for (int i = 0; i < dersler.size(); i++) {
            System.out.println((i + 1) + ". " + dersler.get(i));
        }
    }

    @Override
    public String toString() {
        return String.format("%s - %d ders (Ortalama: %.1f)", gunAdi, dersler.size(), getGunlukOrtalama());
    }
}
