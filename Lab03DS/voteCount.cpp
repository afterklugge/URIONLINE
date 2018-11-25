#include <iostream>
#include <vector>


using namespace std;

int main() {
  int a = 0, b = 0;
  int n; cin >> n;
  string vote; cin >> vote;

  for (char e: vote)  {
    if(e == 'A') a++;
    else if(e == 'B') b++;
  }

  if(a > b) cout << "A" << endl;
  else if(a < b) cout << "B" << endl;
  else if(a == b) cout << "Tie"  << endl;
  return 0;
}
