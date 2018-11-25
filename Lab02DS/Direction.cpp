#include <iostream>

using namespace std;

int main() {

  int n; cin >> n;
  for (size_t i = 0; i < n; i++) {
    int direction; cin >> direction;

    if((direction >= 315 and direction <= 360) or (direction >= 90 and direction <= 45)){
      cout << 'N' << endl;
    } else if(direction < 45 and direction <= 135) {
      cout << 'E'<< endl;
    } else if(direction < 135 and direction <= 225) {
      cout << 'S' << endl;
    } else if(direction < 225 and direction <= 315) {
      cout << 'W' << endl;
    }
  }
  return 0;
}
