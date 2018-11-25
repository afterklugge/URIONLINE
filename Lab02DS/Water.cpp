#include <iostream>


using namespace std;

int main() {
  int a, b, c;

  cin >> a >> b >> c;
  if(a == b && a == c && b == c) { cout << "0" << endl;}
  if(a > b && a > c) { cout << a - b << endl;}
  if(b > a && b > c) { cout << b - a << endl;}
  if(c > a && c > b) { cout << c - a << endl;}

  return 0;
}
