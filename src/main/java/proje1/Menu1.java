package proje1;

import java.util.Scanner;

public class Menu1 {
    public static void main(String[] args) {


        int sayi = 0;
        Scanner input = new Scanner(System.in);

        while (sayi != -1) {

            System.out.println("Lutfen yapmak istediginiz islemi seciniz\n " +
                    "(1)Girilen Sayının Tek Yada Çift Olduğunu Bulma\n " +
                    "(2)Girilen 3 Sayıyı Büyükten Küçüğe Sıralama \n " +
                    "(3)Girilen Sayının Asal Sayı Olup Olmadığını Bulma\n " +
                    "Cikis icin lutfen -1'e basiniz\n " +
                    "Seciminizi giriniz:  ");

            sayi = input.nextInt();






            if (sayi == 1) {
                System.out.println("Lutfen bir sayi giriniz");
                int a = input.nextInt();

                if (a % 2 == 0) {
                    System.out.println("Girmis oldugunuz sayi CIFT sayidir");

                } else {
                    System.out.println("Girmis oldugunuz sayi TEK sayidir");
                }
                System.out.println("********************************");


            } else if (sayi == 2) {


                int[] num = new int[3];
                int  t;

                for (int i = 0; i < 3; i++) {
                    System.out.print((i + 1) + ". sayiyi giriniz: ");
                    num[i] = input.nextInt();
                }

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (num[j] <= num[i]) {
                            t = num[i];
                            num[i] = num[j];
                            num[j] = t;
                        }
                    }
                }
                System.out.print("Siralama: ");
                for (int i = 0; i < 3; i++) {
                    System.out.print(num[i] + " ");
                }

                System.out.println();
                System.out.println("********************************");

            } else if (sayi == 3) {
                System.out.print("Bir Sayı Giriniz : ");
                int number = input.nextInt();
                boolean asalMi = true;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        asalMi = false;
                        break;
                    }
                }
                if (asalMi) {
                    System.out.println("" + number + " ASAL sayidir");
                } else {
                    System.out.println("" + number + " ASAL sayi değildir.");
                }
                System.out.println("********************************");

            } else if (sayi == -1) {
                System.out.println("Isleminiz sonlanmistir");
                break;
            } else {
                System.out.println("Yanlış değer girdiniz tekrar giriş yapınız");
            }
        }
    }
}


