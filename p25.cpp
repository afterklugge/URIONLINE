#include <iostream>

using namespace std;

int main()
{
    string w1;
    string w2;
    
    while (cin >> w1 >> w2)
    {
        if (w1 < w2)
        {
            cout << w1 << " < " << w2 << endl;
        }
        else if (w1 == w2)
        {
            cout << w1 << " = " << w2 << endl;
        }
        else
        {
            cout << w1 << " > " << w2 << endl;
        }
    }
    
    return 0;
}