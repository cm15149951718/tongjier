package day3;

public class ZuoYe01 {
    public static void main(String[] args) {
        fangfa(15);

    }
    public static void fangfa(int a){
        for (int i = 0; i <a+1 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
