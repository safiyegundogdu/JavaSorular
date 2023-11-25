package algoritmasorulari;

import java.util.Scanner;

public class IkiSayiArasindakiToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int baslangic, bitis, toplam = 0;
        System.out.print("Başlangıç Sayısını Giriniz: ");
        baslangic = scanner.nextInt();
        System.out.print("Bitiş Sayısını Giriniz: ");
        bitis = scanner.nextInt();
        int[] sayilar = new int[bitis];
        for (int i = baslangic; i < bitis; i++){
            sayilar[i] = i;
            toplam += i;
        }
        System.out.println("Girilen sayıların arasındaki sayıların toplamı : " + toplam);
    }
}
