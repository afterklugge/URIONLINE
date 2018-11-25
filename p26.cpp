#include <iostream>
#include <iomanip>
#include <string>
#include <vector>
#include <sstream>

using namespace std;

int main()
{
    vector<string> lines;
    
    string line;
    while (getline(cin, line))
    {
        lines.push_back(line);
    }

    // C++ 03 (98)
    // ostringstream sout;
    // sout << lines.size();
    // int w = sout.str().size();
    
    // C++11
    int w = to_string(lines.size()).size();
    
    int c = 0;
    for (const string& e: lines)
    {
        ++c;
        cout << setw(w) << c << ": " << e << "\n";
    }
    
    return 0;
}