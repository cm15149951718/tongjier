package day3;

import java.util.Random;

public class ZuoYe02 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100)+1;
        int b = random.nextInt(100)+1;
        int c = fangfa(a,b);
        System.out.println(c);
    }
    public static int fangfa(int a,int b){
        return a+b;
    }
}
