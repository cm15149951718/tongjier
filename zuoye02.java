package day1;

import java.util.Scanner;

public class zuoye02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入成绩");
            int i = sc.nextInt();
            String a = ( i >= 60 )?"及格":"不及格";
            System.out.println(a);
        }
    }
