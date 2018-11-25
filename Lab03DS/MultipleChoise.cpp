#include <iostream>
#include <vector>
#include <string>
using namespace std;

int main(int argc, char const *argv[]) {
  int n; cin >> n;
  vector<string> responses(n);
  for (size_t i = 0; i < n; i++) {
    cin >> responses[i];
  }

  string x;
  int counter = 0;
  for (size_t i = 0; i < n; i++) {
     cin >> x;
     if(x == responses[i]){
       counter++;
     }
  }

  cout << counter << endl;
  return 0;
}
