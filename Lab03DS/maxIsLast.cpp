#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;

int main() {
  double n; cin >> n;

  vector<double> arr(n);
  double max = 0;
  int index = 0;


  for (size_t i = 0; i < n; i++) {
    cin >> arr.at(i);

    if(max < arr.at(i)){
        max = arr.at(i);
        index = i;
  }
}

  for (size_t i = 0; i < arr.size(); i++) {
    if(index == i) {

    } else {
      cout << fixed << setprecision(2) << arr.at(i) << endl;
    }
  }

  cout << fixed << setprecision(2) << arr.at(index) << endl;

  return 0;
}
