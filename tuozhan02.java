package day1;

import java.util.Scanner;

public class tuozhan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入Java的成绩：");
        int x = sc.nextInt();
        System.out.println("请输入SQL的成绩：");
        int y = sc.nextInt();
        System.out.println("请输入Web的成绩：");
        int z = sc.nextInt();
        int a = x-y;
        int b = (x+y+z)/3;
        System.out.println("------------------");
        System.out.println("Java"+"  "+"SQL"+"  "+"Web");
        System.out.println(x+"   "+y+"   "+z);
        System.out.println("------------------");
        System.out.println("Java和SQL的成绩差："+a);
        System.out.println("三门课的平均分是："+b);

    }
}
