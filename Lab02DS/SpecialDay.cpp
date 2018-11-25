#include <iostream>
using namespace std;

int main() {
  int a, b;
  cin >> a >> b;


  if (a == 2 and b == 18) {
    cout << "Special" << '\n';
  } else if(a == 2) {
    if(b < 18) {
      cout << "Before" << endl;
    } else {
      cout << "After" << endl;
     }
  } else if(a > 2) {
    cout << "After" << endl;
  } else {
    cout << "Before" << endl;
  }

  return 0;
}
