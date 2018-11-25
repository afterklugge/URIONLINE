#include <iostream>

using namespace std;

int main()
{
    // 1st rectangle
    const int x1 = 100;
    const int y1 = 100;
    
    const int x2 = 300;
    const int y2 = 200;
    
    // 2nd rectangle
    const int x3 = 200;
    const int y3 = 150;
    
    const int x4 = 500;
    const int y4 = 300;
    
    cout << "x: ";
    int x; cin >> x;
    
    cout << "y: ";
    int y; cin >> y;
    
    bool inRect1 = x1 <= x and x <= x2 and
                   y1 <= y and y <= y2;

    bool inRect2 = x3 <= x and x <= x4 and
                   y3 <= y and y <= y4;
                   
    bool inSomeRect = inRect1 or inRect2;
    
    bool outOfRects = not inSomeRect;
   
    int numOfRects = 0;
    
    numOfRects += inRect1;
    numOfRects += inRect2;
    
    cout << boolalpha;
    cout << "in first rect: " << inRect1 << endl;
    cout << "in second rect: " << inRect2 << endl;
    cout << "in some rect: " << inSomeRect << endl;
    cout << "out of rects: " << outOfRects << endl;
    cout << "number of rects: " << numOfRects << endl;
   
    return 0;
}