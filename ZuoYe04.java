package day3;

import java.util.Scanner;

public class ZuoYe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String a = fangfa(scanner.nextInt());
        System.out.println(a);

    }
    public static String fangfa(int a){
        if (a>=90&&a<=100){
            return "A";
        }else if (a>=80&&a<90){
            return "B";
        }else if (a>=70&&a<=80){
            return "C";
        }else if (a>=60&&a<70){
            return "D";
        }else if (a>=0&&a<60){
            return "E";
        }else {
            return "F";
        }
    }
}
