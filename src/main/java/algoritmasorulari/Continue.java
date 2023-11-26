package algoritmasorulari;

public class Continue {
    public static void main(String[] args) {
        //1-10 arası sayıları yazdır, 3 değeri için
        //devam et (continue kullanarak)

        for(int i=1;i<11;i++){
            if(i==3)
                continue;
            System.out.print(i);

        }
    }
}
