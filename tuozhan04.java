package day1;

import java.util.Scanner;

public class tuozhan04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的工龄");
        int a=sc.nextInt();
        System.out.println("请输入您的基本工资");
        int b=sc.nextInt();
        if (a>=10){
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资5000元，涨后工资为"+(b+5000)+"元");
        }else if (a>=5){
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资2500元，涨后工资为"+(b+2500)+"元");
        }else if (a>=1){
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资500元，涨后工资为"+(b+500)+"元");
        }else{
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元，应涨工资200元，涨后工资为"+(b+200)+"元");
        }
    }
}
