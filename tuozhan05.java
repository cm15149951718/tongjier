package day1;

import java.util.Scanner;

public class tuozhan05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a=sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b=sc.nextInt();
        System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)：");
        int x=sc.nextInt();
        if (x==0){
            System.out.println(a+b);
        }else if (x==1){
            System.out.println(a-b);
        }else if (x==2){
            System.out.println(a*b);
        }else{
            System.out.println(a/b);
        }
    }
}
