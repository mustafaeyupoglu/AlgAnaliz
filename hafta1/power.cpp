#include <iostream>

using namespace std;
int power(int a, int b)
{
    int toplam=1;
    for(int i=0;i<b;i++){
        toplam*=a;
    }
    return toplam;
}
int main()
{
    int sonuc=power(5,2);
    cout << sonuc;
    return 0;
}
