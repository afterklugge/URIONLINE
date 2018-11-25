#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> v;
    v.reserve(4000);
    
    int n; cin >> n;
    
    
    cout << "capacity: " << v.capacity() << endl;
    cout << "size: " << v.size() << endl;
    
    for (int i = 1; i <= n; ++i)
    {
        v.push_back(i);
        cout << "capacity: " << v.capacity() << endl;
        cout << "size: " << v.size() << endl;
    }
    
    return 0;
}