package day3;

public class ZuoYe14 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,4,4,4,4};
        fangfa(arr);
    }
    public static void fangfa(int[] arr){
        for (int i = 0; i < arr.length; i++) {// 0
            int a = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    a++;
                }
            }
            System.out.println(arr[i] + "在数组中出现了" + a + "次");
        }
    }
}

