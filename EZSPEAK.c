#include <stdio.h>
#include <string.h>
int main()
{
    int T,N;
    
    scanf("%d",&T);
    for (int i = 0; i < T; i++)
    {
        scanf("%d",&N);
        char S[N];
        scanf("%s",S);
        //printf("\n%s",S);
        int count = 0;
        for (int j = 0; j < strlen(S); j++)
        {
            if (S[j]!='a'&& S[j] != 'e'&& S[j]!= 'i'&& S[j]!='o'&& S[j]!= 'u')
            {
                count++;
            }
            else{
                count = 0;
            }  
            if (count>=4)
            {
                break;
            }
        }
            if (count>=4)
            {
                printf("NO\n");
            }else
            {
                printf("YES\n");
            }
    }
    
}