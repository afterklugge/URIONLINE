#include <bits/stdc++.h>
using namespace std;

int main()
{
  vector<int> initial(4);
  vector<int> increase (4);

  for (size_t i = 0; i < initial.size(); i++) {
    cin >> initial[i];

  }
  // 1 2 3 4
  if(initial[0] != initial[1] and initial[0] != initial[2] and initial[0] != initial[3] and initial[1] != initial[2] and initial[1] != initial[3] and initial[2] != initial[3]){
    increase = initial;
    sort(increase.begin(), increase.end());
    if(increase == initial) cout << "Fish Rising" << endl;
    else cout << "Fish Diving" << endl;

  } else if(initial[0] == initial[1] and initial[1] == initial[2] and initial[2] == initial[3]) {
    cout << "Constant Depth" << endl;
  } else {
    cout << "No Fish" << endl;
  }

	return 0;
}
