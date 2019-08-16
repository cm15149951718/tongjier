package day3;

import java.util.Scanner;

public class ZuoYe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = scanner.nextInt();
        System.out.println("请再输入一个整数：");
        int b = scanner.nextInt();
        System.out.println("请输入一个小数：");
        double c = scanner.nextDouble();
        System.out.println("请再输入一个小数：");
        double d = scanner.nextDouble();
        System.out.println("和为：" + he(a, b));
        System.out.println("和为：" + he(c, d));
        System.out.println("是否相等：" + xiangdeng(a, b));
        System.out.println("是否相等：" + xiangdeng(c, d));
        System.out.println("大小：" + daxiao(a, b));
        System.out.println("大小：" + daxiao(c, d));

    }

    public static int he(int a, int b) {
        return a + b;
    }

    public static double he(double a, double b) {
        return a + b;
    }

    public static String xiangdeng(int a, int b) {
        if (a == b) {
            return "相等";
        } else {
            return "不相等";
        }
    }

    public static String xiangdeng(double a, double b) {
        if (a == b) {
            return "相等";
        } else {
            return "不相等";
        }
    }
    public static String daxiao(int a,int b){
        if (a>b){
            return (a+"大");
        }else if (a<b){
            return (b+"大");
        }else {
            return "相等";
        }
    }
    public static String daxiao(double a,double b){
        if (a>b){
            return (a+"大");
        }else if (a<b){
            return (b+"大");
        }else {
            return "相等";
        }
    }
}
