#include <bits/stdc++.h>

using namespace std;

int main()
{
	iostream::sync_with_stdio(false);

	int a; cin >> a;
	int b; cin >> b;

	while (a <= b) {
		cout << "All positions change in year " << a << endl;
		a += 60;
	}
	return 0;
	}
