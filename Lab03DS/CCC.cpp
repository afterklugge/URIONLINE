#include <iostream>
#include <vector>

using namespace std;

int main() {
  vector<int> burgers = {461, 431, 420, 0};
  vector<int> sideOrder = {100, 57, 70, 0};
  vector<int> drinks = {130, 160, 118, 0};
  vector<int> dessert = {167, 266, 75, 0};

  int bg, sd, dr, ds; cin >> bg >> sd >> dr >> ds;
  bg--;
  sd--;
  dr--;
  ds--;

  int calories = 0;
  calories += burgers[bg];
  calories += sideOrder[sd];
  calories += drinks[dr];
  calories += dessert[ds];

  cout << "Your total Calorie count is " << calories << "." << endl;
  return 0;
}
