#include <iostream>
#include <vector>

using namespace std;

int main() {
  int x, y; cin >> x >> y;
  vector<string> adjs;
  vector<string> noun;

  for (size_t i = 0; i < x; i++) {
    string adjectives; cin >> adjectives;
    adjs.push_back(adjectives);
  }
  for (size_t i = 0; i < y; i++) {
    string nouns; cin >> nouns;
    noun.push_back(nouns);
  }

  for (size_t i = 0; i < x; i++) {
    for (size_t j = 0; j < y; j++) {
      cout << adjs[i] << " as " << noun[j] << endl;
    }
  }
  return 0;
}
