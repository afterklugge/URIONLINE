#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


int main() {
  vector<char> x = {'A', 'B', 'C', 'D', 'E'};
  int b, n; cin >> b >> n;

  while(b != 4){

  for (size_t i = 0; i < n; i++) {
    if(b == 1){
      rotate(x.begin(), x.begin() + 1, x.end()); // move first element to last
    } else if(b == 2){
      rotate(x.rbegin(), x.rbegin() + 1, x.rend()); // move last element to first
    } else if(b == 3){
      rotate(x.begin(), x.begin() + 1, x.begin() + 2); // swap the first and second element
    }
  }

  cin >> b >> n;
}
  for(char e: x){
    cout << e << " " ;
  }
  cout << endl;

  return 0;
}
