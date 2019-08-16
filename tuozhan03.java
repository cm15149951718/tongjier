package day1;

import java.util.Scanner;

public class tuozhan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入4位会员卡号：");
        int x = sc.nextInt();
        int a = x % 10 ; //获取个位
        int b = x / 10;
        int c = b % 10 ; //获取十位
        int d = b / 10;
        int e = d % 10;  //获取百位
        int f = x / 100; //获取千位
        int g = a+c+e+f;
        if (g>20) {
            System.out.println("会员卡号" + x + "各位之和：" + g);
            System.out.println("会员卡号" + x + "是幸运客户");
        }else {
            System.out.println("会员卡号" + x + "各位之和：" + g);
            System.out.println("会员卡号" + x + "不是幸运客户");
        }
    }
}
