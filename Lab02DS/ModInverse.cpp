#include <iostream>

using namespace std;

int main(int argc, char const *argv[]) {
  int m, x;
  cin >> x >> m;
  int mod = 0;
  for (size_t i = 1; i < m; i++) {
      int temp = (x * i) % m;
      if(temp == 1) {
        mod = i;
        break;
      }
  }

  if(mod != 0) {
    cout << mod << endl;
  } else {
    cout << "No such integer exists." << endl;
  }
  return 0;
}
