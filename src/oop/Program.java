package oop;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private final List<Day> gunler;

    public Program() {
        this.gunler = new ArrayList<>();
    }

    public void gunEkle(Day gun) {
        gunler.add(gun);
    }

    public double getHaftalikOrtalama() {
        if (gunler.isEmpty()) {
            return 0.0;
        }
        double toplam = 0;
        for (Day gun : gunler) {
            toplam += gun.getGunlukOrtalama();
        }
        return toplam / gunler.size();
    }

    public void programiGoster() {
        IO.println("\n╔════════════════════════════════════════════════════════════╗");
        IO.println("║           5 GÜNLÜK DERS PROGRAMI                           ║");
        IO.println("╚════════════════════════════════════════════════════════════╝");

        for (Day gun : gunler) {
            gun.dersleriGoster();
        }

        IO.println("\n" + "=".repeat(60));
        IO.println("HAFTALIK ÖZET");
        IO.println("=".repeat(60));
        IO.println("Toplam Gün Sayısı: " + gunler.size());
        int toplamDers = 0;
        for (Day gun : gunler) {
            toplamDers += gun.getDersSayisi();
        }
        IO.println("Toplam Ders Sayısı: " + toplamDers);
        IO.println("Haftalık Ortalama: " + String.format("%.1f", getHaftalikOrtalama()));
        IO.println("=".repeat(60));
    }

    public void enYuksekOrtalamaGoster() {
        if (gunler.isEmpty()) {
            IO.println("Program boş!");
            return;
        }

        Day enYuksekGun = gunler.getFirst();
        for (Day gun : gunler) {
            if (gun.getGunlukOrtalama() > enYuksekGun.getGunlukOrtalama()) {
                enYuksekGun = gun;
            }
        }

        IO.println("\n=== En Yüksek Ortalamalı Gün ===");
        IO.println(enYuksekGun);
    }

    public void yuksekNotluDersleriGoster(double minOrtalama) {
        IO.println("\n=== Ortalaması " + minOrtalama + " ve Üzeri Olan Dersler ===");
        for (Day gun : gunler) {
            boolean baslikYazildi = false;
            for (Ders ders : gun.getDersler()) {
                if (ders.getOrtalama() >= minOrtalama) {
                    if (!baslikYazildi) {
                        IO.println("\n" + gun.getGunAdi() + ":");
                        baslikYazildi = true;
                    }
                    IO.println("  - " + ders);
                }
            }
        }
    }
}
