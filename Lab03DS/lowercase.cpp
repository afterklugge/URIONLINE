#include <iostream>
#include <algorithm>
#include <string>
#include <vector>

using namespace std;

int main(int argc, char const *argv[]) {

  int n; cin >> n;
  string x;
  for (size_t i = 0; i < n; i++) {
  cin >> x;
    for (size_t j = 0; j < x.length(); j++) {
      if(isupper(x[j])){
        x[j] = tolower(x[j]);
      }
    }
    for(char c: x) {
      cout << c;
    }
    cout << endl;
  }
  return 0;
}
