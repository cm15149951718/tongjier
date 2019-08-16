package day3;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class ZuoYe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int a = scanner.nextInt();
        System.out.println("请输入比上一次输入大的年份：");
        int b = scanner.nextInt();
        runnian(a,b);
    }
    public static void runnian(int a,int b){
        for (int i = a; i <b; i++) {
            if (i%100==0&&i%400==0){
                System.out.println("闰年："+i);
            }else if (i%4==0){
                System.out.println("闰年："+i);
            }
        }
    }
}
