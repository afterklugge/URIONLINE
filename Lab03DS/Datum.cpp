#include <iostream>
#include <vector>
#include <string>

using namespace std;
int main() {

  int d, m; cin >> d >> m;
  d--;
  m--;

  vector<int> months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  vector<string> day = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

  for (size_t i = 0; i < m; i++) {
    d += months[i];
  }
  cout << day[d % 7] << endl;

  return 0;
}
