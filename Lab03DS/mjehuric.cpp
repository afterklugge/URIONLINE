  #include <iostream>
  #include <vector>
  #include <algorithm>

  using namespace std;

  int main() {

    int a, b, c, d, e;
    cin >> a >> b >> c >> d >> e;

    for(;;){

      if(a == 1 and b == 2 and c == 3 and d == 4 and e == 5) {
          break;
      }
      if (a > b) {
        swap(a, b);
        cout << a << " " << b << " " << c << " " << d << " " << e << " " << endl;
      }

      if(b > c) {
        swap(b, c);
        cout << a << " " << b << " " << c << " " << d << " " << e << " " << endl;
      }

      if(c > d) {
        swap(c, d);
        cout << a << " " << b << " " << c << " " << d << " " << e << " " << endl;
      }

      if(d > e) {
        swap(d, e);
        cout << a << " " << b << " " << c << " " << d << " " << e << " " << endl;
      }
    }

    return 0;
  }
