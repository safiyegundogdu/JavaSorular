package algoritmasorulari;

import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        //1-50 arasındaki asal sayıların
        //yazdırılması.

        int sayi;

        Scanner scan=new Scanner(System.in);
        boolean asal=true;
        System.out.println("Bir sayi giriniz");
        sayi=scan.nextInt();
        for( int i=2;i<sayi;i++){
            if(sayi%i==0){
                asal=false;
                break;
            }

        }

        if(asal==true){
            System.out.println(sayi + " asal sayidir");
        }else{
            System.out.println(sayi+" asal sayi degildir");
        }



    }
}
