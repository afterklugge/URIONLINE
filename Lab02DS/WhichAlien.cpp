#include <iostream>

using namespace std;

int main()
{
	int ant;
	int eyes;


	cin >> ant;
	cin >> eyes;

	if (ant >= 3 and eyes <= 4) {
		cout << "TroyMartian\n";
	}
	if (ant <= 6 and eyes >= 2) {
		cout << "VladSaturnian\n";
	}
	if (ant <= 2 and eyes <= 3) {
		cout << "GraemeMercurian\n";
	}
}
