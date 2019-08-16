package day3;

import java.util.Scanner;

public class ZuoYe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入长方形的长：");
        int a = scanner.nextInt();
        System.out.println("输入长方形的宽：");
        int b = scanner.nextInt();
        System.out.println("输入圆的半径：");
        int r = scanner.nextInt();
        System.out.println("正方形的周长为："+zhouchang(a,b));
        System.out.println("正方形的周长为："+mianji(a,b));
        System.out.println("圆的周长为："+yzc(r));
        System.out.println("圆的周长为："+ymj(r));

    }
    public static int zhouchang(int a,int b){
        int l=(a+b)*2;
        return l;
    }
    public static int mianji(int a,int b) {
        int s=a*b;
        return s;
    }

    public static double yzc(int r) {
        double l=Math.PI*2*r;
        return l;
    }
    public static double ymj(int r){
        double s=Math.PI*r*r;
        return s;
    }
}
