#include <cstdlib>
#include <iostream>

using namespace std;
long powerLog(int x, int n)
{
    if(n==0) return 1;
    if(n==1) return x;
    if(n%2==0)
    {
       return powerLog(x*x,n/2);
    }
    else
    {
       return powerLog(x*x,n/2)*x;
    }
}
int main(int argc, char *argv[])
{
    long sonuc=powerLog(5,12);
    cout << sonuc ;
    system("PAUSE");
    return EXIT_SUCCESS;
}
