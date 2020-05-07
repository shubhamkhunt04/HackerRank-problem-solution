import java.util.*;
import java.io.*;

class loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        
            int s=0;
            int j,i,k=0;
            int power = 0;
            for(i = a;k<n;k++)
            {
                j = (int)Math.pow(2,power);
                s = a + j*b +s;
                power++;
                System.out.print(s+" ");
                s=s-a;
            }
        }       
}

