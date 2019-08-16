package day3;

import java.util.Random;

public class ZuoYe15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr1=new int[10];
        int[] arr2=new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=random.nextInt(100)+1;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=random.nextInt(100)+1;
        }
        fangfa(arr1);
        fangfa(arr2);

    }
    public static void fangfa(int[] arr){
        String a="";
        for (int i = 0; i < arr.length; i++) {
            a=a+arr[i];
        }
        System.out.println(a.length());
        System.out.println(a);
    }
}
