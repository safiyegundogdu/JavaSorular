package algoritmasorulari;

import java.util.Scanner;

public class Arrays05 {
    public static void main(String[] args) {
        /*
        3 öğrencinin 3 adet sınav notu bilgisi klavyeden girilecektir.
      • Her öğrenci için tek boyutlu ayrı bir dizi tanımlamalısınız ve
        not girişlerini for döngüsünde yapmalısınız.
       • ogr1Not, ogr2Not, ogr3Not
       • Notların girişi tamamlandıktan sonra:
      • Ekran Çıktısı 1: 1.öğrencinin 1.sınav notu ile 2.öğrencinin 2.sınav
        notu ve 3.öğrencinin 3.sınav notunu toplayarak ekranda gösteriniz.
       • Ekran Çıktısı 2: Her sınav için ağırlıklı not ortalamasını bulunuz
         ve ekrana yazdırınız. for döngüsü kullanınız.
         */
         Scanner input=new Scanner(System.in);
        //Ogrenci sayisi ve sinav sayisini tanimla
        int ogrenciSayisi=3;
        int sinavSayisi=3;
        //Notlarin arrayslerini tanimla

        int ogr1Not[]=new int[sinavSayisi];
        int ogr2Not[]=new int[sinavSayisi];
        int ogr3Not[]=new int[sinavSayisi];

        //Her bir ogrenci icin sinav notlarinin girisini yap

        for(int i=0;i<sinavSayisi;i++){
            System.out.println("1. ogrencinin "+ (i+1) +". sinav notunu giriniz: ");
            ogr1Not[i]= input.nextInt();}

        for(int i=0;i<sinavSayisi;i++){
            System.out.println("2. ogrencinin "+(i+1)+". sinav notunu giriniz: ");
            ogr2Not[i]= input.nextInt();}

        for(int i=0;i<sinavSayisi;i++){
            System.out.println("3. ogrencinin "+(i+1)+". sinav notunu giriniz: ");
            ogr3Not[i]= input.nextInt();
        }
        //Ekran Çıktısı 1:
        System.out.println("1.öğrencinin 1.sınav notu ile 2.öğrencinin 2.sınav\n" +
                            "notu ve 3.öğrencinin 3.sınav notunu toplami: " +
                             (ogr1Not[0]+ogr2Not[1]+ogr3Not[2]));

        //Ekran Çıktısı 2:Her sınav için ağırlıklı not ortalamasını bulunuz
        //               ve ekrana yazdırınız.

        for(int i=0;i<sinavSayisi;i++){
            double ortalama=(ogr1Not[i]+ogr2Not[i]+ogr3Not[i])/ (double) ogrenciSayisi;
            System.out.println((i+1)+".Sinavin Agirlikli Not Ortalamasi : " + ortalama);
        }


    }
        }






