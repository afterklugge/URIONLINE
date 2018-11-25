#include <iostream>


using namespace std;

int main() {
  int a = 1;
  int b = 0;
  int c = 0;

  string text; cin >> text;
  for(char e: text){
    if(e == 'A') swap(a,b);
    else if(e == 'B') swap(b, c);
    else if(e == 'C') swap(a, c);
  }

  if(a == 1) cout << 1 << endl;
  else if(b == 1) cout << 2 << endl;
  else if(c == 1) cout << 3 << endl;

  return 0;
}
