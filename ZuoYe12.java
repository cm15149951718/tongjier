package day2;

import java.util.Random;
import java.util.Scanner;

public class ZuoYe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = scanner.nextInt();
        int[] arr = new int[i];
        Random random = new Random();
        for (int j = 0; j <arr.length ; j++) {
            int x = random.nextInt(10);
            arr[j]=x;
            if (arr[j]>5&&arr[j]%2==0){
                System.out.println(arr[j]);
            }
        }

    }
}
