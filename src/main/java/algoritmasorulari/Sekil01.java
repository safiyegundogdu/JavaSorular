package algoritmasorulari;

public class Sekil01 {
    public static void main(String[] args) {
        int width = 4;
        int height = 5;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < width; k++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

}
