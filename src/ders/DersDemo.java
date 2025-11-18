import ders.Ders;
import ders.Day;
import ders.Program;

void main() {
    // 5 günlük program oluştur
    Program program = new Program();

    // PAZARTESİ - 8 ders
    Day pazartesi = new Day("Pazartesi");
    pazartesi.dersEkle(new Ders("Matematik", "Ahmet Yılmaz", "Sayfa 45-50 alıştırmalar", 85, 90));
    pazartesi.dersEkle(new Ders("Fizik", "Ayşe Demir", "Deney raporu hazırla", 78, 82));
    pazartesi.dersEkle(new Ders("Kimya", "Mehmet Kaya", "Periyodik tablo çalış", 92, 88));
    pazartesi.dersEkle(new Ders("Türkçe", "Fatma Şahin", "Kitap özeti yaz", 80, 85));
    pazartesi.dersEkle(new Ders("İngilizce", "Can Öztürk", "Unit 5 kelimeler", 95, 93));
    pazartesi.dersEkle(new Ders("Tarih", "Zeynep Arslan", "Osmanlı dönemi araştır", 88, 86));
    pazartesi.dersEkle(new Ders("Coğrafya", "Ali Yıldız", "Harita çalışması", 75, 80));
    pazartesi.dersEkle(new Ders("Beden Eğitimi", "Murat Koç", "Kondisyon çalışması", 90, 92));
    program.gunEkle(pazartesi);

    // SALI - 8 ders
    Day sali = new Day("Salı");
    sali.dersEkle(new Ders("Matematik", "Ahmet Yılmaz", "Geometri problemleri", 82, 88));
    sali.dersEkle(new Ders("Biyoloji", "Elif Çelik", "Hücre bölünmesi", 90, 87));
    sali.dersEkle(new Ders("Edebiyat", "Hasan Aydın", "Şiir analizi", 85, 89));
    sali.dersEkle(new Ders("İngilizce", "Can Öztürk", "Grammar exercises", 91, 94));
    sali.dersEkle(new Ders("Fizik", "Ayşe Demir", "Hareket konusu", 76, 79));
    sali.dersEkle(new Ders("Müzik", "Deniz Kara", "Nota çalışması", 88, 90));
    sali.dersEkle(new Ders("Resim", "Selin Beyaz", "Perspektif çizimi", 92, 95));
    sali.dersEkle(new Ders("Bilgisayar", "Kemal Şen", "Java programlama", 98, 96));
    program.gunEkle(sali);

    // ÇARŞAMBA - 8 ders
    Day carsamba = new Day("Çarşamba");
    carsamba.dersEkle(new Ders("Kimya", "Mehmet Kaya", "Asit-baz dengesi", 87, 85));
    carsamba.dersEkle(new Ders("Matematik", "Ahmet Yılmaz", "İntegral çalışması", 89, 91));
    carsamba.dersEkle(new Ders("Tarih", "Zeynep Arslan", "Cumhuriyet dönemi", 84, 88));
    carsamba.dersEkle(new Ders("Felsefe", "Oğuz Tan", "Mantık kuralları", 80, 82));
    carsamba.dersEkle(new Ders("Coğrafya", "Ali Yıldız", "İklim tipleri", 78, 81));
    carsamba.dersEkle(new Ders("Biyoloji", "Elif Çelik", "Genetik", 93, 90));
    carsamba.dersEkle(new Ders("Türkçe", "Fatma Şahin", "Kompozisyon yazma", 86, 84));
    carsamba.dersEkle(new Ders("Beden Eğitimi", "Murat Koç", "Basketbol", 88, 90));
    program.gunEkle(carsamba);

    // PERŞEMBE - 8 ders
    Day persembe = new Day("Perşembe");
    persembe.dersEkle(new Ders("Fizik", "Ayşe Demir", "Elektrik akımı", 85, 87));
    persembe.dersEkle(new Ders("İngilizce", "Can Öztürk", "Reading comprehension", 94, 92));
    persembe.dersEkle(new Ders("Matematik", "Ahmet Yılmaz", "Türev uygulamaları", 91, 89));
    persembe.dersEkle(new Ders("Edebiyat", "Hasan Aydın", "Roman incelemesi", 83, 86));
    persembe.dersEkle(new Ders("Kimya", "Mehmet Kaya", "Organik kimya", 88, 90));
    persembe.dersEkle(new Ders("Din Kültürü", "Aylin Güneş", "İslam tarihi", 82, 85));
    persembe.dersEkle(new Ders("Bilgisayar", "Kemal Şen", "Veri yapıları", 96, 98));
    persembe.dersEkle(new Ders("Müzik", "Deniz Kara", "Ritim çalışması", 87, 89));
    program.gunEkle(persembe);

    // CUMA - 8 ders
    Day cuma = new Day("Cuma");
    cuma.dersEkle(new Ders("Biyoloji", "Elif Çelik", "Ekosistem", 89, 91));
    cuma.dersEkle(new Ders("Tarih", "Zeynep Arslan", "Dünya savaşları", 86, 84));
    cuma.dersEkle(new Ders("Matematik", "Ahmet Yılmaz", "Haftalık değerlendirme", 90, 92));
    cuma.dersEkle(new Ders("Türkçe", "Fatma Şahin", "Dil bilgisi testleri", 81, 83));
    cuma.dersEkle(new Ders("Coğrafya", "Ali Yıldız", "Nüfus ve yerleşme", 77, 79));
    cuma.dersEkle(new Ders("Felsefe", "Oğuz Tan", "Etik ve ahlak", 85, 87));
    cuma.dersEkle(new Ders("Resim", "Selin Beyaz", "Sulu boya tekniği", 94, 96));
    cuma.dersEkle(new Ders("Beden Eğitimi", "Murat Koç", "Voleybol", 89, 91));
    program.gunEkle(cuma);

    // Programı göster
    program.programiGoster();

    // En yüksek ortalamalı günü göster
    program.enYuksekOrtalamaGoster();

    // Yüksek notlu dersleri göster
    program.yuksekNotluDersleriGoster(90.0);
}
