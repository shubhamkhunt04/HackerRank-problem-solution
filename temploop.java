import java.util.*;
class temploop
{
    
    int query[] = new int[1000];
    public static void main(String[] args) {

        
        temploop t1= new temploop();
    
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i = 0 ; i<t;i++){
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();

        t1.query[i]=a;
        t1.query[i+1]=b;
        t1.query[i+2]=n;

        }
        s.close();

        for(int i = 0 ; i<t;i++)
          t1.findx(t1.query[]);

        
        }
        public void findx(int[] query)
        {
            int a=query[0];
            int b = query[1];
            int n = query[2];
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