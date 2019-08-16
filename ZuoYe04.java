package day2;

import java.util.Scanner;

public class ZuoYe04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = 0;
        while (i<10){
            System.out.println("请输入1-5任意数字：");
            int a = sc.nextInt();
            i++;
            switch (a) {
                case 1:
                    System.out.println("新建");
                    break;
                case 2:
                    System.out.println("打开文件");
                    break;
                case 3:
                    System.out.println("保存");
                    break;
                case 4:
                    System.out.println("刷新");
                    break;
                case 5:
                    System.out.println("退出");
                    System.exit(0);
                    break;

            }
        }
    }
}
