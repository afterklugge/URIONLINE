#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<vector<int>> v = {
        {3, 1, 4, 5, 6},
        {1, 3, -2},
        {5, -1, 4, -4}
    };
    

    int row = 0;
    int col = 0;
    bool found = false;
    for (int i = 0; i < v.size(); ++i)
    {
        for (int j = 0; j < v[i].size(); ++j)
        {
            if (v[i][j] < 0)
            {
                row = i;
                col = j;
                found = true;
                goto brkForFor;
            }
        }
    }

brkForFor:
    if (found)
    {
        cout << "first negative value: " << v[row][col] << endl;
    }
    else
    {
        cout << "no negative numbers in this table" << endl;
    }
    
    return 0;
}