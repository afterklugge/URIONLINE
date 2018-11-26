#include <iostream>

using namespace std;

int main()
{
    cout << "your age: ";
    int age; cin >> age;
    
    if (age < 24)
    {
        cout << ":-)" << endl;
    }
    else
    {
        cout << ":-(" << endl;
    }
    
    cout << (age < 24 ? ":-)": ":-(") << endl;
    
    return 0;
}