package day2;

import java.util.Scanner;

public class ZuoYe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请联系输入10次1到10的数：");
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum_1=0;
        int sum_2=0;
        int sum_3=0;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1){
                sum_1++;
            }else if (arr[i]==2){
                sum_2++;
            }else if (arr[i]==3){
                sum_3++;
            }else{
                sum++;
            }
        }
        System.out.println("数字1的个数："+sum_1);
        System.out.println("数字2的个数："+sum_2);
        System.out.println("数字3的个数："+sum_3);
        System.out.println("非法数字的个数："+sum);
    }
}
