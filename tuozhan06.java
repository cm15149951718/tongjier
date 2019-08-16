package day1;

import java.util.Scanner;

public class tuozhan06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入x的值：");
        int x=sc.nextInt();
        if (x<0){
            System.out.println("x="+x+",y=-1");
        }else if (x==0){
            System.out.println("x="+x+",y=0");
        }else{
            System.out.println("x="+x+",y=1");
        }
    }
}
