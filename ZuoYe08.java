package day2;

public class ZuoYe08 {
    public static void main(String[] args) {
        int x=0;
        for (int i = 1; i <100 ; i++) {
            int a = i%10;
            int b = i/10;
            if (a!=9&&b!=9){
                x = x+1;
                System.out.print(i+" ");
                if (x%5==0){
                    System.out.println(" ");
                }

            }
        }
    }
}
