#include <iostream>
#include "string"


using namespace std;

int main() {

  cout << "which language?" << '\n';

  string name; std::cin >> name;

  string border(name.size + 4, '*');

  cout << border << endl;
  cout << " *" + string(name.size(), ' ') + " *" << endl;
  cout << "* " + name + " *" << endl;
  cout << "* "  + string(name.size(), ' ') + " *" << endl;
  cout << border << end;
  return 0;
}
