#include <iostream>

using namespace std;

int main() {
  int m; cin >> m;

  int q = m / 25;
  int temp = m - (q * 25); // остаток от quarters
  int d = temp / 10;
  temp = temp - (d * 10); // остаток от dimes
  int n = temp / 5;
  temp = temp - (n * 5); // остаток от nickels
  int c = temp / 1;

  if(q == 0) {
    cout << m << " cents requires " << d << " dimes, " << n << " nickels, " << c << " cents." << endl;
  } else if (d == 0){
    cout << m << " cents requires " << q << " quarters, " << n << " nickels, " << c << " cents." << endl;
  } else if (n == 0) {
    cout << m << " cents requires " << q << " quarters, " << d << " dimes, " << c << " cents." << endl;
  } else if (c == 0){
    cout << m << " cents requires " << q << " quarters, " << d << " dimes, " << n << " nickels, " << endl;
  } else {
    cout << m << " cents requires " << q << " quarters, " << d << " dimes, " << n << " nickels, " << c << " cents." << endl;
  }
  return 0;
}
