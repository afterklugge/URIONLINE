
#include <iostream>
#include <string>
#include <cctype>
#include <algorithm>


using namespace std;

int main() {

  iostream::sync_with_stdio(false);

  string msg;
  getline(cin, msg);

  string buf;
  for (char c: msg) {
    if(isalpha(c)){
      buf += tolower(c);
    }
  }

  string tmp = buf;
  reverse(tmp.begin(), tmp.end());

  std::cout << (tmp == buf ? "palindrome" : "is not palindrome") << '\n';
  return 0;
}
