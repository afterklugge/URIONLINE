#include <iostream>
#include <stdexcept>
#include <algorithm>
#include <ctime>

using namespace std;

int gcd(int a, int b)
{
    if (a == 0 and b == 0)
    {
        throw invalid_argument("gcd(0, 0) is not defined");
    }

    a = abs(a);
    b = abs(b);
    
    if (a == 0)
    {
        return b;
    }
    
    if (b == 0)
    {
        return a;
    }
    
    int r = a % b;
    while (r != 0)
    {
        a = b;
        b = r;
        r = a % b;
    }
    
    return b;
}

int main()
{
    int a;
    int b;
    while (cin >> a >> b)
    {
        try
        {
            clock_t beg = clock();
            int d = gcd(a, b);
            clock_t end = clock();
            
            cout << "time: " << double(end - beg) / CLOCKS_PER_SEC << endl;
            cout << "gcd(" << a << "," << b << ") = " << d << endl; 
        }
        catch (invalid_argument& e)
        {
            cout << e.what() << endl;
        }
    }
}