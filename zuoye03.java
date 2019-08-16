package day1;

public class zuoye03 {
    public static void main(String[] args) {
        int a = 123;
        int b = a % 10 ; //获取个位
        int c = a / 10;
        int d = c % 10;  //获取十位
        int e = a / 100; //获取百位
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);

    }
}
