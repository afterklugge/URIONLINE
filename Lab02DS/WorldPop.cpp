#include <iostream>
#include <iomanip>

using namespace std;

int main(int argc, char const *argv[]) {
  double p; cin >> p;
  int startY; cin >> startY;
  double population; cin >> population;
  int endY; cin >> endY;

  double result;
  for (size_t i = startY; i < endY; i++) {
    result = population * p / 100;
    population += result;
  }

  cout << fixed << setprecision(0) << population << endl;
  return 0;
}
