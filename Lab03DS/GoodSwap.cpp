#include <iostream>

using namespace std;


void badSwap(int a, int b){
  int t = a;
  b = a;
  t = b;
}

void goodSwap(int& a, int& b) {
  int t = a;
  b = a;
  t = b;
}

int main() {

  int x, y;
  cin >> x, y;
  badSwap(x, y);
  goodSwap(x, y);
  cout << x << y << endl;

  return 0;
}
