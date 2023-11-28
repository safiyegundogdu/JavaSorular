package algoritmasorulari;

import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {
        /*
        • 100 elemanlı tam sayı tipinde veri tutan bir dizi tanımlayınız.
        • Dizinin tüm elemanlarına değer olarak dizi indislerinin 2 katı
         değer atayınız.
         • Daha sonra aranacak veriyi klavyeden giriniz.
        • Eğer aranan veri dizide bulunursa, bulunduğu dizinin indisi ile
         birlikte ekrana yazdırınız.
        • Eğer aranan bilgi bulunamazda ekrana bulunamadığına dair
         bilgi veriniz.
         */

        // 100 elemanlı tam sayı dizisi oluştur
        int[] dizi = new int[100];

        // Dizinin tüm elemanlarına değer olarak indislerinin 2 katını ata
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = 2 * i;
        }

        // Kullanıcıdan aranacak veriyi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak veriyi giriniz: ");
        int arananVeri = scanner.nextInt();

        // Dizide arama yap
        int bulunduguIndex = -1;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == arananVeri) {
                bulunduguIndex = i;
                break; // Aranan veriyi bulduğumuzda döngüden çık
            }
        }

        // Sonucu ekrana yazdır
        if (bulunduguIndex != -1) {
            System.out.println("Aranan veri bulundu! İndex: " + bulunduguIndex);
        } else {
            System.out.println("Aranan veri bulunamadı.");
        }

    }
}
