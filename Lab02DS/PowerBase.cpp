#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main() {
  double a, b;
  int number;
  cin >> number;
  for (size_t i = 0; i < number; i++) {
    cin >> a >> b;
    cout << fixed << setprecision(2) << pow(a,b) << endl;
  }
  return 0;
}
