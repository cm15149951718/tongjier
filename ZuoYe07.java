package day2;

public class ZuoYe07 {
    public static void main(String[] args) {
        double a = 0.0001;
        int b = 0;
        while (a <= 8848) {
            a = a * 2;
            b = b + 1;
        }
        System.out.println(b);
    }
}
