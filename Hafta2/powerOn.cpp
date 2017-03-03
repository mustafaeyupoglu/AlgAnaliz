#include <cstdlib>
#include <iostream>

using namespace std;
int sayac=0;
long long power(long long a, long long b)
{
    long long toplam=1;
    for(int i=0;i<b;i++){
        toplam*=a;
        sayac++;
    }
    return toplam;
}
int main(int argc, char *argv[])
{
    long long sonuc=power(2,60);
    cout << sonuc<<" "<<sayac;
    system("PAUSE");
    return EXIT_SUCCESS;
}

