package day2;

import java.util.Scanner;

public class ZuoYe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+1+ "号评委请打分：");
            int x = scanner.nextInt();
            arr[i]=x;
            sum =sum + arr[i];
        }
        int a = arr[0];
        int b = arr[0];

        int c = 0;
        System.out.println("和为："+sum);
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>=a){
                a=arr[i];
            }
        }
        System.out.println("最高分为："+a);
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]<=b){
                b=arr[i];
            }
        }
        System.out.println("最低分为" +b);
        c =(sum-a-b)/(arr.length-2);
        System.out.println("去掉一个最高分、一个最低分平均分为："+c);
    }
}
