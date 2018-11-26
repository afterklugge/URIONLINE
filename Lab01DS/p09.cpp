#include <iostream>

using namespace std;

int main()
{
    cout << "some int: ";
    int x; cin >> x;
    
    int r = x;
    if (r < 0)
    {
        r = -r;
    }
    
    cout << "|" << x << "| = " << r << endl;
    
    return 0;
}