#include <iostream>
#include <vector>

using namespace std;

int main() {
  int n; cin >> n;
  for (size_t i = 0; i < n; i++) {
    int counter = 0;
    vector<int> a;
    int x; cin >> x;
    for (size_t i = 0; i < x*2; i++) {
      int A; cin >> A;
      a.push_back(A);
    }

    for (size_t i = 0; i < a.size() / 2; i++) {
      counter += a[i] * a[a.size() / 2 + i]; // середину array умножить на весь array
    }

    cout << counter << endl;
  }
  return 0;
}
