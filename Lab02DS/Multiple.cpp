#include<iostream>
using namespace std;
int main(){
	int y, m;
	cin >> y >> m;

	if(y % m == 0){
		cout << "yes" << endl;
	} else {
		cout << "no" << endl;
	}
	return 0;
}
