
import java.io.*;
import java.util.*;
public class TwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X and Y points");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = computePointofInterception(x, y);
        System.out.println("Interception point is " + c);
    }

 public static int check(int a)
 {
     if(a<=12)
         return a;
     else
         return a%12;
 }
    public static int computePointofInterception(int x, int y) {
        while (true) {
            x=check(x);
            y=check(y);
            x += 2;
            y += 1;
            x=check(x);
            y=check(y);
            if (x == y) {
                int r=check(x);
                return r;
            }
        }
    }
}


