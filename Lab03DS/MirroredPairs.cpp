#include <iostream>
#include <string>

using namespace std;

int main() {
  cout << "Ready" << endl;
  string x;
  getline(cin, x);
  for(;;) {
    if(x == "  ") break;

    if(x == "qp" or x == "pq" or x == "bd" or x == "db") cout << "Mirrored pair" << endl;
    else cout << "Ordinary pair" << endl;

    getline(cin, x);
  }
  return 0;
}
