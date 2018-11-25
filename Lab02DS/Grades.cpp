#include <iostream>


using namespace std;

int main() {
  int n; cin >> n;
  for (size_t i = 0; i < n; i++) {
    int grade; cin >> grade;
    if(grade >= 80 && grade <= 100){ cout << "A" << endl;}
    if(grade >= 70 && grade <= 79){ cout << "B" << endl;}
    if(grade >= 60 && grade <= 69){ cout << "C" << endl;}
    if(grade >= 50 && grade <= 59){ cout << "D" << endl;}
    if(grade >= 0 && grade <= 49){ cout << "F" << endl;}
    if(grade > 100){ cout << "X" << endl;}
  }

  return 0;
}
