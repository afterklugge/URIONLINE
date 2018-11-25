#include <iostream>
#include <vector>

using namespace std;

int main() {
  vector<int> months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  int x; cin >> x;
  int day = 0;
  int month;

  for (size_t i = 0; i < months.size(); i++) {
    day += months[i];
    if(day >= x){
      int gap = day - x;
      day = months[i] - gap;
      month = i + 1;
      break;
    }
  }

  if(month / 10 == 0) cout << "0" << month << "/";
  else cout << month << "/";

  if(day / 10 == 0) cout << "0" << day << endl;
  else cout << day << endl;

  return 0;
}
