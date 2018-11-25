#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    const double kCmPerInch = 2.54;
    
    cout << "length in inches: ";
    double inch;
    cin >> inch;
    
    double cm = kCmPerInch * inch;
    
    cout << fixed << setprecision(4)
         << inch << " in. = " << cm << " cm." << endl;
 
    return 0;
}