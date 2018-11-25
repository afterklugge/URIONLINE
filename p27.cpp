#include <iostream>
#include <iomanip>
#include <string>
#include <sstream>

using namespace std;

int main()
{
    cout << "the size of multiplication table: ";
    int n; cin >> n;
 
    int w = to_string(n * n).size() + 1;
    
    ostringstream sout;
    
    for (int i = 1; i <= n; ++i)
    {
        for (int j = 1; j <= n; ++j)
        {
            sout << setw(w) <<  i * j;
        }
        sout << "\n";
    }
    
    cout << sout.str() << endl;
    
    return 0;
}