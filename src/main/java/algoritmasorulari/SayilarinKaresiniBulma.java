package algoritmasorulari;

import java.util.Scanner;

public class SayilarinKaresiniBulma {
    public static void main(String[] args) {
        //: 0 girilene kadar, girilen sayıların
        //karelerini bulma…(do - while)
        int sayi;
        do{
            Scanner scan=new Scanner(System.in);
            System.out.println("Bir sayi giriniz: ");
            sayi=scan.nextInt();
            if(sayi==0)
                break;
            System.out.println("Girilen sayinin karesi: "+sayi*sayi);

        }while(true);
        System.out.println("Isleminiz sonlanmistir");

    }
}
