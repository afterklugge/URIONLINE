#include <iostream>
#include <vector>
using namespace std;

int main() {
  vector<int> v1 = {1, 1, 2, 2, 2, 8};
  vector<int> v2;
  vector<int> v3;

  for (size_t i = 0; i < 6; i++) {
    int x; cin >> x;
    v2.push_back(x);
    if(v1[i] != v2[i]){
        if(v1[i] > v2[i]){
            v3.push_back(v1[i] - v2[i]);
        }
        else {
            v3.push_back(v1[i] - v2[i]);
        }
    } else {
      v3.push_back(0);
    }
  }


  for (size_t i = 0; i < 6; i++) {
      cout << v3[i] << " ";
  }
  return 0;
}
