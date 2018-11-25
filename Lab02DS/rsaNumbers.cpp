#include <iostream>
#include <math.h>

using namespace std;

int main() {
  int a, b; cin >> a >> b;
  int counter = 0;

  for (int i = a; i <= b; i++) {
    int numb = 0;
    for (int k = 0; k < i; k++) {
      if(i % k == 0) {
        numb++;
      }
      if(numb == 4) {counter++;}
    }
  }

  cout << "The number of RSA numbers between " <<  a << " and " << b << "is " << counter << endl;
  return 0;
}
