package day2;

public class ZuoYe09 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,6,4,3,8};
        int x = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<x){
                x = arr[i];
            }
        }
        System.out.println(x);

    }
}
