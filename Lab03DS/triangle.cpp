#include <iostream>


using namespace std;

int main(int argc, char const *argv[]) {
  int row; cin >> row;
  int value = 1;
  for (size_t i = 0; i < row; i++) {
    for (size_t j = 0; j <= i; j++) {
      if(i == 0 || j == 0) {
        value = 1;
      } else {
        value = value * (i - j + 1) / j;
      }
      cout << value << " ";
    }
    cout << endl;
  }
  return 0;
}
