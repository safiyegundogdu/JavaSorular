package algoritmasorulari;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {


            //Sayilari kucukten buyuge siralama
            Scanner scan = new Scanner(System.in);
            int gecici;
            int [] dizi = new int[10];

            for(int i = 0; i < 10; i++)
            {
                System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
                dizi[i] = scan.nextInt();
            }
            System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
            for(int i = 0; i < 9; i++)
            {
                for(int j = i+1; j < 10; j++)
                {
                    if(dizi[j] < dizi[i]) {
                        gecici = dizi[i];
                        dizi[i] = dizi[j];
                        dizi[j] = gecici;
                    }
                }
            }
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
            }


            //sayilari buyukten kucuge siralama
            int[] num = new int[8];
            int i, j, t;
            Scanner scanner = new Scanner(System.in);

            for (i = 0; i < 8; i++) {
                System.out.print((i + 1) + ". sayiyi giriniz: ");
                num[i] = scanner.nextInt();
            }

            for (i = 0; i < 8; i++) {
                for (j = 0; j < 8; j++) {
                    if (num[j] <= num[i]) {
                        t = num[i];
                        num[i] = num[j];
                        num[j] = t;
                    }
                }
            }

            System.out.print("\nsiralama: ");
            for (i = 0; i < 8; i++) {
                System.out.print(num[i] + " ");
            }


        }

}
