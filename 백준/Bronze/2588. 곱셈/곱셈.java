import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int num1 = B%10;
        int num2 = (B/10)%10;
        int num3 = B/100;
        
        System.out.println(A*num1);
        System.out.println(A*num2);
        System.out.println(A*num3);
        System.out.println(A*B);
        
    }
}