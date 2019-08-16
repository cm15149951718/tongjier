package day2;

import java.util.Random;
import java.util.Scanner;

public class ZuoYe06 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("你才一个数：");
            int i = sc.nextInt();
            if (number>i){
                System.out.println("小了");
            }else if (number<i){
                System.out.println("大了");
            }else {
                System.out.println("你猜对了");
                System.exit(0);
            }
        }

    }
}
