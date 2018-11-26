#include <iostream>
#include <limits>

using namespace std;

int main()
{
    cout << "number of bytes in int: " << sizeof(int) << "\n";
    cout << "min int: " << numeric_limits<int>::min() << "\n";
    cout << "max int: " << numeric_limits<int>::max() << "\n";
    
    cout << "1st number: ";
    int a;
    cin >> a;
    
    cout << "2nd number: ";
    int b;
    cin >> b;
    
    int sum = a + b;
	int sub = a - b;
	int mul = a * b;
	int div = a / b;
	int rem = a % b;
    
    cout << a << " + " << b << " = " << sum << "\n";
	cout << a << " - " << b << " = " << sub << "\n";
	cout << a << " * " << b << " = " << mul << "\n";
	cout << a << " / " << b << " = " << div << "\n";
	cout << a << " % " << b << " = " << rem << "\n";
    
    cout << "after ++" << a << " will be ";
    ++a;
    cout << a << "\n";
    
    cout << "after --" << b << " will be ";
    --b;
    cout << b << "\n";
    
    return 0;
}