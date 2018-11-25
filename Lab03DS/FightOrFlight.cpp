#include <iostream>
#include <string>


using namespace std;

int main() {
  string c, t;
  cin >> c >> t;

  if(c == "Run" and t == "Run") cout << "Run" << endl;
  else if(c == "Fight" and t == "Fight") cout << "Fight" << endl;
  else cout << "Undecided" << endl;
  
  return 0;
}
