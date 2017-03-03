#include <cstdlib>
#include <iostream>

using namespace std;
int sayac=0;
long long powerLog(long long x, long long n)
{
    sayac++;
    if(n==0) return 1;
    if(n==1) return x;
    if(n%2==0)
    {
       return powerLog(x*(long long)x,n/2);
    }
    else
    {
       return powerLog(x*(long long)x,n/2)*x;
    }
}
int main(int argc, char *argv[])
{
    long long sonuc=powerLog(2,60);
    cout << sonuc<<+" sayac:"<<sayac ;
    system("PAUSE");
    return EXIT_SUCCESS;
}
