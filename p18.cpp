#include <iostream>
#include <cstdint>
#include <algorithm>

using namespace std;

int main()
{
    cout << "a: ";
    int32_t a; cin >> a;
    
    cout << "b: ";
    int32_t b; cin >> b;
    
    if (a <= b) goto L1;
        
    swap(a, b);

L1:
    int64_t s = 0;
    
    int i = a;
L2:
    if (i > b) goto L3;
    s += i;
    ++i;
    goto L2;
    
L3:   
    cout << "sum(" << a << ", " << b << ") = " << s << endl;
    
    s = int64_t(a + b) * (b - a + 1) / 2;
    
    cout << "sum(" << a << ", " << b << ") = " << s << endl;
    
    return 0;
}