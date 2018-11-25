#include <iostream>
#include <iomanip>

using namespace std;

int main(){
  double money;
  int percent, year;
  cin >> money >> percent >> year;

  cout << "0 " << fixed << setprecision(2) << money << endl;

  for (size_t i = 1; i <= year; i++) {
    money = money + ((money * percent) / 100);
    cout << i << " " << fixed << setprecision(2) << money << endl;
  }

  return 0;
}


for
