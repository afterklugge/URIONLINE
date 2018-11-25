#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {

  string b; cin >> b;
  string c; cin >> c;

  if(b != "RED" and c != "RED") cout << "RED" << endl;
  if(b != "BLUE" and c != "BLUE") cout << "BLUE" << endl;
  if(b != "WHITE" and c != "WHITE") cout << "WHITE" << endl;

  return 0;
}
