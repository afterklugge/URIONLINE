#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {

  vector<int> n;
  for (size_t i = 0; i < 100; i++) {
    int x; cin >> x;
    x = n[i];
  }

  cout << sort(n.begin(), n.end()) << endl;

  return 0;
}
