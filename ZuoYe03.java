package day3;

public class ZuoYe03 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int a = fangfa(arr);
        System.out.println(a);
    }
    public static int fangfa(int arr[]){
        int a = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (a>arr[i]){
                a = arr[i];
            }
        }
        return a;
    }
}
