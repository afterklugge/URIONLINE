#include <iostream>

using namespace std;

int main()
{
    cout << "number of points: ";
    int p; cin >> p;
    
    char g;
    
    if (p > 100)
    {
        g = 0;
    }
    else if (80 <= p)
    {
        g = 'A';
    }
    else if (p >= 60 )
    {
        g = 'B';
    }
    else if (p >= 40)
    {
        g = 'C';
    }
    else if (p >= 20)
    {
        g = 'D';
    }
    else if (p >= 0)
    {
        g = 'F';
    }
    else
    {
        g = 0;
    }
    
    
    if (g != 0)
    {
        cout << "grade: " << g << endl;
    }
    else
    {
        cout << "incorrect data" << endl;
    }
    
    return 0;
}