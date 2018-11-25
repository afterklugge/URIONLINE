#include <iostream>
using namespace std;

int main() {
  string a;
  std::cin >> a;

  if (a == "MG") {
    std::cout << "midget girls" << '\n';
  } else if ("MB") {
    std::cout << "midget girls" << '\n';
  } else if ("JG") {
    std::cout << "junior girls" << '\n';
  } else if ("JB") {
    std::cout << "junior boys" << '\n';
  } else if ("SG") {
    std::cout << "senior girls" << '\n';
  } else if ("SB") {
    std::cout << "senior boys" << '\n';
  } else {
    std::cout << "invalid code" << '\n';
  }
  return 0;
}
