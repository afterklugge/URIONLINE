#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    string direction;
    string place;
    vector<string> directions;
    vector<string> places = {"HOME"};

    for(;;) {
        cin >> direction;
        cin >> place;
        if (direction == "R") directions.push_back("LEFT");
        else if (direction == "L") directions.push_back("RIGHT");
        if (place == "SCHOOL") break;
        places.push_back(place);
    }
    reverse(places.begin(), places.end());
    reverse(directions.begin(), directions.end());

    for (int i = 0; i < places.size()-1; ++i) {
        cout << "Turn " << directions[i] << " onto " << places[i] << " street." << endl;
    }
    cout << "Turn " << directions[directions.size()-1] << " into your HOME." << endl;

  return 0;
}
