package algoritmasorulari;

import java.util.Scanner;

public class SayiToplama {
    public static void main(String[] args) {

        //while
        //0 girilene kadar, girilmiş tüm sayıların
        //toplanması...
        int toplam=0;
        int sayi ;
        while(true)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayi girin: ");
            sayi = scan.nextInt();
            if(sayi==0) break;
            toplam=toplam+  sayi;
        }
        System.out.println("Sayıların Toplamı: "+toplam);

        //do...while()

        int sum=0;
        int sayi1 ;
        do
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir sayi girin: ");
            sayi1 = scan.nextInt();
            if(sayi1==0) break;
            sum=sum+  sayi;
        }while(true);
        System.out.println("Sayıların Toplamı: "+toplam);

    }
    }

