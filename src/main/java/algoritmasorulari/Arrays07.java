package algoritmasorulari;

import java.util.Scanner;

public class Arrays07 {
    public static void main(String[] args) {
        //Kullanicidan alinan pozitif bir n tamsayisina kadar olan sayilardan tek olanlari "Tek"
        // cift olanlari "Cift" adli diziye yazan ve bunlari ayri ayri ekrana listeleyen kodu yaziniz
        //Kullanicidan pozitif bir  tamsayi al
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan pozitif bir n tamsayısı al
        System.out.print("Pozitif bir n tamsayısı giriniz: ");
        int n = scanner.nextInt();

        // "Tek" ve "Çift" adlı iki ayrı dizi oluştur
        int[] tek = new int[n];
        int[] cift = new int[n];

        // Dizilere sayıları yaz ve ayrıştır
        int tekIndex = 0;
        int ciftIndex = 0;


        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                cift[ciftIndex] = i;// Çift sayıları "Çift" dizisine yaz
                ciftIndex++;
            } else {
                tek[tekIndex++] = i;  // Tek sayıları "Tek" dizisine yaz

            }
        }

        // "Tek" dizisini ekrana yazdır
        System.out.println("Tek Sayılar:");
        for (int i = 0; i < tekIndex; i++) {
            System.out.print(tek[i]+" ");
        }
        System.out.println();

        // "Çift" dizisini ekrana yazdır
        System.out.println("Çift Sayılar:");
        for (int i = 0; i < ciftIndex; i++) {
            System.out.print(cift[i]+" ");
        }

    }

    }


