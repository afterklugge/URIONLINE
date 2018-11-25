#include <bits/stdc++.h>


using namespace std;

int main() {
  int numbers; cin >> numbers;
  double x;
  double min;
  cin >> x;
  min = x;
  for (size_t i = 0; i < numbers; i++) {
      cin >> x;
      if(x < min){
        min = x;
      }
  }
  cout << fixed << setprecision(2) << min << endl;
  return 0;
}
