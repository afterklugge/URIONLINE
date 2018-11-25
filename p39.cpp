#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    vector<int> v = {5, 1, 3, 9, 11, 2, 20};
    
    auto it = find(v.begin(), v.end(), 11);
    if (it != v.end())
    {
        cout << "index of 11 is " << (it - v.begin()) << endl;
    }
    else
    {
        cout << "11 not found" << endl;
    }
    
    auto it2 = find_if(v.begin(), v.end(),
                       [](int e) {return e % 2 == 0;});
                       
    if (it2 != v.end())
    {
        cout << "first even number is " << *it2 << endl;
    }
    else
    {
        cout << "no even numbers in this vector" << endl;
    }
    
    
    return 0;
}