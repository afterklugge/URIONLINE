#include <iostream>

using namespace std;

int main() {

  int counter = 0;

  for (size_t i = 0; i < 6; i++) {
    char n; cin >> n;

    if(n == 'W') counter++;
  }

  if(counter == 5 or counter == 6) cout << 1 << endl;
  else if (counter == 3 or counter == 4) cout << 2 << endl;
  else if (counter == 1 or counter == 2) cout << 3 << endl;
  else cout << -1 << endl;

  return 0;
}
