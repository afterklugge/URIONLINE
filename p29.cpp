#include <iostream>
#include <sstream>

using namespace std;

int main()
{
    string line;
    while (getline(cin, line))
    {
        istringstream sinp(line);
        int x = 0;
        if (sinp >> x >> ws and sinp.eof())
        {
            cout << "next int: " << x + 1 << endl;
        }
        else
        {
            cout << "incorrect int: " << line << endl;
        }
    }
}