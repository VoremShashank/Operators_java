import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
            boolean x= (year%4) ==0;
            boolean y= (year%100) !=0;
            boolean z= ((year%100==0) && (year%400==0));
            if (x && (y|| z)){
                System.out.println("leap year");
            }
            else {
                System.out.println("not a leap year");
            }
        }
        
    }
    
}
