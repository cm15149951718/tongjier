package day1;

import java.util.Scanner;

public class zuoye06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        int i = sc.nextInt();
        if (90<=i&&i<=100){
            System.out.println("优秀");
        }else if (80<=i&&i<90){
            System.out.println("好");
        }else if (70<=i&&i<80){
            System.out.println("良");
        }else if (60<=i&&i<70){
            System.out.println("及格");
        }else if (i<60){
            System.out.println("不及格");
        }
    }
}
