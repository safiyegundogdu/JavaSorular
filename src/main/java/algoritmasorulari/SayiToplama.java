package algoritmasorulari;

import java.util.Scanner;

public class SayiToplama {
    public static void main(String[] args) {
        //0 girilene kadar, girilmiş tüm sayıların
        //toplanması...
        int toplam=0;
        int sayi;
        while(true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayi girin: ");
            sayi = scan.nextInt();
            if(sayi==0) break;
            toplam=toplam + sayi;
        }
        System.out.println("Sayıların Toplamı: "+toplam);
    }
    }

