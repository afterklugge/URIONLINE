#include <iostream>
#include <vector>
using namespace std;


int main() {
  vector<int> bank = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
  int testcase; cin >> testcase;
  int card;

  for (size_t i = 0; i < testcase; i++) {
    cin >> card;
    bank[card - 1] = 0;
  }

  double cash = 0;
  for (size_t i = 0; i < bank.size(); i++) {
    cash += bank[i];
  }

  double average = cash / (bank.size() - testcase);
  int offer; cin >> offer;

  if(average < offer) {
    cout << "deal" << endl;
  } else {
    cout << "no deal" << endl;
  }
  return 0;
}
