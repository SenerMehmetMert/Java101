package PassOrFail;
import java.util.*;
public class PassOrFail {
    public static void main(String[] args) {
        final int DERS_SAYISI = 5;
        String[] dersler = {"Matematik", "Türkçe", "Fizik", "Edebiyat", "İngilizce"};
        int[] notlar = new int[DERS_SAYISI];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < DERS_SAYISI; i++) {
            System.out.print(dersler[i] + " notunu girin: ");
            int not = scanner.nextInt();

            if (not >= 0 && not <= 100) {
                notlar[i] = not;
            } else {
                System.out.println("Geçersiz not! Not 0 ile 100 arasında olmalıdır.");
                i--; // Geçersiz not girildiğinde döngü adımı tekrarlanacak.
            }
        }

        double toplam = 0;
        for (int not : notlar) {
            toplam += not;
        }

        double ortalama = toplam / DERS_SAYISI;
        System.out.println("Girilen notların ortalaması: " + ortalama);

        scanner.close();
    }
}
