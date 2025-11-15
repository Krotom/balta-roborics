void main() {
        double kenar = 5.0;
        double yukseklik = Math.sqrt(kenar * kenar - (kenar / 2) * (kenar / 2));
        double alan = (kenar * yukseklik) / 2;
        double cevre = kenar * 3;
        IO.println("Üçgenin Alanı: " + alan);
        IO.println("Üçgenin Çevresi: " + cevre);
}
