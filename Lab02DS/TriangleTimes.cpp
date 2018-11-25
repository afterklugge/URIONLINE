#include <iostream>

using namespace std;

int main()
{
	int a;
	int b;
	int c;

  	cin >> a;
 	  cin >> b;
  	cin >> c;

	int sum = a + b + c;

	if (sum > 180 or sum < 180) {
		cout << "Error";
	} else {
		if (a == b and a == c) {
  		cout << "Equilateral";
 		} else {
 			if (a == b or b == c or a == c) {
    			cout << "Isosceles";
  			} else {
  				cout << "Scalene";
  			}
  		}
	}
}
