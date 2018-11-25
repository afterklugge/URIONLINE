#include <iostream>


using namespace std;

int main() {
  int a;
  cin >> a;

  for (size_t i = 1; i <= a; i++) {
    cout << a << " X " << i << " = " << a * i << endl;
  }

  return 0;
}
