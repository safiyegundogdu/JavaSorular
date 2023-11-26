package algoritmasorulari;

import java.util.Scanner;

public class DortIslemYapanUygulama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz: ");
        double sayi1 = scan.nextDouble();
        System.out.println("2.sayiyi giriniz: ");
        double sayi2 = scan.nextDouble();
        System.out.println("toplam = " + (sayi1 + sayi2));
        System.out.println("cikarma= " + Math.abs(sayi1 - sayi2));
        System.out.println("carpma= " + sayi1 * sayi2);
        System.out.println("bolme = " + sayi1 / sayi2);

               /*
                Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazaran basit bir hesap makinasi yapiniz

                */
        //note: switch() sadece int byte short char ve String data tipleri kullanilabilir
        //Eger 3'den fazla durum varsa switch() tercih ederim
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen islemi giriniz: +, -,: ,*");
        char islem = input.next().charAt(0);
        System.out.println("ilk sayiyi giriniz");
        double a = input.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double b = input.nextDouble();
        switch (islem) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a- b);
                break;
            case '%':
                System.out.println(a/ b);
                break;
            case '*':
                System.out.println((a * b) / 100);
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir");


        }
    }
}