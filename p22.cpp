#include <iostream>
#include <string>

using namespace std;

int main()
{
    cout << "name of language: ";
    string name; cin >> name;


    string border(name.size() + 4, '*');
    
    cout << border << endl;
    cout << "* " + string(name.size(), ' ') + " *" << endl;
    cout << "* " + name + " *" << endl;
    cout << "* " + string(name.size(), ' ') + " *" << endl;
    cout << border << endl;
    
    return 0;
}