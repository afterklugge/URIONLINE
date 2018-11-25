#include <iostream>
#include <algorithm>
using namespace std;

 int main(int argc, char const *argv[]) {
  vector<int> v = {5, 1, 0, 2, 4, 0, 7};

  int nZeroes = count(v.begin(), v.end(), 0);

  cout << "Number of " << nZeroes << endl;

  // C++ 98
  vector<int>::iterator it = find(v.begin(), v.end(), 0); // Найди тип переменной

  //C++11

  auto it = find(v.begin(), v.end(), 0) // Найди тип переменной
  if(it != v.end()){
    cout << "index of 0: " << it - v.begin() << endl; // Найти индекс 0
  }

  // Найди мне максимальный элемент
  auto maxEl = max_element(v.begin(), v.end());

  if(maxEl != v.end()){
    cout << "max value in V: " << *maxEl << endl; // Найди мне позицию максимального элемента
  }

  return 0;
}
