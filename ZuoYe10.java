package day3;

public class ZuoYe10 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={1,2,3,4,5,6};
        int a = 2;
        int b = 3;
        int c = 4;
        equals(arr1,arr2);
        fill(arr1,a);
        fill(arr1,a,b,c);

    }
    public static void equals(int[] arr1,int[] arr2){
        for (int i = 0; i <arr1.length ; i++) {
            if (arr1.length==arr2.length&&arr1[i]==arr2[i]){
                System.out.println("两个数组是相同的");
            }else {
                System.out.println("两个数组是不相同的");
            }
        }
    }
    public static int[] fill(int[] arr,int value){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=value;
        }
        return arr;
    }
    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value){
        for (int i = fromIndex; i <toIndex ; i++) {
            arr[i]=value;
        }
        return arr;
    }
}
