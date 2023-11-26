package algoritmasorulari;

import java.util.Scanner;

public class Arrays {

public static void main(String[] args) {
    /*
   Klavyeden sayısal değer girme
  • Klavyeden maksimum 10 tane sayısal değer girilecektir.
  • Girilen sayılar bir dizide saklanacaktır.
  • Sayı girme işlemi 0 girilene kadar devam edecektir.
  • 0 değeri girildiği anda 0 sayısı hariç girilen diğer tüm değerler
   diziden okunarak ekrana yazdırılacaktır
 */
    Scanner scanner = new Scanner(System.in);

    // Maksimum 10 elemanlı bir dizi oluşturuluyor
    int[] sayiDizisi = new int[10];

    System.out.println("Sayıları girmeye başlayın (0 girerek sonlandırın):");

    // Kullanıcı 0 girene kadar sayıları diziye ekleyin
    for (int i = 0; i < 10; i++) {
        int sayi = scanner.nextInt();

        // 0 girildiğinde döngüden çık
        if (sayi == 0) {
            break;
        }

        sayiDizisi[i] = sayi;
    }

    // 0 hariç girilen tüm sayıları ekrana yazdır
    System.out.println("Girilen sayılar (0 hariç):");
    for (int i = 0; i < sayiDizisi.length && sayiDizisi[i] != 0; i++) {
        System.out.print(sayiDizisi[i] + " ");
    }

    // Belleği temizle
    scanner.close();
}
}
