#include <iostream>

using namespace std;

void badSwap(int a, int b)
{
    int t = a;
    a = b;
    b = t;
}

void goodSwap(int& a, int& b)
{
    int t = a;
    a = b;
    b = t;
}

int main()
{
    
    cout << "x = ";
    int x; cin >> x;
    
    cout << "y = ";
    int y; cin >> y;
    
    cout << "before swap x = " << x << ", y = " << y << endl;
    
    //badSwap(x, y);
    goodSwap(x, y);
    
    cout << "after swap x = " << x << ", y = " << y << endl;
    
    return 0;
}