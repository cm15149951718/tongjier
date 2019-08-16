package day1;

import java.util.Scanner;

public class zuoye01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int i = sc.nextInt();
        String a = ( i % 2== 0 )?"偶数":"奇数";
        System.out.println(a);

    }
}
