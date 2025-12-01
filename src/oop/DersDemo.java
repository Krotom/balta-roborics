import oop.Ders;
import oop.Day;
import oop.Program;

void main() {
    Program program = new Program();

    Ders matematik = new Ders("Matematik", "Ahmet Yılmaz", "Sayfa 45-50 alıştırmalar", 85, 90);
    Ders fizik = new Ders("Fizik", "Ayşe Demir", "Deney raporu hazırla", 78, 82);
    Ders kimya = new Ders("Kimya", "Mehmet Kaya", "Periyodik tablo çalış", 92, 88);
    Ders turkce = new Ders("Türkçe", "Fatma Şahin", "Kitap özeti yaz", 80, 85);
    Ders ingilizce = new Ders("İngilizce", "Can Öztürk", "Unit 5 kelimeler", 95, 93);
    Ders tarih = new Ders("Tarih", "Zeynep Arslan", "Osmanlı dönemi araştır", 88, 86);
    Ders cografya = new Ders("Coğrafya", "Ali Yıldız", "Harita çalışması", 75, 80);
    Ders bedenEgitimi = new Ders("Beden Eğitimi", "Murat Koç", "Kondisyon çalışması", 90, 92);
    Ders biyoloji = new Ders("Biyoloji", "Elif Çelik", "Hücre bölünmesi", 90, 87);
    Ders edebiyat = new Ders("Edebiyat", "Hasan Aydın", "Şiir analizi", 85, 89);
    Ders muzik = new Ders("Müzik", "Deniz Kara", "Nota çalışması", 88, 90);
    Ders resim = new Ders("Resim", "Selin Beyaz", "Perspektif çizimi", 92, 95);
    Ders bilgisayar = new Ders("Bilgisayar", "Kemal Şen", "Java programlama", 98, 96);
    Ders felsefe = new Ders("Felsefe", "Oğuz Tan", "Mantık kuralları", 80, 82);
    Ders dinKulturu = new Ders("Din Kültürü", "Aylin Güneş", "İslam tarihi", 82, 85);

    // PAZARTESİ - 8 ders
    Day pazartesi = new Day("Pazartesi");
    pazartesi.dersEkle(matematik);
    pazartesi.dersEkle(fizik);
    pazartesi.dersEkle(kimya);
    pazartesi.dersEkle(turkce);
    pazartesi.dersEkle(ingilizce);
    pazartesi.dersEkle(tarih);
    pazartesi.dersEkle(cografya);
    pazartesi.dersEkle(bedenEgitimi);
    program.gunEkle(pazartesi);

    // SALI - 8 ders
    Day sali = new Day("Salı");
    sali.dersEkle(matematik);
    sali.dersEkle(biyoloji);
    sali.dersEkle(edebiyat);
    sali.dersEkle(ingilizce);
    sali.dersEkle(fizik);
    sali.dersEkle(muzik);
    sali.dersEkle(resim);
    sali.dersEkle(bilgisayar);
    program.gunEkle(sali);

    // ÇARŞAMBA - 8 ders
    Day carsamba = new Day("Çarşamba");
    carsamba.dersEkle(kimya);
    carsamba.dersEkle(matematik);
    carsamba.dersEkle(tarih);
    carsamba.dersEkle(felsefe);
    carsamba.dersEkle(cografya);
    carsamba.dersEkle(biyoloji);
    carsamba.dersEkle(turkce);
    carsamba.dersEkle(bedenEgitimi);
    program.gunEkle(carsamba);

    // PERŞEMBE - 8 ders
    Day persembe = new Day("Perşembe");
    persembe.dersEkle(fizik);
    persembe.dersEkle(ingilizce);
    persembe.dersEkle(matematik);
    persembe.dersEkle(edebiyat);
    persembe.dersEkle(kimya);
    persembe.dersEkle(dinKulturu);
    persembe.dersEkle(bilgisayar);
    persembe.dersEkle(muzik);
    program.gunEkle(persembe);

    // CUMA - 8 ders
    Day cuma = new Day("Cuma");
    cuma.dersEkle(biyoloji);
    cuma.dersEkle(tarih);
    cuma.dersEkle(matematik);
    cuma.dersEkle(turkce);
    cuma.dersEkle(cografya);
    cuma.dersEkle(felsefe);
    cuma.dersEkle(resim);
    cuma.dersEkle(bedenEgitimi);
    program.gunEkle(cuma);

    // Programı göster
    program.programiGoster();

    // En yüksek ortalamalı günü göster
    program.enYuksekOrtalamaGoster();

    // Yüksek notlu dersleri göster
    program.yuksekNotluDersleriGoster(90.0);
}
