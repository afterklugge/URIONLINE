#include <iostream>
#include <string>

using namespace std;

int main()
{
    int c = 0;
    
    bool inQuote = false;
    string line;
    int start = -1;
    while (getline(cin, line))
    {
        ++c;
        for (int i = 0; i < int(line.size()); ++i)
        {
            if (line[i] == '\"' and not inQuote)
            {
                start = i;
                inQuote = true;
            }
            else if (line[i] == '\"' and inQuote)
            {
                cout << c << ": " << line.substr(start, i - start + 1) << endl;
                inQuote = false;
            }
        }
    }
    
    return 0;
}