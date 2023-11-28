package algoritmasorulari;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SayilariKucuktenBuyugeSiralama {
    public static void main(String[] args) {
        //Kullanicidan alinan n tane sayiyi kucukten buyuge siralayiniz
        Scanner input=new Scanner(System.in);
        System.out.println("Kac adet sayi gireceksiniz");
        int n= input.nextInt();
        int dizi[]=new int[n];

        for(int i=0;i< dizi.length;i++){
            System.out.print((i+1)+".sayiyi giriniz: ");
            dizi[i]= input.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));//Array [] seklinde yazdirir
                                                 // [1, 2, 3, 4]

        System.out.println("Siralanmis sayilar: ");//for each ile [] parantez disi yazdirma
        for(int sayi :dizi){                      //1 2 3 4
            System.out.print(sayi+" ");
        }
    }
}
