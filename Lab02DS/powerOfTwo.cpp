#include <iostream>
#include<cmath>

using namespace std;
int main() {
  int n; cin >> n;
  int base = 1;
  int result = 0;

  while(base < n){
    base *= 2;
    result++;
  }

  cout << result << endl;
  return 0;
}
