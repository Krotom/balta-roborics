package ders;

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
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║           5 GÜNLÜK DERS PROGRAMI                           ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");

        for (Day gun : gunler) {
            gun.dersleriGoster();
        }

        System.out.println("\n" + "=".repeat(60));
        System.out.println("HAFTALIK ÖZET");
        System.out.println("=".repeat(60));
        System.out.println("Toplam Gün Sayısı: " + gunler.size());
        int toplamDers = 0;
        for (Day gun : gunler) {
            toplamDers += gun.getDersSayisi();
        }
        System.out.println("Toplam Ders Sayısı: " + toplamDers);
        System.out.println("Haftalık Ortalama: " + String.format("%.1f", getHaftalikOrtalama()));
        System.out.println("=".repeat(60));
    }

    public void enYuksekOrtalamaGoster() {
        if (gunler.isEmpty()) {
            System.out.println("Program boş!");
            return;
        }

        Day enYuksekGun = gunler.getFirst();
        for (Day gun : gunler) {
            if (gun.getGunlukOrtalama() > enYuksekGun.getGunlukOrtalama()) {
                enYuksekGun = gun;
            }
        }

        System.out.println("\n=== En Yüksek Ortalamalı Gün ===");
        System.out.println(enYuksekGun);
    }

    public void yuksekNotluDersleriGoster(double minOrtalama) {
        System.out.println("\n=== Ortalaması " + minOrtalama + " ve Üzeri Olan Dersler ===");
        for (Day gun : gunler) {
            boolean baslikYazildi = false;
            for (Ders ders : gun.getDersler()) {
                if (ders.getOrtalama() >= minOrtalama) {
                    if (!baslikYazildi) {
                        System.out.println("\n" + gun.getGunAdi() + ":");
                        baslikYazildi = true;
                    }
                    System.out.println("  - " + ders);
                }
            }
        }
    }
}
