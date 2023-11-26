package algoritmasorulari;

public class BelliAraliktakiCiftSayilarinToplami {
    public static void main(String[] args) {
        //1-50 arasindaki cift sayilarin toplami
        int toplam=0;
        for(int i=1;i<50;i++){
            if(i%2==0){
                toplam=toplam+i;
            }
        }
        System.out.println("Sayilarin Toplami:"+toplam);
    }
}
