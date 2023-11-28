package algoritmasorulari;

import java.util.Scanner;

public class Arrays06 {
    public static void main(String[] args) {
        /*

   klavyeden girilen pozitif bir n tamsayisina kadar olan sayilari
   bir diziye yazan ve diziden okuyarak sayilarin karelerini ekrana listeleyen
   kodu yaziniz
         */
        //Kullanicidan pozitif bir  tamsayi al
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int n=input.nextInt();

        //n elemanli bir dizi olustur

        int dizi[]=new int[n];

        //Diziyi doldur ve karelerini al

        for(int i=0;i<n;i++){
            dizi[i]=i+1;//sayilari diziye yaz
            System.out.println("Dizi elemani " + (i+1) + " ==> " +dizi[i]+",Kare: "+ dizi[i]*dizi[i]);
        }




    }
}
