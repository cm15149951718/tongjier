package day2;

import java.util.Random;

public class ZuoYe10 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random a = new Random();
        for (int i = 0; i <arr.length ; i++) {
            int b = a.nextInt(10);
            arr[i]=b;
            System.out.println(arr[i]);
        }
    }
}
