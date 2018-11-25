#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector<int> asc = {1, 2, 3, 4, 5, 6, 7, 8};
	vector<int> des = {8, 7, 6, 5, 4, 3, 2, 1};
	vector<int> current;
	for(int i = 0; i < 8; i++)
	{
		int K; cin >> K;
		current.push_back(K);
	}
	if (current == asc)
	{
		cout << "ascending";
	} else if (current == des) {
		cout << "descending";
	} else {
		cout << "mixed";
  }
	return 0;
}
