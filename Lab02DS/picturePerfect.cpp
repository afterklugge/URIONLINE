#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main() {

  int n;


  while (cin >> n) {
    int min = n * n;
    int lenght = 1000;
    int height = 1000;

    for (int i = 0; i < n; i++) {
      if(n % i == 0) {
        int temp = n / i; // 15 / 3 = 5
        int perimeter = (temp * 2) + (i * 2); // (5 * 2) + (3 * 2) = 16

        if(perimeter < temp){
          min = perimeter;
          lenght = temp;
          height = i;
        }
      }
    }

    cout << "Minimum perimeter is " << min << " with dimensions " << lenght << " x " << height << endl;
  }


  return 0;
  }
