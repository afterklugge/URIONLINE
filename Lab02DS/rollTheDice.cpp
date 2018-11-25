#include <iostream>

using namespace std;

int main(){

    int a,b,counter = 0;
	cin >> a;
	cin >> b;
    for(int i = 1; i <= a; i++) {
        for(int j = 1; j <= b; j++) {
            if(i + j == 10){
                counter++;
			}
		}
	}
    if (counter == 1) {
		cout << "There is 1 way to get the sum 10.";
	} else {
		cout << "There are " << counter << " ways to get the sum 10.";
	}
}
