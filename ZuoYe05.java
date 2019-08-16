package day2;

public class ZuoYe05 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 100; i <=999 ; i++) {
            int b = i%10;
            int c = i/10%10;
            int d = i/100;
            if (i==b*b*b+c*c*c+d*d*d){
                a=a+1;
                System.out.print(i+" ");
                if (a%2==0){
                    System.out.println(" ");
                }

            }

        }
        System.out.println(a);
    }
}
