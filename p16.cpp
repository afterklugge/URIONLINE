#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    const double kCmPerInch = 2.54;
    
    for (;;)
    {
        cout << "1. inch -> cm" << endl;
        cout << "2. cm -> inch" << endl;
        cout << "any other number: exit" << endl;
        
        cout << "your choice: ";
        int choice; cin  >> choice;
        
        if (choice != 1 and choice != 2) break;
        
        double length = 0;
        
        switch (choice)
        {
            case 1:
                cout << "inches: ";
                cin >> length;
                cout << "cm: " << fixed << setprecision(2)
                     << kCmPerInch * length << endl;
            break;
            case 2:
                cout << "cm: ";
                cin >> length;
                cout << "inches: " << fixed << setprecision(2)
                     << length / kCmPerInch << endl;
            break;
        }
    }
    
    return 0;
}