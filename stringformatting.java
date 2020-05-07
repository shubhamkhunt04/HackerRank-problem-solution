import java.io.*;
import java.util.*;

public class stringformatting {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        /* Enter your code here. Print output to STDOUT. */

                int a = A.length();
                int b = B.length();
                int r = A.compareTo(B);
                System.out.println(a+b);
                if(r>0)
                System.out.println("Yes");
                else
                System.out.println("No");

    
                 A = A.substring(0,1).toUpperCase()+A.substring(1).trim();
                 B = B.substring(0,1).toUpperCase()+B.substring(1).trim();
                
                System.out.print(A+" "+B);

        
    }
}



