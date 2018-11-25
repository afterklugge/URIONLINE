#include <iostream>
#include <algorithm>


using namespace std;

int main() {
  int n; cin >> n;
  string result;
  for (size_t i = 0; i < n; i++) {
    string x; cin >> x;
    if(n % 2 == 0) {
      if(i % 2 != 0) {
        reverse(x.begin(), x.end());
      }
    } else {
      if(i % 2 == 0) {
        reverse(x.begin(), x.end());
      }
    }
    result += x;
  }

  reverse(result.begin(), result.end());

  cout << result << endl;
  return 0;
}
