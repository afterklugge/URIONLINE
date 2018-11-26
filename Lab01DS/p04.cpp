#include <iostream>
#include <limits>

using namespace std;

int main()
{
    cout << "number of bytes in int: " << sizeof(double) << "\n";
    cout << "min int: " << numeric_limits<double>::min() << "\n";
    cout << "max int: " << numeric_limits<double>::max() << "\n";
    
    cout << "1st number: ";
    double a;
    cin >> a;
    
    cout << "2nd number: ";
    double b;
    cin >> b;
    
    double sum = a + b;
    double sub = a - b;
    double mul = a * b;
    double div = a / b;
    
    cout << a << " + " << b << " = " << sum << "\n";
    cout << a << " - " << b << " = " << sub << "\n";
    cout << a << " * " << b << " = " << mul << "\n";
    cout << a << " / " << b << " = " << div << "\n";
    
    cout << "after ++ " << a << " will be ";
    ++a;
    cout << a << "\n";
    
    cout << "after -- " << b << " will be ";
    --b;
    cout << b << "\n";
    
    return 0;
}