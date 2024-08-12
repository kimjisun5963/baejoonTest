import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
        
            System.out.println(A+B+C);
        }catch(Exception e){
             System.out.println("오류발생");
        }
        sc.close();
    }
}