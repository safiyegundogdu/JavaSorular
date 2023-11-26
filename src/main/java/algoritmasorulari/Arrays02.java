package algoritmasorulari;

public class Arrays02 {
    public static void main(String[] args) {
        /*
    • 10 elemanlı { 19, 3, 15, 7, 11, 9, 13, 5, 17, 1 } grafik isimli bir dizi
    oluşturulacaktır.
    • Dizideki elemanlar tek tek okunarak her dizi elemanının sayısı kadar
    ekrana * karakteri yazdırılacaktır.
    • Ekran çıktısı aşağıdaki gibi olacaktır.
    19=*******************
    3=***

     */


        // 10 elemanlı dizi oluşturuluyor
        int[] grafik = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};

        // Dizideki her elemanın değeri kadar '*' karakteri yazdırılıyor
        for (int i = 0; i < grafik.length; i++) {
            for (int j = 0; j < grafik[i]; j++) {
                System.out.print("*");
            }
            // Her elemanın çıktısı için yeni satıra geçiliyor
            System.out.println();

        }





    }
}
