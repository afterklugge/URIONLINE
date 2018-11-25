#include <iostream>
#include <string>
#include <sstream>

using namespace std;

int main()
{
    string line;
    while (getline(cin, line))
    {
        if (line.empty())
        {
            cout << line << endl;
        }
        else
        {
            istringstream sinp(line);
            string name; sinp >> name;
            int sum = 0;
            int grade;
            while (sinp >> grade)
            {
                sum += grade;
            }
            cout << name << ": " << sum << endl;
        }
    }
    
    return 0;
}