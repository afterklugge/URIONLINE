#include <iostream>
#include <iomanip>

using namespace std;

int main(){

  int n; cin >> n;

  for (size_t i = 0; i < n; i++) {
    int letters; cin >> letters;
    if(letters >= 0 and letters <= 30){cout << 38 << endl;}
    else if(letters > 30 and letters <= 50){cout << 55 << endl;}
    else if(letters > 50 and letters <= 100){cout << 73 << endl;}
    else if(letters > 100){
      int count = 73;
      for (size_t j = letters; j > 100; j -=50) {count += 24;}
      cout << count << endl;
    }
}
  return 0;
}
