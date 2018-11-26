#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
    double sum = 0;
    int numOfGrades = 0;
    
    cout << "enter grades (ctrl-z to stop): "
    int grade;
    while (cin >> grade)
    {
        sum += grade;
        ++numOfGrades;
    }
    
    if (numOfGrades != 0)
    {
        cout << "Average grade: "
             << fixed << setprecision(2) << sum / numOfGrades << endl;
    }
    else
    {
        cout << "no data" << endl;
    }
    
    return 0;
}