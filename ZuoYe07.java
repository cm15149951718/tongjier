package day3;

import java.util.Scanner;

public class ZuoYe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数子：");
        int a = scanner.nextInt();
        System.out.println("请再输入一个数子：");
        int b = scanner.nextInt();
        int[] arr=fangfa(a,b);
        System.out.println("和为："+arr[0]);
        System.out.println("差为："+arr[1]);
        System.out.println("积为："+arr[2]);
        System.out.println("商为："+arr[3]);

    }
    public static int[] fangfa(int a,int b){
        int[] arr = new int[4];
        arr[0] = a+b;
        arr[1] = a-b;
        arr[2] = a*b;
        arr[3] = a/b;
        return arr;
    }
}
