package algoritmasorulari;

import java.util.Scanner;

public class Arrays03 {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 adet sayi aliniyor Tek boyutlu, 5 elemanlı, sayısal (int) bir dizi tanımlanarak:
      • Dizi elemanlarına dizi indislerinin 3 katı for döngüsü
        içerisinde değer olarak atanacaktır.
       • Yine başka bir for döngüsü içerisinde bu değerler ekrana
        yazdırılacaktır.


         */
        Scanner scan=new Scanner(System.in);

        int dizi[]=new int [5];
        System.out.println("Lutfen 5 adet sayi giriniz");
        for(int i=0;i< dizi.length;i++){
            dizi[i]= scan.nextInt();
        }

        for(int i=0;i< dizi.length;i++){
            dizi[i]=i*3;

        }
        System.out.println("Dizi elemanlari : ");
        for(int i=0;i< dizi.length;i++){
            System.out.println("Index "+ i + " : " + dizi[i]);
        }

    }
}
