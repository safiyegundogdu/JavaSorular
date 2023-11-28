package algoritmasorulari;

public class Sekil02 {
    public static void main(String[] args) {
/*
        // Satır sayısı belirleniyor
        int satirSayisi = 5;

        int i = 1;
        while (i <= satirSayisi) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Her satırın sonunda yeni bir satıra geç
            i++;
        }


 */



        //for loop
        // Satır sayısı belirleniyor
        int satirSayisi = 5;

        // Yıldızları çizmek için iki katmanlı for döngüsü kullanılıyor
        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Her satırın sonunda yeni bir satıra geç
        }

        System.out.println();
        int satir=5;
        for(int i=satir;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}