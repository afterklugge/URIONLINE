#include <iostream>
#include <iomanip>
#include <vector>
#include <string>
#include <algorithm>
#include <cstdlib>
#include <ctime>

using namespace std;


int testLinearSearch(const vector<int>& v, int n)
{
    srand(0);
    
    int result = 0;
    for (int i = 0; i < n; ++i)
    {
        int e = rand();
        // O(n)
        result += find(v.begin(), v.end(), e) != v.end();
    }
    
    return result;
}

int testBinarySearch(const vector<int>& v, int n)
{
    srand(0);
    
    vector<int> t =  v;
    // O(n * log(n))
    sort(t.begin(), t.end());
    
    int result = 0;
    for (int i = 0; i < n; ++i)
    {
        int e = rand();
        // O(log(n))
        result += binary_search(t.begin(), t.end(), e);
    }
    
    return result;
}

int main()
{
    const int n = 100000;
    
    srand(0);
    
    vector<int> v;
    for (int i = 0; i < n; ++i)
    {
        v.push_back(rand());
    }

    clock_t beg1 = clock();
    int s1 = testLinearSearch(v, 2 * n);
    clock_t end1 = clock();
    cout << "Linear Search: " << s1 << ". Time: " << double(end1 - beg1) / CLOCKS_PER_SEC << endl;
    
    clock_t beg2 = clock();
    int s2 = testBinarySearch(v, 2 * n);
    clock_t end2 = clock();
    cout << "Binary Search: " << s2 << ". Time: " << double(end2 - beg2) / CLOCKS_PER_SEC << endl;
    
    return 0;
}