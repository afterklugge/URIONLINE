#include <iostream>
#include <cmath>

using namespace std;

int main() {
	int n; cin >> n;
	int A = 0,B = 0,C = 0,D = 0,E = 0,F = 0;
	while(n != -1)
	{
		for (int i = 0; i < 6; i++) {
			if (n >= 0 and n < 10000) {
				A++;
				break;
			}
			if (n > 9999 and n < 20000)
			{
				B++;
				break;
			}  if (n > 19999 and n < 30000)
			{
				C++;
				break;
			}  if (n > 29999 and n < 40000)
			{
				D++;
				break;
			}  if (n > 39999 and n < 50000)
			{
				E++;
				break;
			}  if (n > 49999 and n <= 1000000)
			{
				F++;
				break;
			}
		}
		cin >> n;
	}
	cout << A << endl;
	cout << B << endl;
	cout << C << endl;
	cout << D << endl;
	cout << E << endl;
	cout << F << endl;
	return 0;
}
