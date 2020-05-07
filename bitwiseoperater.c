#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k)
{
    //Write your code here.
    int result1=0,result2=0,result3=0;
    int And,Or,Xor;
    for(int a = 1 ; a<n; a++)
    {
        for(int b = a+1 ; b<n; b++)
        {
            And = a&b;
            if(And<k&&And>result1)
                result1 = And;

            Or = a|b;
            if(Or<k&&Or>result2)
                result2 = Or;

            Xor = a^b;
            if(Xor<k&&Xor>result3)
                result3 = Xor;
        }
    }
    printf("\n%d",result1);
    printf("\n%d",result2);
    printf("\n%d",result3);
}

int main()
{
    int n, k;

    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);

    return 0;
}

