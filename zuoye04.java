package day1;

import java.util.Scanner;

public class zuoye04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长");
        int x = sc.nextInt();
        System.out.println("请输入长方形的宽");
        int y = sc.nextInt();
        int s = x * y;
        int l = (x + y)*2;
        System.out.println(s);
        System.out.println(l);
    }
}
