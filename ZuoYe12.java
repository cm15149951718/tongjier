package day3;

import java.util.Scanner;

public class ZuoYe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a=weishi(scanner.nextInt());
        System.out.println(a);
    }
    public static int weishi(int a){
        int  b=(a+"").length();
        return b;
        }
}
