#include <iostream>
#include <vector>
#include <algorithm>
#include <stdexcept>
#include <iomanip>

using namespace std;

double median(vector<double> data)
{
    if (data.empty())
    {
        throw invalid_argument("median of empty data is not defined");
    }
    
    sort(data.begin(), data.end());
    
    int i = data.size() / 2;
    
    return data.size() % 2 != 0 ? 
           data[i]: (data[i] + data[i - 1]) / 2;
}

int main()
{
    // C++11 init.
    vector<double> v1 = {31, 12, 60, 42, 51};
    // 12, 31, *42*, 51, 60
    vector<double> v2 = {31, 12, 60, 42};
    // 12, *31, + 42*, 60
    
    double m1 = median(v1);
    double m2 = median(v2);
    
    cout << fixed << setprecision(4) << m1 << endl;
    cout << fixed << setprecision(4) << m2 << endl;
    
    return 0;
}