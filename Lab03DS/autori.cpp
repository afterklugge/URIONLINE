#include <iostream>


using namespace std;

int main(int argc, char const *argv[]) {

  string x;
  getline(cin, x);

  for(char e: x){
    if(isupper(e)) cout << e;
  }
  cout << endl;
  return 0;
}
