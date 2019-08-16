package day3;

public class ZuoYe05 {
    public static void main(String[] args) {
        int a = 1;
        int[] arr={1,2,3,1,3,4,5};
        int b = fangfa(a,arr);
        System.out.println(b);
    }
    public static int fangfa(int a,int[] arr){
        int b = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (a==arr[i]){
                b++;
            }
        }
        return b;
    }
}
