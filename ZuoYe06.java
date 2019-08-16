package day3;

public class ZuoYe06 {
    public static void main(String[] args) {
        int a = 1;
        int[] arr={1,2,3,1,3,4,5};
        fangfa(arr,a);
    }
    public static void fangfa(int[] brr,int key){
        int count = 0;
        for (int i = 0; i <brr.length ; i++) {
            if (key==brr[i]){
                System.out.println(i);
                count++;
            }
        }
        if (count==0){
            System.out.println("数组中没有这个数字");
        }

    }
}
