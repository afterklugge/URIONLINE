#include <iostream>
#include <algorithm>

using namespace std;

int main() {
  int n; cin >> n;
  for (size_t i = 1; i <= n; i++) {
    int step; cin >> step;
    string word; getline(cin, word);
    word.erase(word.begin() + step);
    cout << i << word << endl;
  }
  return 0;
}
