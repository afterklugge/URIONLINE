#include <iostream>

using namespace std;

int main()
{
    cout << "size of bool: " << sizeof(bool) << endl;
    cout << "false: " << false << endl;
    cout << "true: " << true << endl;
    
    cout << "AND operator: " << endl;
    cout << false << " and " << false 
         << " = " << (false and false) << endl;
    cout << false << " and " << true 
         << " = " << (false and true) << endl;
    cout << true << " and " << false 
         << " = " << (true and false) << endl;
    cout << true << " and " << true 
         << " = " << (true and true) << endl;
    
    cout << "OR operator: " << endl;
    cout << false << " or " << false 
         << " = " << (false or false) << endl;
    cout << false << " or " << true 
         << " = " << (false or true) << endl;
    cout << true << " or " << false 
         << " = " << (true or false) << endl;
    cout << true << " or " << true 
         << " = " << (true or true) << endl;
    
    cout << "NOT operator: " << endl;
    cout << "not " << false << " = " << (not false) << endl;
    cout << "not " << true << " = " << (not true) << endl;
    
    
    // any number except zero is true
    // 0 is false (for int, double, ...)
    cout << -5 << " and " << 3 << " = " << (-5 and 3) << endl;
    
    cout << boolalpha;
    // int + bool
    int x = 5;
    cout << 5 << " + " << "true" << " = " << x + true << endl; 
    
    cout << "1st int: ";
    int a; cin >> a;
    
    cout << "2nd int: ";
    int b; cin >> b;
    
    
    cout << b << " is a divisor of " << a << ": "
        << (b != 0 and a % b == 0);
        
    return 0;
}