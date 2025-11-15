void main() {
        String input = IO.readln();
        String s = (input == null) ? "" : input.trim();

        IO.println("\n--- Temel bilgi ---");
        IO.println("Girilen: \"" + s + "\"");
        IO.println("Uzunluk: " + s.length());
        IO.println("Boş mu: " + s.isEmpty());
        if (!s.isEmpty()) {
            IO.println("İlk karakter: '" + s.charAt(0) + "'");
            IO.println("\"http\" ile başlıyor mu: " + s.startsWith("http"));
            IO.println(".com ile bitiyor mu: " + s.endsWith(".com"));
        }

        IO.println("\n--- Basit kontroller ---");
        boolean hasSpace = s.indexOf(' ') >= 0;
        IO.println("Boşluk içeriyor mu: " + hasSpace);
        IO.println("Tamamı küçük harf mi: " + s.equals(s.toLowerCase()));
        IO.println("\"example\" içeriyor mu: " + s.contains("example"));

        // Regex kullanmadan basit e-posta benzeri kontrol (sadece String metotları)
        boolean hasAt = s.indexOf('@') >= 0;
        int atIndex = s.indexOf('@');
        boolean onlyOneAt = hasAt && s.indexOf('@') == s.lastIndexOf('@');
        boolean atNotFirstOrLast = hasAt && atIndex > 0 && atIndex < s.length() - 1;

        boolean dotAfterAt = false;
        if (hasAt) {
            int dotIndexAfterAt = s.indexOf('.', atIndex + 1);
            // '@' sonrası en az bir '.' olmalı ve '.' doğrudan '@' ardından gelmemeli
            dotAfterAt = dotIndexAfterAt > atIndex + 1;
        }

        boolean noConsecutiveDots = !s.contains("..");
        boolean noSpaces = !hasSpace;

        boolean looksLikeEmail = onlyOneAt && atNotFirstOrLast && dotAfterAt && noConsecutiveDots && noSpaces;

        IO.println("\n--- E-posta benzeri kontrol ---");
        IO.println("'@' var mı: " + hasAt);
        IO.println("Sadece bir '@' mı: " + onlyOneAt);
        IO.println("'@' sonrası '.' var mı: " + dotAfterAt);
        IO.println("Ardışık nokta yok mu: " + noConsecutiveDots);
        IO.println("Boşluk yok mu: " + noSpaces);

        if (looksLikeEmail) {
            String local = s.substring(0, atIndex);
            String domain = s.substring(atIndex + 1);
            IO.println("\nSonuç: E-posta gibi görünüyor.");
            IO.println("Local bölüm: \"" + local + "\"");
            IO.println("Domain bölüm: \"" + domain + "\"");
            if (domain.endsWith(".com") || domain.endsWith(".org") || domain.endsWith(".net")) {
                IO.println("Domain yaygın TLD ile bitiyor (.com/.org/.net).");
            } else {
                IO.println("Domain TLD yaygın listede değil.");
            }
        } else {
            IO.println("\nSonuç: Basit kontrol bazında e-posta gibi görünmüyor.");
            if (hasAt) {
                if (!onlyOneAt) IO.println("- İpucu: birden fazla '@' işareti var.");
                if (!dotAfterAt) IO.println("- İpucu: '@' sonrası uygun '.' yok.");
                if (!noConsecutiveDots) IO.println("- İpucu: ardışık '..' bulunuyor.");
                if (hasSpace) IO.println("- İpucu: boşluk içeriyor; e-posta boşluk içermez.");
            }
        }
    }
