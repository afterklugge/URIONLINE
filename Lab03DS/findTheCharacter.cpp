#include <bits/stdc++.h>

using namespace std;

int main(int argc, char const *argv[]) {
  string x; getline(cin, x);
  string line; getline(cin, line);

  int counter1 = count(line.begin(), line.end(), x[0]);
  char m = toupper(x[0]);
  int counter2 = count(line.begin(), line.end(), m);

  cout << line << endl;
  cout << counter1+counter2 << endl;
  return 0;
}
