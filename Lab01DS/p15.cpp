#include <iostream>


using namespace std;

int main()
{
    cout << "n: ";
    int n; cin >> n;

    int r = 0;
    int m = n;
    do
    {
        m /= 10;
        ++r;
    } while (m != 0);

    cout << n << " has " << r << " digit" << (r != 1 ? "s.": ".") << endl;

    return 0;
}
