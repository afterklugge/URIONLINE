#include <iostream>
#include <math.h>

using namespace std;

int main() {
  int n; cin >> n;
  int antonia = 100;
  int david = 100;

  for (size_t i = 0; i < n; i++) {
    int a, d; cin >> a >> d;
    if(a > d) { david -= a;}
    else if(d > a) { antonia -= d;}
  }
  cout << antonia << endl;
  cout << david << endl;
  
  return 0;
}
