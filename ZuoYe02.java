package day2;

public class ZuoYe02 {
    public static void main(String[] args) {
        int a=0;
        for (int i = 0; i <=100 ; i++) {
            if (i%3==0 && i%5==0){
                a = a+i;
            }
        }
        System.out.println(a);
    }
}
