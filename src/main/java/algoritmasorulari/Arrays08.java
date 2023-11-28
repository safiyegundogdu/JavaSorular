package algoritmasorulari;

import java.util.Scanner;

public class Arrays08 {
    public static void main(String[] args) {
        //Kullanici tarafindan girilen birbirinden farkli 10 adet pozitif tam sayi icersindeki
        // en buyuk sayiyi bulma

        Scanner scanner = new Scanner(System.in);

        int adet = 10; // Kullanıcının gireceği sayı adeti

        // En büyük sayıyı tutacak değişkeni tanımla ve en küçük değerle başlat
        int enBuyukSayi = Integer.MIN_VALUE;

        // Kullanıcıdan 10 farklı sayıyı al
        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            // Girilen sayı, şu ana kadar bulunan en büyük sayıdan büyükse güncelle
            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
            }
        }

        // En büyük sayıyı ekrana yazdır
        System.out.println("En büyük sayı: " + enBuyukSayi);

        int adet1 = 10; // Kullanıcının gireceği sayı adeti

        // Kullanıcının girdiği sayıları tutacak dizi
        int[] sayilar = new int[adet1];

        // Dizinin en büyük sayısını tutacak değişkeni tanımla ve en küçük değerle başlat
        int enBuyukSayi1 = Integer.MIN_VALUE;

        // Kullanıcıdan 10 farklı sayıyı al ve diziyi doldur
        for (int i = 0; i < adet1; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayilar[i] = scanner.nextInt();

            // Girilen sayı, şu ana kadar bulunan en büyük sayıdan büyükse güncelle
            if (sayilar[i] > enBuyukSayi) {
                enBuyukSayi = sayilar[i];
            }
        }

        // Diziyi ekrana yazdır
        System.out.print("Girilen sayılar: ");
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }

        // En büyük sayıyı ekrana yazdır
        System.out.println("\nEn büyük sayı: " + enBuyukSayi);






    }
}
