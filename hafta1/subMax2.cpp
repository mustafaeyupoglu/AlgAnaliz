#include <iostream>

using namespace std;
int maxSubSum(int liste[8])
{
    int maxSum=0;

    int i,j,k;
    for(i=0; i< sizeof(liste);i++){
	int thisSum=0
        for ( j=0;j<sizeof(liste);j++){
            for( k=i;k<j;k++){
                thisSum += liste[k];
            }
            if(thisSum > maxSum)
            {
                maxSum = thisSum;
            }
    }
    }
return maxSum;
        }
int main()
{
    int liste[]={4, -3, 5, -2, -1, 2, 6,-2};
    cout<< maxSubSum(liste);
    return 0;
}
