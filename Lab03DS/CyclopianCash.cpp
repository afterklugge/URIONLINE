#include <iostream>
#include <vector>
#include <iomanip>
#include <algorithm>

using namespace std;

int main() {
  vector<double> numbers;
  double result;
  int n; cin >> n;
  for (size_t i = 0; i < n; i++) {
    double x; cin >> x;
    numbers.push_back(x);
  }

  sort(numbers.begin(), numbers.end());

  if(numbers.size() % 2 == 0){
    result = (numbers[numbers.size() / 2] + numbers[((numbers.size() / 2) - 1)]) / 2;
  } else {
    result = numbers[numbers.size() / 2];
  }
  cout << fixed << setprecision(1) << result;
  return 0;
}
