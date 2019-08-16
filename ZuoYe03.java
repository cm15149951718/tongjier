package day2;

import java.util.Scanner;

public class ZuoYe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于100的三位数：");
        int i = scanner.nextInt();
        int a =0;
        for (int j = 100; j <=i; j++) {
            int b = j%10; //个位
            int c = j/10;
            int d = c%10;//十位
            int e = j/100;
            if (b!=7&&d!=5&&e!=3){
                a = a+j;
            }
        }
        System.out.println(a);
    }
}
