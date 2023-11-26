package algoritmasorulari;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        /*
        Ogrencilerin basari notunu yazdiran kodu yaziniz
        60-65==>DD
        66-70==>CD
        71-75==>CC
        76-80==>CB
        81-85==>BB
        86-90==>BA
        91-100==>AA
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Luften ogrencinin notunu girin : ");
        int not=scan.nextInt();

        if(not>59 && not<66){
            System.out.println("Harf karsiligi :DD ");

        }else if(not>=66&& not<71){
            System.out.println("Harf karsiligi :CD ");

        }else if(not>=71&&not<76){
            System.out.println("Harf karsiligi :CC ");

        }else if(not>=76 && not<81){
            System.out.println("Harf karsiligi :CB ");

        }else if(not>=81 && not<86){
            System.out.println("Harf karsiligi :BB ");

        }else if(not>=86 && not<91){
            System.out.println("Harf karsiligi :BA ");

        }else if(not>=91 && not<=100){
            System.out.println("Harf karsiligi :AA ");

        }else{
            System.out.println("Uygun deger girmediniz!");
        }
    }
}
