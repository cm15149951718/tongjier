package day1;

import java.util.Scanner;

public class tuozhan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份,范围1-12");
        int x = sc.nextInt();
        if (x == 3 || x == 4 || x == 5) {
            System.out.println(x + "月份是春季");
        } else if (x == 6 || x == 7 || x == 8) {
            System.out.println(x + "月份是夏季");
        } else if (x == 9 || x == 10 || x == 11) {
            System.out.println(x + "月份是秋季");
        } else {
            System.out.println(x + "月份是冬季");
        }
    }
}
