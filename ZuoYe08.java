package day3;

public class ZuoYe08 {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};
        fangfa(arr);
    }
    public static void fangfa(int[] arr){
        int a = arr[0];
        int b = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (a<arr[i]){
                a=arr[i];
                b=i;
            }
        }
        System.out.println(b);
    }
}
