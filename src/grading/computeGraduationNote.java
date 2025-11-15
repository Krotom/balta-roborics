void main() {
    double vizeNote = Double.parseDouble(IO.readln("Vize Notu: "));

    double finalNote = Double.parseDouble(IO.readln("Final Notu: "));

    double vizeMean = vizeNote * 0.4;

    double finalMean = finalNote * 0.6;

    double totalMean = vizeMean + finalMean;

    System.out.println("Toplam Not: " + totalMean);

    if (totalMean >= 75) {
        System.out.println("Geçti");
    } else {
        System.out.println("Kaldı");
    }
}
